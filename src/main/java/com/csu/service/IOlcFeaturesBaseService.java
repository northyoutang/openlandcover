package com.csu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csu.pojo.OlcFeaturesBase;
import com.csu.pojo.OlcFeaturesIncre;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
public interface IOlcFeaturesBaseService extends IService<OlcFeaturesBase> {

    List<OlcFeaturesBase> queryBaseList();

    List<Long> queryBaseIdList();

    void deleteBaseById(Long id);

    int insertBase(OlcFeaturesBase base);

    void copyTableToHistory();

    void dropHistoryTable();

    boolean queryById(Long id);

    String baseCutIncre(long baseId, long increId);
}
