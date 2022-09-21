package com.csu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csu.pojo.OlcFeaturesIncre;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
public interface IOlcFeaturesIncreService extends IService<OlcFeaturesIncre> {
    List<OlcFeaturesIncre> queryIncreList();

    String checkPolygonIntersect(Long increId, Long baseId);

}
