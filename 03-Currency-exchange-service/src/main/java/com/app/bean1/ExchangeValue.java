package com.app.bean1;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Currecny_tab")
public class ExchangeValue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Currency_from")
	private String from;
	
	@Column(name = "Currency_to")
	private String to;
	
	@Column(name = "Conversion_multiple")
	private BigDecimal coversionMultiple;
	
	@Column(name = "port")
	private int port;
	
	public ExchangeValue() {
		
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal coversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.coversionMultiple = coversionMultiple;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getCoversionMultiple() {
		return coversionMultiple;
	}

	public void setCoversionMultiple(BigDecimal coversionMultiple) {
		this.coversionMultiple = coversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
