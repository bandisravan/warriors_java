package com.ing.domain;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="submit_stock")
public class BankInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accid;
	private int custId;
	private Double balance;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime=new Date();
	private String type;
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
	
	
	
	
		
	
}
