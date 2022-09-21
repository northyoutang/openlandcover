package com.csu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csu.mapper.OlcFeaturesIncreMapper;
import com.csu.pojo.OlcFeaturesIncre;
import com.csu.service.IOlcFeaturesIncreService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
@Service
public class OlcFeaturesIncreServiceImpl extends ServiceImpl<OlcFeaturesIncreMapper, OlcFeaturesIncre> implements IOlcFeaturesIncreService {


    @Resource
    private OlcFeaturesIncreMapper increMapper;

    @Override
    public List<OlcFeaturesIncre> queryIncreList() {
        return increMapper.selectList(null);
    }

    @Override
    public String checkPolygonIntersect(Long increId, Long baseId) {
        return increMapper.checkPolygonIntersect(increId,baseId);
    }


}
