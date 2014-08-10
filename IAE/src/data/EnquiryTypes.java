package data;

import java.util.HashSet;
import java.util.Set;

// Generated Aug 6, 2014 9:58:18 PM by Hibernate Tools 3.4.0.CR1

/**
 * EnquiryTypes generated by hbm2java
 */
public class EnquiryTypes implements java.io.Serializable {

	private Integer id;
	private String enquiryTypeName;
	private String enquiryTypeDescription;
	private Set<EnquiryTypes> enquiriesSet = new HashSet<EnquiryTypes>();

	

	/**
	 * 
	 */
	public EnquiryTypes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param enquiryTypeName
	 * @param enquiryTypeDescription
	 * @param enquiriesSet
	 */
	public EnquiryTypes(Integer id, String enquiryTypeName,
			String enquiryTypeDescription, Set<EnquiryTypes> enquiriesSet) {
		this.id = id;
		this.enquiryTypeName = enquiryTypeName;
		this.enquiryTypeDescription = enquiryTypeDescription;
		this.enquiriesSet = enquiriesSet;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the enquiryTypeName
	 */
	public String getEnquiryTypeName() {
		return enquiryTypeName;
	}

	/**
	 * @param enquiryTypeName the enquiryTypeName to set
	 */
	public void setEnquiryTypeName(String enquiryTypeName) {
		this.enquiryTypeName = enquiryTypeName;
	}

	/**
	 * @return the enquiryTypeDescription
	 */
	public String getEnquiryTypeDescription() {
		return enquiryTypeDescription;
	}

	/**
	 * @param enquiryTypeDescription the enquiryTypeDescription to set
	 */
	public void setEnquiryTypeDescription(String enquiryTypeDescription) {
		this.enquiryTypeDescription = enquiryTypeDescription;
	}

	/**
	 * @return the enquiriesSet
	 */
	public Set<EnquiryTypes> getEnquiriesSet() {
		return enquiriesSet;
	}

	/**
	 * @param enquiriesSet the enquiriesSet to set
	 */
	public void setEnquiriesSet(Set<EnquiryTypes> enquiriesSet) {
		this.enquiriesSet = enquiriesSet;
	}

}
