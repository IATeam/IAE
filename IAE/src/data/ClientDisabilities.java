package data;

// Generated Jul 28, 2014 4:20:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * ClientDisabilities generated by hbm2java
 */
public class ClientDisabilities implements java.io.Serializable {

	private Integer id;
	private Integer contactId;
	private Integer disabilityId;
	private String comments;
	private String primary_flag;

	public String getPrimary_flag() {
		return primary_flag;
	}

	public void setPrimary_flag(String primary_flag) {
		this.primary_flag = primary_flag;
	}

	public ClientDisabilities() {
	}

	public ClientDisabilities(Integer contactId, Integer disabilityId,
			String comments) {
		this.contactId = contactId;
		this.disabilityId = disabilityId;
		this.comments = comments;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public Integer getDisabilityId() {
		return this.disabilityId;
	}

	public void setDisabilityId(Integer disabilityId) {
		this.disabilityId = disabilityId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}