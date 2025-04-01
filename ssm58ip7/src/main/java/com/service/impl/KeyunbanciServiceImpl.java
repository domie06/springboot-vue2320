package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KeyunbanciDao;
import com.entity.KeyunbanciEntity;
import com.service.KeyunbanciService;
import com.entity.vo.KeyunbanciVO;
import com.entity.view.KeyunbanciView;

@Service("keyunbanciService")
public class KeyunbanciServiceImpl extends ServiceImpl<KeyunbanciDao, KeyunbanciEntity> implements KeyunbanciService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KeyunbanciEntity> page = this.selectPage(
                new Query<KeyunbanciEntity>(params).getPage(),
                new EntityWrapper<KeyunbanciEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KeyunbanciEntity> wrapper) {
		  Page<KeyunbanciView> page =new Query<KeyunbanciView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KeyunbanciVO> selectListVO(Wrapper<KeyunbanciEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KeyunbanciVO selectVO(Wrapper<KeyunbanciEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KeyunbanciView> selectListView(Wrapper<KeyunbanciEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KeyunbanciView selectView(Wrapper<KeyunbanciEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
