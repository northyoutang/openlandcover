package com.csu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csu.pojo.OlcFeaturesBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
public interface OlcFeaturesBaseMapper extends BaseMapper<OlcFeaturesBase> {
    void copyTableToHistory();

    void dropHistoryTable();

    List<Long> queryBaseIdList();

    String baseCutIncre(@Param("baseId") long baseId, @Param("increId") long increId);
}
