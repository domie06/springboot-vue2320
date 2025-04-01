package com.dao;

import com.entity.KeyunbanciEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KeyunbanciVO;
import com.entity.view.KeyunbanciView;


/**
 * 客运班次
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface KeyunbanciDao extends BaseMapper<KeyunbanciEntity> {
	
	List<KeyunbanciVO> selectListVO(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
	
	KeyunbanciVO selectVO(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
	
	List<KeyunbanciView> selectListView(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);

	List<KeyunbanciView> selectListView(Pagination page,@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
	
	KeyunbanciView selectView(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
	
}
