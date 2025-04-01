package com.entity.view;

import com.entity.HuiyuangoupiaojiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员购票记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
@TableName("huiyuangoupiaojilu")
public class HuiyuangoupiaojiluView  extends HuiyuangoupiaojiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuangoupiaojiluView(){
	}
 
 	public HuiyuangoupiaojiluView(HuiyuangoupiaojiluEntity huiyuangoupiaojiluEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuangoupiaojiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
