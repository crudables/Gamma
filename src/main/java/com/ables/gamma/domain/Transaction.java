package com.ables.gamma.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	@Transient
	private LocalDateTime time;
	private Account recipient;
	@NotBlank
	@Column(unique=true)
	private String cardPin;
	@NotBlank
	@Column(unique=true)
	private String cardSerial;
	@NotBlank
	private String phoneNumber;
	private String netWorkType;
	private double amount;
	private double commission;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Account getRecipient() {
		return recipient;
	}
	public void setRecipient(Account recipient) {
		this.recipient = recipient;
	}
	public String getCardPin() {
		return cardPin;
	}
	public void setCardPin(String cardPin) {
		this.cardPin = cardPin;
	}
	public String getCardSerial() {
		return cardSerial;
	}
	public void setCardSerial(String cardSerial) {
		this.cardSerial = cardSerial;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNetWorkType() {
		return netWorkType;
	}
	public void setNetWorkType(String netWorkType) {
		this.netWorkType = netWorkType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	

}
