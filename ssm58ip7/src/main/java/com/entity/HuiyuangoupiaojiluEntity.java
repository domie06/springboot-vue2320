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
 * 会员购票记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-02 18:43:53
 */
@TableName("huiyuangoupiaojilu")
public class HuiyuangoupiaojiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuangoupiaojiluEntity() {
		
	}
	
	public HuiyuangoupiaojiluEntity(T t) {
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
					
	private String facheshijian;
	
	/**
	 * 票数
	 */
					
	private String piaoshu;
	
	/**
	 * 票价
	 */
					
	private String piaojia;
	
	/**
	 * 折扣
	 */
					
	private Float zhekou;
	
	/**
	 * 总金额
	 */
					
	private String zongjine;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	public void setFacheshijian(String facheshijian) {
		this.facheshijian = facheshijian;
	}
	/**
	 * 获取：发车时间
	 */
	public String getFacheshijian() {
		return facheshijian;
	}
	/**
	 * 设置：票数
	 */
	public void setPiaoshu(String piaoshu) {
		this.piaoshu = piaoshu;
	}
	/**
	 * 获取：票数
	 */
	public String getPiaoshu() {
		return piaoshu;
	}
	/**
	 * 设置：票价
	 */
	public void setPiaojia(String piaojia) {
		this.piaojia = piaojia;
	}
	/**
	 * 获取：票价
	 */
	public String getPiaojia() {
		return piaojia;
	}
	/**
	 * 设置：折扣
	 */
	public void setZhekou(Float zhekou) {
		this.zhekou = zhekou;
	}
	/**
	 * 获取：折扣
	 */
	public Float getZhekou() {
		return zhekou;
	}
	/**
	 * 设置：总金额
	 */
	public void setZongjine(String zongjine) {
		this.zongjine = zongjine;
	}
	/**
	 * 获取：总金额
	 */
	public String getZongjine() {
		return zongjine;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
