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


import com.dao.GoupiaojiluDao;
import com.entity.GoupiaojiluEntity;
import com.service.GoupiaojiluService;
import com.entity.vo.GoupiaojiluVO;
import com.entity.view.GoupiaojiluView;

@Service("goupiaojiluService")
public class GoupiaojiluServiceImpl extends ServiceImpl<GoupiaojiluDao, GoupiaojiluEntity> implements GoupiaojiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GoupiaojiluEntity> page = this.selectPage(
                new Query<GoupiaojiluEntity>(params).getPage(),
                new EntityWrapper<GoupiaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GoupiaojiluEntity> wrapper) {
		  Page<GoupiaojiluView> page =new Query<GoupiaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GoupiaojiluVO> selectListVO(Wrapper<GoupiaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GoupiaojiluVO selectVO(Wrapper<GoupiaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GoupiaojiluView> selectListView(Wrapper<GoupiaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GoupiaojiluView selectView(Wrapper<GoupiaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
