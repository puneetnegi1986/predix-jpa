package com.ge.predix.labs.data.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class InvoiceHold implements Serializable {

	private static final long serialVersionUID = 1500516986755256732L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer holdId;
    private String holdReason ;
    private String holdResolution ;
    private String holdFaq;
    
	public Integer getHoldId() {
		return holdId;
	}
	public void setHoldId(Integer holdId) {
		this.holdId = holdId;
	}
	public String getHoldReason() {
		return holdReason;
	}
	public void setHoldReason(String holdReason) {
		this.holdReason = holdReason;
	}
	public String getHoldResolution() {
		return holdResolution;
	}
	public void setHoldResolution(String holdResolution) {
		this.holdResolution = holdResolution;
	}
	public String getHoldFaq() {
		return holdFaq;
	}
	public void setHoldFaq(String holdFaq) {
		this.holdFaq = holdFaq;
	}
   
}
