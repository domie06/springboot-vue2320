package com.dao;

import com.entity.BancileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BancileixingVO;
import com.entity.view.BancileixingView;


/**
 * 班次类型
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface BancileixingDao extends BaseMapper<BancileixingEntity> {
	
	List<BancileixingVO> selectListVO(@Param("ew") Wrapper<BancileixingEntity> wrapper);
	
	BancileixingVO selectVO(@Param("ew") Wrapper<BancileixingEntity> wrapper);
	
	List<BancileixingView> selectListView(@Param("ew") Wrapper<BancileixingEntity> wrapper);

	List<BancileixingView> selectListView(Pagination page,@Param("ew") Wrapper<BancileixingEntity> wrapper);
	
	BancileixingView selectView(@Param("ew") Wrapper<BancileixingEntity> wrapper);
	
}
