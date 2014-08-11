package data;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ContactsHistories generated by hbm2java
 */
public class ContactsHistories implements java.io.Serializable {

	private Integer id;
	private Date timestamp;
	private String action;
	private int changeOrder;
	private int contactId;
	private Integer titleId;
	private String firstname;
	private String lastname;
	private String othername;
	private Integer genderId;
	private Integer contactTypeId;
	private String homephone;
	private String workphone;
	private String mobilephone;
	private String email;
	private Integer accommodationId;
	private String accommodationComment;
	private Integer employmentId;
	private String employmentComment;
	private Integer culturalBackgroundId;
	private String culturalBackgroundComment;
	private Integer dangerFlagId;
	private String identification;
	private Date dob;
	private int createdUserId;

	public ContactsHistories() {
	}

	public ContactsHistories(String action, int changeOrder, int contactId,
			int createdUserId) {
		this.action = action;
		this.changeOrder = changeOrder;
		this.contactId = contactId;
		this.createdUserId = createdUserId;
	}

	public ContactsHistories(String action, int changeOrder, int contactId,
			Integer titleId, String firstname, String lastname,
			String othername, Integer genderId, Integer contactTypeId,
			String homephone, String workphone, String mobilephone,
			String email, Integer accommodationId, String accommodationComment,
			Integer employmentId, String employmentComment,
			Integer culturalBackgroundId, String culturalBackgroundComment,
			Integer dangerFlagId, String identification, Date dob,
			int createdUserId) {
		this.action = action;
		this.changeOrder = changeOrder;
		this.contactId = contactId;
		this.titleId = titleId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.othername = othername;
		this.genderId = genderId;
		this.contactTypeId = contactTypeId;
		this.homephone = homephone;
		this.workphone = workphone;
		this.mobilephone = mobilephone;
		this.email = email;
		this.accommodationId = accommodationId;
		this.accommodationComment = accommodationComment;
		this.employmentId = employmentId;
		this.employmentComment = employmentComment;
		this.culturalBackgroundId = culturalBackgroundId;
		this.culturalBackgroundComment = culturalBackgroundComment;
		this.dangerFlagId = dangerFlagId;
		this.identification = identification;
		this.dob = dob;
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

	public int getContactId() {
		return this.contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public Integer getTitleId() {
		return this.titleId;
	}

	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getOthername() {
		return this.othername;
	}

	public void setOthername(String othername) {
		this.othername = othername;
	}

	public Integer getGenderId() {
		return this.genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public Integer getContactTypeId() {
		return this.contactTypeId;
	}

	public void setContactTypeId(Integer contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getWorkphone() {
		return this.workphone;
	}

	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}

	public String getMobilephone() {
		return this.mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAccommodationId() {
		return this.accommodationId;
	}

	public void setAccommodationId(Integer accommodationId) {
		this.accommodationId = accommodationId;
	}

	public String getAccommodationComment() {
		return this.accommodationComment;
	}

	public void setAccommodationComment(String accommodationComment) {
		this.accommodationComment = accommodationComment;
	}

	public Integer getEmploymentId() {
		return this.employmentId;
	}

	public void setEmploymentId(Integer employmentId) {
		this.employmentId = employmentId;
	}

	public String getEmploymentComment() {
		return this.employmentComment;
	}

	public void setEmploymentComment(String employmentComment) {
		this.employmentComment = employmentComment;
	}

	public Integer getCulturalBackgroundId() {
		return this.culturalBackgroundId;
	}

	public void setCulturalBackgroundId(Integer culturalBackgroundId) {
		this.culturalBackgroundId = culturalBackgroundId;
	}

	public String getCulturalBackgroundComment() {
		return this.culturalBackgroundComment;
	}

	public void setCulturalBackgroundComment(String culturalBackgroundComment) {
		this.culturalBackgroundComment = culturalBackgroundComment;
	}

	public Integer getDangerFlagId() {
		return this.dangerFlagId;
	}

	public void setDangerFlagId(Integer dangerFlagId) {
		this.dangerFlagId = dangerFlagId;
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getCreatedUserId() {
		return this.createdUserId;
	}

	public void setCreatedUserId(int createdUserId) {
		this.createdUserId = createdUserId;
	}

}
