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


import com.dao.HuiyuangoupiaojiluDao;
import com.entity.HuiyuangoupiaojiluEntity;
import com.service.HuiyuangoupiaojiluService;
import com.entity.vo.HuiyuangoupiaojiluVO;
import com.entity.view.HuiyuangoupiaojiluView;

@Service("huiyuangoupiaojiluService")
public class HuiyuangoupiaojiluServiceImpl extends ServiceImpl<HuiyuangoupiaojiluDao, HuiyuangoupiaojiluEntity> implements HuiyuangoupiaojiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuangoupiaojiluEntity> page = this.selectPage(
                new Query<HuiyuangoupiaojiluEntity>(params).getPage(),
                new EntityWrapper<HuiyuangoupiaojiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuangoupiaojiluEntity> wrapper) {
		  Page<HuiyuangoupiaojiluView> page =new Query<HuiyuangoupiaojiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuangoupiaojiluVO> selectListVO(Wrapper<HuiyuangoupiaojiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuangoupiaojiluVO selectVO(Wrapper<HuiyuangoupiaojiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuangoupiaojiluView> selectListView(Wrapper<HuiyuangoupiaojiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuangoupiaojiluView selectView(Wrapper<HuiyuangoupiaojiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
