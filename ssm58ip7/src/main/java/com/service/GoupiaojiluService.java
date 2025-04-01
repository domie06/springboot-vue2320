package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GoupiaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GoupiaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GoupiaojiluView;


/**
 * 购票记录
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface GoupiaojiluService extends IService<GoupiaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GoupiaojiluVO> selectListVO(Wrapper<GoupiaojiluEntity> wrapper);
   	
   	GoupiaojiluVO selectVO(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
   	
   	List<GoupiaojiluView> selectListView(Wrapper<GoupiaojiluEntity> wrapper);
   	
   	GoupiaojiluView selectView(@Param("ew") Wrapper<GoupiaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GoupiaojiluEntity> wrapper);
   	
}

