package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuangoupiaojiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuangoupiaojiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuangoupiaojiluView;


/**
 * 会员购票记录
 *
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
public interface HuiyuangoupiaojiluService extends IService<HuiyuangoupiaojiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuangoupiaojiluVO> selectListVO(Wrapper<HuiyuangoupiaojiluEntity> wrapper);
   	
   	HuiyuangoupiaojiluVO selectVO(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
   	
   	List<HuiyuangoupiaojiluView> selectListView(Wrapper<HuiyuangoupiaojiluEntity> wrapper);
   	
   	HuiyuangoupiaojiluView selectView(@Param("ew") Wrapper<HuiyuangoupiaojiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuangoupiaojiluEntity> wrapper);
   	
}

