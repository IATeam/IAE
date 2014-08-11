package data;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * IndividualCasesHistories generated by hbm2java
 */
public class IndividualCasesHistories implements java.io.Serializable {

	private Integer id;
	private Date timestamp;
	private String action;
	private int changeOrder;
	private int caseId;
	private Integer clientId;
	private Integer advocateId;
	private Integer caseStatusId;
	private String description;
	private Integer priorityId;
	private Integer serviceProviderId;
	private String referredTo;
	private Integer oldCaseId;
	private int createdUserId;

	public IndividualCasesHistories() {
	}

	public IndividualCasesHistories(String action, int changeOrder, int caseId,
			int createdUserId) {
		this.action = action;
		this.changeOrder = changeOrder;
		this.caseId = caseId;
		this.createdUserId = createdUserId;
	}

	public IndividualCasesHistories(String action, int changeOrder, int caseId,
			Integer clientId, Integer advocateId, Integer caseStatusId,
			String description, Integer priorityId, Integer serviceProviderId,
			String referredTo, Integer oldCaseId, int createdUserId) {
		this.action = action;
		this.changeOrder = changeOrder;
		this.caseId = caseId;
		this.clientId = clientId;
		this.advocateId = advocateId;
		this.caseStatusId = caseStatusId;
		this.description = description;
		this.priorityId = priorityId;
		this.serviceProviderId = serviceProviderId;
		this.referredTo = referredTo;
		this.oldCaseId = oldCaseId;
		this.createdUserId = createdUserId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getChangeOrder() {
		return this.changeOrder;
	}

	public void setChangeOrder(int changeOrder) {
		this.changeOrder = changeOrder;
	}

	public int getCaseId() {
		return this.caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public Integer getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getAdvocateId() {
		return this.advocateId;
	}

	public void setAdvocateId(Integer advocateId) {
		this.advocateId = advocateId;
	}

	public Integer getCaseStatusId() {
		return this.caseStatusId;
	}

	public void setCaseStatusId(Integer caseStatusId) {
		this.caseStatusId = caseStatusId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriorityId() {
		return this.priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	public Integer getServiceProviderId() {
		return this.serviceProviderId;
	}

	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public String getReferredTo() {
		return this.referredTo;
	}

	public void setReferredTo(String referredTo) {
		this.referredTo = referredTo;
	}

	public Integer getOldCaseId() {
		return this.oldCaseId;
	}

	public void setOldCaseId(Integer oldCaseId) {
		this.oldCaseId = oldCaseId;
	}

	public int getCreatedUserId() {
		return this.createdUserId;
	}

	public void setCreatedUserId(int createdUserId) {
		this.createdUserId = createdUserId;
	}

}
