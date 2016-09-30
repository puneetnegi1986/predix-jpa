package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Po implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Integer poNumber;
    @NotNull
    private Date poIssueDate;
    
	@OneToOne
	@JoinColumn(name = "orderId")
    private OrderData OrderData;

	public Integer getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(Integer poNumber) {
		this.poNumber = poNumber;
	}

	public Date getPoIssueDate() {
		return poIssueDate;
	}

	public void setPoIssueDate(Date poIssueDate) {
		this.poIssueDate = poIssueDate;
	}

	public OrderData getOrderData() {
		return OrderData;
	}

	public void setOrderData(OrderData orderData) {
		OrderData = orderData;
	}
}
