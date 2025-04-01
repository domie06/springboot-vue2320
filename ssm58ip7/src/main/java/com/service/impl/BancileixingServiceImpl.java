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


import com.dao.BancileixingDao;
import com.entity.BancileixingEntity;
import com.service.BancileixingService;
import com.entity.vo.BancileixingVO;
import com.entity.view.BancileixingView;

@Service("bancileixingService")
public class BancileixingServiceImpl extends ServiceImpl<BancileixingDao, BancileixingEntity> implements BancileixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BancileixingEntity> page = this.selectPage(
                new Query<BancileixingEntity>(params).getPage(),
                new EntityWrapper<BancileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BancileixingEntity> wrapper) {
		  Page<BancileixingView> page =new Query<BancileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BancileixingVO> selectListVO(Wrapper<BancileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BancileixingVO selectVO(Wrapper<BancileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BancileixingView> selectListView(Wrapper<BancileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BancileixingView selectView(Wrapper<BancileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
