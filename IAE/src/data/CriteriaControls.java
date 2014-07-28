package data;

// Generated Jul 28, 2014 4:20:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * CriteriaControls generated by hbm2java
 */
public class CriteriaControls implements java.io.Serializable {

	private Integer id;
	private String tableName;
	private String columnName;
	private String description;

	public CriteriaControls() {
	}

	public CriteriaControls(String tableName, String columnName,
			String description) {
		this.tableName = tableName;
		this.columnName = columnName;
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
