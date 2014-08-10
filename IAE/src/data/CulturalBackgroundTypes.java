package data;

import java.util.Set;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

/**
 * CulturalBackgroundTypes generated by hbm2java
 */
public class CulturalBackgroundTypes implements java.io.Serializable {

	private Integer id;
	private String culturalBackgroundName;
	private String culturalBackgroundDescription;
	private Set<Contacts> contactsSet;

	public CulturalBackgroundTypes() {
	}

	public CulturalBackgroundTypes(String culturalBackgroundName,
			String culturalBackgroundDescription) {
		this.culturalBackgroundName = culturalBackgroundName;
		this.culturalBackgroundDescription = culturalBackgroundDescription;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCulturalBackgroundName() {
		return this.culturalBackgroundName;
	}

	public void setCulturalBackgroundName(String culturalBackgroundName) {
		this.culturalBackgroundName = culturalBackgroundName;
	}

	public String getCulturalBackgroundDescription() {
		return this.culturalBackgroundDescription;
	}

	public void setCulturalBackgroundDescription(
			String culturalBackgroundDescription) {
		this.culturalBackgroundDescription = culturalBackgroundDescription;
	}

	public Set<Contacts> getContactsSet() {
		return contactsSet;
	}

	public void setContactsSet(Set<Contacts> contactsSet) {
		this.contactsSet = contactsSet;
	}

}
