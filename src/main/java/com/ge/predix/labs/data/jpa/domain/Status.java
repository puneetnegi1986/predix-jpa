package com.ge.predix.labs.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Status implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inoiceId;
    @NotNull
    private String invoiceStatus;
    @NotNull
    private Date statusFromDate;
    @NotNull
    private Date statusToDate;
    
	@ManyToOne
	@JoinColumn(name = "holdId")
    private InvoiceHold invoiceHold;

	public Integer getInoiceId() {
		return inoiceId;
	}

	public void setInoiceId(Integer inoiceId) {
		this.inoiceId = inoiceId;
	}

	public String getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(String invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Date getStatusFromDate() {
		return statusFromDate;
	}

	public void setStatusFromDate(Date statusFromDate) {
		this.statusFromDate = statusFromDate;
	}

	public Date getStatusToDate() {
		return statusToDate;
	}

	public void setStatusToDate(Date statusToDate) {
		this.statusToDate = statusToDate;
	}

	public InvoiceHold getInvoiceHold() {
		return invoiceHold;
	}

	public void setInvoiceHold(InvoiceHold invoiceHold) {
		this.invoiceHold = invoiceHold;
	}
}
