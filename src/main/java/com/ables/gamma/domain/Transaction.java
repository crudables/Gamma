package com.ables.gamma.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;

@Entity
public class Transaction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDateTime time;
	private Account recipient;
	private String cardPin;
	private String netWorkType;
	

}
