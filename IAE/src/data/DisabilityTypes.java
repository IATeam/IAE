package data;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

/**
 * DisabilityTypes generated by hbm2java
 */
public class DisabilityTypes implements java.io.Serializable {

	private Integer id;
	private String disabilityName;
	private String disabilityDescription;

	public DisabilityTypes() {
	}

	public DisabilityTypes(String disabilityName, String disabilityDescription) {
		this.disabilityName = disabilityName;
		this.disabilityDescription = disabilityDescription;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDisabilityName() {
		return this.disabilityName;
	}

	public void setDisabilityName(String disabilityName) {
		this.disabilityName = disabilityName;
	}

	public String getDisabilityDescription() {
		return this.disabilityDescription;
	}

	public void setDisabilityDescription(String disabilityDescription) {
		this.disabilityDescription = disabilityDescription;
	}

}
