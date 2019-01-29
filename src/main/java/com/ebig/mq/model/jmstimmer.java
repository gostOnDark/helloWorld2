package com.ebig.mq.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

import com.ebig.ebeit.framework.data.model.ColumntTitle;
import com.ebig.ebeit.framework.data.model.DefaultDTO;

/**
 * 
 * @author generator
 * 
 */
@Entity
@Table(name = "SYS_JMSTIMER")
public class JmsTimer extends DefaultDTO {
	/**
	* 定时任务标识
	*/
	@Id
	@GeneratedValue(generator="sequence")
	@GenericGenerator(strategy = "no", name = "sequence")
	@Column(name = "TIMERID")
	@ColumntTitle("定时任务标识")
	private java.lang.String timerid;
	
	/**
	* 任务名称
	*/
	@Column(name = "TIMER_NAME")
	@ColumntTitle("任务名称")
	private java.lang.String timer_name;
	
	/**
	* 执行间隔
	*/
	@Column(name = "TIMER_INTERVAL")
	@ColumntTitle("执行间隔")
	private java.lang.Integer timer_interval;
	
	/**
	* 创建人ID
	*/
	@Column(name = "CREMANID")
	@ColumntTitle("创建人ID")
	private java.lang.String cremanid;
	
	/**
	* 创建人名称
	*/
	@Column(name = "CREMANNAME")
	@ColumntTitle("创建人名称")
	private java.lang.String cremanname;
	
	/**
	* 备注
	*/
	@Column(name = "MEMO")
	@ColumntTitle("备注")
	private java.lang.String memo;
	
	/**
	* 创建时间
	*/
	@Column(name = "CREDATE")
	@ColumntTitle("创建时间")
	private java.sql.Timestamp credate;
	
	/**
	* 修改人ID
	*/
	@Column(name = "EDITMANID")
	@ColumntTitle("修改人ID")
	private java.lang.String editmanid;
	
	/**
	* 修改人
	*/
	@Column(name = "EDITMANNAME")
	@ColumntTitle("修改人")
	private java.lang.String editmanname;
	
	/**
	* 修改日期
	*/
	@Column(name = "EDITDATE")
	@ColumntTitle("修改日期")
	private java.sql.Timestamp editdate;
	
	/**
	* 执行sql
	*/
	@Column(name = "TIMER_SQL")
	@ColumntTitle("执行sql")
	private java.lang.String timer_sql;
	
	/**
	* 执行表名
	*/
	@Column(name = "TABLE_NAME")
	@ColumntTitle("执行表名")
	private java.lang.String table_name;
	
	/**
	* 是否启用
	*/
	@Column(name = "ISUSING")
	@ColumntTitle("是否启用")
	private java.lang.Integer isusing;
	
	/**
	* 最后执行时间
	*/
	@Column(name = "LAST_DATE")
	@ColumntTitle("最后执行时间")
	private java.sql.Timestamp last_date;
	
	
		public java.lang.String getTimerid(){
			return timerid;
		}
		
		public void setTimerid(java.lang.String timerid){
			this.timerid=timerid;
		}
	
	
	public java.lang.String getTimer_name(){
		return timer_name;
	}
	
	public void setTimer_name(java.lang.String timer_name){
		this.timer_name=timer_name;
	}
	
	public java.lang.Integer getTimer_interval(){
		return timer_interval;
	}
	
	public void setTimer_interval(java.lang.Integer timer_interval){
		this.timer_interval=timer_interval;
	}
	
	public java.lang.String getCremanid(){
		return cremanid;
	}
	
	public void setCremanid(java.lang.String cremanid){
		this.cremanid=cremanid;
	}
	
	public java.lang.String getCremanname(){
		return cremanname;
	}
	
	public void setCremanname(java.lang.String cremanname){
		this.cremanname=cremanname;
	}
	
	public java.lang.String getMemo(){
		return memo;
	}
	
	public void setMemo(java.lang.String memo){
		this.memo=memo;
	}
	
	public java.sql.Timestamp getCredate(){
		return credate;
	}
	
	public void setCredate(java.sql.Timestamp credate){
		this.credate=credate;
	}
	
	public java.lang.String getEditmanid(){
		return editmanid;
	}
	
	public void setEditmanid(java.lang.String editmanid){
		this.editmanid=editmanid;
	}
	
	public java.lang.String getEditmanname(){
		return editmanname;
	}
	
	public void setEditmanname(java.lang.String editmanname){
		this.editmanname=editmanname;
	}
	
	public java.sql.Timestamp getEditdate(){
		return editdate;
	}
	
	public void setEditdate(java.sql.Timestamp editdate){
		this.editdate=editdate;
	}
	
	public java.lang.String getTimer_sql(){
		return timer_sql;
	}
	
	public void setTimer_sql(java.lang.String timer_sql){
		this.timer_sql=timer_sql;
	}
	
	public java.lang.String getTable_name(){
		return table_name;
	}
	
	public void setTable_name(java.lang.String table_name){
		this.table_name=table_name;
	}
	
	public java.lang.Integer getIsusing(){
		return isusing;
	}
	
	public void setIsusing(java.lang.Integer isusing){
		this.isusing=isusing;
	}
	
	public java.sql.Timestamp getLast_date(){
		return last_date;
	}
	
	public void setLast_date(java.sql.Timestamp last_date){
		this.last_date=last_date;
	}
	
	/**
	* 覆盖hashCode
	*/
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result 
				+ ((timerid == null) ? 0 : timerid.hashCode());
		return result;
	}
	
	/**
	* 覆盖equals
	*/
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (!(obj instanceof JmsTimer)) {
			return false;
		}
		JmsTimer other = (JmsTimer) obj;
		Object otherTimerid = other.getTimerid();
		if (timerid == null) {
			if (otherTimerid != null){
				return false;
			}
		} else if (!timerid.equals(otherTimerid)) {
			return false;
		}
		return true;
		
	}
}
