package data;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PlanGoalsHistories generated by hbm2java
 */
public class PlanGoalsHistories implements java.io.Serializable {

	private Integer id;
	private Date timestamp;
	private String action;
	private int planGoalId;
	private Integer planId;
	private Integer oldGoalTypeId;
	private Integer newGoalTypeId;
	private Date oldCompletionDateTime;
	private Date newCompletionDateTime;
	private String oldGoalDescription;
	private String newGoalDescription;
	private String oldGoalAction;
	private String newGoalAction;
	private Integer createdUserId;

	public PlanGoalsHistories() {
	}

	public PlanGoalsHistories(String action, int planGoalId) {
		this.action = action;
		this.planGoalId = planGoalId;
	}

	public PlanGoalsHistories(String action, int planGoalId, Integer planId,
			Integer oldGoalTypeId, Integer newGoalTypeId,
			Date oldCompletionDateTime, Date newCompletionDateTime,
			String oldGoalDescription, String newGoalDescription,
			String oldGoalAction, String newGoalAction, Integer createdUserId) {
		this.action = action;
		this.planGoalId = planGoalId;
		this.planId = planId;
		this.oldGoalTypeId = oldGoalTypeId;
		this.newGoalTypeId = newGoalTypeId;
		this.oldCompletionDateTime = oldCompletionDateTime;
		this.newCompletionDateTime = newCompletionDateTime;
		this.oldGoalDescription = oldGoalDescription;
		this.newGoalDescription = newGoalDescription;
		this.oldGoalAction = oldGoalAction;
		this.newGoalAction = newGoalAction;
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

	public int getPlanGoalId() {
		return this.planGoalId;
	}

	public void setPlanGoalId(int planGoalId) {
		this.planGoalId = planGoalId;
	}

	public Integer getPlanId() {
		return this.planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public Integer getOldGoalTypeId() {
		return this.oldGoalTypeId;
	}

	public void setOldGoalTypeId(Integer oldGoalTypeId) {
		this.oldGoalTypeId = oldGoalTypeId;
	}

	public Integer getNewGoalTypeId() {
		return this.newGoalTypeId;
	}

	public void setNewGoalTypeId(Integer newGoalTypeId) {
		this.newGoalTypeId = newGoalTypeId;
	}

	public Date getOldCompletionDateTime() {
		return this.oldCompletionDateTime;
	}

	public void setOldCompletionDateTime(Date oldCompletionDateTime) {
		this.oldCompletionDateTime = oldCompletionDateTime;
	}

	public Date getNewCompletionDateTime() {
		return this.newCompletionDateTime;
	}

	public void setNewCompletionDateTime(Date newCompletionDateTime) {
		this.newCompletionDateTime = newCompletionDateTime;
	}

	public String getOldGoalDescription() {
		return this.oldGoalDescription;
	}

	public void setOldGoalDescription(String oldGoalDescription) {
		this.oldGoalDescription = oldGoalDescription;
	}

	public String getNewGoalDescription() {
		return this.newGoalDescription;
	}

	public void setNewGoalDescription(String newGoalDescription) {
		this.newGoalDescription = newGoalDescription;
	}

	public String getOldGoalAction() {
		return this.oldGoalAction;
	}

	public void setOldGoalAction(String oldGoalAction) {
		this.oldGoalAction = oldGoalAction;
	}

	public String getNewGoalAction() {
		return this.newGoalAction;
	}

	public void setNewGoalAction(String newGoalAction) {
		this.newGoalAction = newGoalAction;
	}

	public Integer getCreatedUserId() {
		return this.createdUserId;
	}

	public void setCreatedUserId(Integer createdUserId) {
		this.createdUserId = createdUserId;
	}

}
