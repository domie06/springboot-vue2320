package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 客运班次
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
@TableName("keyunbanci")
public class KeyunbanciEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeyunbanciEntity() {
		
	}
	
	public KeyunbanciEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 班次名称
	 */
					
	private String bancimingcheng;
	
	/**
	 * 班次类型
	 */
					
	private String bancileixing;
	
	/**
	 * 车辆编号
	 */
					
	private String cheliangbianhao;
	
	/**
	 * 车辆名称
	 */
					
	private String cheliangmingcheng;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 车辆照片
	 */
					
	private String cheliangzhaopian;
	
	/**
	 * 出发站
	 */
					
	private String chufazhan;
	
	/**
	 * 到达站
	 */
					
	private String daodazhan;
	
	/**
	 * 发车时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date facheshijian;
	
	/**
	 * 票价
	 */
					
	private Integer piaojia;
	
	/**
	 * 已经发车
	 */
					
	private String yijingfache;
	
	/**
	 * 途径站点
	 */
					
	private String tujingzhandian;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：班次名称
	 */
	public void setBancimingcheng(String bancimingcheng) {
		this.bancimingcheng = bancimingcheng;
	}
	/**
	 * 获取：班次名称
	 */
	public String getBancimingcheng() {
		return bancimingcheng;
	}
	/**
	 * 设置：班次类型
	 */
	public void setBancileixing(String bancileixing) {
		this.bancileixing = bancileixing;
	}
	/**
	 * 获取：班次类型
	 */
	public String getBancileixing() {
		return bancileixing;
	}
	/**
	 * 设置：车辆编号
	 */
	public void setCheliangbianhao(String cheliangbianhao) {
		this.cheliangbianhao = cheliangbianhao;
	}
	/**
	 * 获取：车辆编号
	 */
	public String getCheliangbianhao() {
		return cheliangbianhao;
	}
	/**
	 * 设置：车辆名称
	 */
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	/**
	 * 获取：车辆名称
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
	/**
	 * 设置：车牌号
	 */
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
	/**
	 * 设置：车辆照片
	 */
	public void setCheliangzhaopian(String cheliangzhaopian) {
		this.cheliangzhaopian = cheliangzhaopian;
	}
	/**
	 * 获取：车辆照片
	 */
	public String getCheliangzhaopian() {
		return cheliangzhaopian;
	}
	/**
	 * 设置：出发站
	 */
	public void setChufazhan(String chufazhan) {
		this.chufazhan = chufazhan;
	}
	/**
	 * 获取：出发站
	 */
	public String getChufazhan() {
		return chufazhan;
	}
	/**
	 * 设置：到达站
	 */
	public void setDaodazhan(String daodazhan) {
		this.daodazhan = daodazhan;
	}
	/**
	 * 获取：到达站
	 */
	public String getDaodazhan() {
		return daodazhan;
	}
	/**
	 * 设置：发车时间
	 */
	public void setFacheshijian(Date facheshijian) {
		this.facheshijian = facheshijian;
	}
	/**
	 * 获取：发车时间
	 */
	public Date getFacheshijian() {
		return facheshijian;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(Integer piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public Integer getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：已经发车
	 */
	public void setYijingfache(String yijingfache) {
		this.yijingfache = yijingfache;
	}
	/**
	 * 获取：已经发车
	 */
	public String getYijingfache() {
		return yijingfache;
	}
	/**
	 * 设置：途径站点
	 */
	public void setTujingzhandian(String tujingzhandian) {
		this.tujingzhandian = tujingzhandian;
	}
	/**
	 * 获取：途径站点
	 */
	public String getTujingzhandian() {
		return tujingzhandian;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}

}
