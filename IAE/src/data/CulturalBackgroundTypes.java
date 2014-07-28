package data;

// Generated Jul 28, 2014 4:20:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * CulturalBackgroundTypes generated by hbm2java
 */
public class CulturalBackgroundTypes implements java.io.Serializable {

	private Integer id;
	private String culturalBackgroundName;
	private String culturalBackgroundDescription;

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

}
