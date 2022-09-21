package com.csu.controller;

import com.csu.pojo.OlcFeaturesBase;
import com.csu.pojo.OlcFeaturesIncre;
import com.csu.service.IOlcFeaturesBaseService;
import com.csu.service.IOlcFeaturesIncreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Controller
public class UpdateController {

    @Resource
    private IOlcFeaturesBaseService baseService;
    @Resource
    private IOlcFeaturesIncreService increService;

    private static Random random = new Random();


    @RequestMapping("/toUpdate")
    @ResponseBody
    public String toModifyShape() {
        baseService.dropHistoryTable();
        baseService.copyTableToHistory();
        List<OlcFeaturesIncre> increList = increService.queryIncreList();
        for (OlcFeaturesIncre increObj : increList) {
            List<Long> baseIdList = baseService.queryBaseIdList();
            for (Long baseId : baseIdList) {
                if (increService.checkPolygonIntersect(increObj.getId(), baseId).equals("t")) {
                    OlcFeaturesBase baseObj = baseService.getById(baseId);
                    String newGeom = baseService.baseCutIncre(baseId, increObj.getId());
                    baseObj.setGeom(newGeom);
                    baseService.updateById(baseObj);
                }
            }
            String changeType = increObj.getChangeType().toLowerCase();
            if (changeType.equals("create") || changeType.equals("modify")) {
                updateForCreate(increObj);
            }
            System.out.println("增量：" + increObj.getId() + ",类型：" + increObj.getFeatureName() + "更新成功");
        }
        System.out.println("更新完毕！！");
        return "Update Success";
    }


    /***
     * 将增量多边形插入基态多边形库中
     * @param incre 增量多边形
     */
    public void updateForCreate(OlcFeaturesIncre incre) {
        OlcFeaturesBase baseObj = new OlcFeaturesBase();
        long id = random.nextInt(Integer.MAX_VALUE);
        while (!baseService.queryById(id)) {
            id = random.nextLong();
        }
        baseObj.setId(id);
        baseObj.setFeatureId(incre.getFeatureId());
        baseObj.setUserId(incre.getUserId());
        baseObj.setFeatureName(incre.getFeatureName());
        baseObj.setUpdateTime(incre.getUpdateTime());
        baseObj.setGeom(incre.getGeom());
        baseObj.setAiPrecison(incre.getAiPrecison());
        baseObj.setVersion(incre.getVersion());
        baseObj.setTag(incre.getTag());
        baseService.insertBase(baseObj);
    }


}
