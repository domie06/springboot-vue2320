package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyunbanciEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyunbanciVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyunbanciView;


/**
 * 客运班次
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface KeyunbanciService extends IService<KeyunbanciEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyunbanciVO> selectListVO(Wrapper<KeyunbanciEntity> wrapper);
   	
   	KeyunbanciVO selectVO(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
   	
   	List<KeyunbanciView> selectListView(Wrapper<KeyunbanciEntity> wrapper);
   	
   	KeyunbanciView selectView(@Param("ew") Wrapper<KeyunbanciEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyunbanciEntity> wrapper);
   	
}

