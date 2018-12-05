package com.revature.form;

import java.time.temporal.Temporal;

enum Status{
	DIRECT,
	HEAD,
	BENCO,
	PROOF,
}

enum ReimbursementType{
	UC,
	Seminar,
	CP,
	C,
	TT,
	Other,
}

public class TuitionForm {
	private int requestor;
	private int formID;
	private Temporal Date;
	private String description;
	private ReimbursementType formType;
	private int currentApprover;
	private Status currentStatus;
	private double amount;
	private String location;
	
	
	public TuitionForm(int requestor, Temporal date, String description, ReimbursementType formType,
			int currentApprover, Status currentStatus, double amount, String location) {
		super();
		this.requestor = requestor;
		this.formID = formID;
		Date = date;
		this.description = description;
		this.formType = formType;
		this.currentApprover = currentApprover;
		this.currentStatus = currentStatus;
		this.amount = amount;
		this.location = location;
	}
	public ReimbursementType getFormType() {
		return formType;
	}
	public void setFormType(ReimbursementType formType) {
		this.formType = formType;
	}
	public Status getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(Status currentStatus) {
		this.currentStatus = currentStatus;
	}
	public int getRequestor() {
		return requestor;
	}
	public void setRequestor(int requestor) {
		this.requestor = requestor;
	}
	public int getCurrentApprover() {
		return currentApprover;
	}
	public void setCurrentApprover(int currentApprover) {
		this.currentApprover = currentApprover;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Temporal getDate() {
		return Date;
	}
	public void setDate(Temporal date) {
		Date = date;
	}
	
	
}
