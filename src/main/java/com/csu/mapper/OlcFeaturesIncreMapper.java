package com.csu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csu.pojo.OlcFeaturesIncre;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
public interface OlcFeaturesIncreMapper extends BaseMapper<OlcFeaturesIncre> {
    String checkPolygonIntersect(@Param("increId") Long increId,@Param("baseId") Long baseId);
}
