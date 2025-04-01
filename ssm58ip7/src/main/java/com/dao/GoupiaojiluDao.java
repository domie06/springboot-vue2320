package com.dao;

import com.entity.GoupiaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GoupiaojiluVO;
import com.entity.view.GoupiaojiluView;


/**
 * 购票记录
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface GoupiaojiluDao extends BaseMapper<GoupiaojiluEntity> {
	
	List<GoupiaojiluVO> selectListVO(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
	
	GoupiaojiluVO selectVO(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
	
	List<GoupiaojiluView> selectListView(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);

	List<GoupiaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
	
	GoupiaojiluView selectView(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
	
}
