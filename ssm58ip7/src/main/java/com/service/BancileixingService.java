package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BancileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BancileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BancileixingView;


/**
 * 班次类型
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface BancileixingService extends IService<BancileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BancileixingVO> selectListVO(Wrapper<BancileixingEntity> wrapper);
   	
   	BancileixingVO selectVO(@Param("ew") Wrapper<BancileixingEntity> wrapper);
   	
   	List<BancileixingView> selectListView(Wrapper<BancileixingEntity> wrapper);
   	
   	BancileixingView selectView(@Param("ew") Wrapper<BancileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BancileixingEntity> wrapper);
   	
}

