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
	private LocalDateTime transactionTime;
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
	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(LocalDateTime time) {
		this.transactionTime = time;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardPin == null) ? 0 : cardPin.hashCode());
		result = prime * result + ((cardSerial == null) ? 0 : cardSerial.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (cardPin == null) {
			if (other.cardPin != null)
				return false;
		} else if (!cardPin.equals(other.cardPin))
			return false;
		if (cardSerial == null) {
			if (other.cardSerial != null)
				return false;
		} else if (!cardSerial.equals(other.cardSerial))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Transaction [transactionTime=" + transactionTime + ", recipient=" + recipient + ", cardPin=" + cardPin
				+ ", phoneNumber=" + phoneNumber + ", amount=" + amount + ", commission=" + commission + "]";
	}
	

}
