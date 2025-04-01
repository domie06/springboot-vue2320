package com.dao;

import com.entity.HuiyuangoupiaojiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuangoupiaojiluVO;
import com.entity.view.HuiyuangoupiaojiluView;


/**
 * 会员购票记录
 * 
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface HuiyuangoupiaojiluDao extends BaseMapper<HuiyuangoupiaojiluEntity> {
	
	List<HuiyuangoupiaojiluVO> selectListVO(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
	
	HuiyuangoupiaojiluVO selectVO(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
	
	List<HuiyuangoupiaojiluView> selectListView(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);

	List<HuiyuangoupiaojiluView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
	
	HuiyuangoupiaojiluView selectView(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
	
}
