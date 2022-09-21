package com.csu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csu.mapper.OlcFeaturesBaseMapper;
import com.csu.mapper.OlcFeaturesIncreMapper;
import com.csu.pojo.OlcFeaturesBase;
import com.csu.pojo.OlcFeaturesIncre;
import com.csu.service.IOlcFeaturesBaseService;
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
public class OlcFeaturesBaseServiceImpl extends ServiceImpl<OlcFeaturesBaseMapper, OlcFeaturesBase> implements IOlcFeaturesBaseService {

    @Resource
    private OlcFeaturesBaseMapper baseMapper;

    @Override
    public List<OlcFeaturesBase> queryBaseList() {
        return baseMapper.selectList(null);
    }

    @Override
    public List<Long> queryBaseIdList() {
        return baseMapper.queryBaseIdList();
    }

    @Override
    public void deleteBaseById(Long id) {
        baseMapper.deleteById(id);
    }

    @Override
    public int insertBase(OlcFeaturesBase base) {
        return baseMapper.insert(base);
    }

    @Override
    public void copyTableToHistory() {
        baseMapper.copyTableToHistory();
    }

    @Override
    public void dropHistoryTable() {
        baseMapper.dropHistoryTable();
    }

    @Override
    public boolean queryById(Long id) {
        return baseMapper.selectById(id) == null;
    }

    @Override
    public String baseCutIncre(long baseId, long increId) {
        return null;
    }


}
