package data;

// Generated Jul 28, 2014 4:20:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * PriorityTypes generated by hbm2java
 */
public class PriorityTypes implements java.io.Serializable {

	private Integer id;
	private String priorityName;

	public PriorityTypes() {
	}

	public PriorityTypes(String priorityName) {
		this.priorityName = priorityName;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPriorityName() {
		return this.priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

}
