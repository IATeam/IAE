package data;

// Generated Jul 28, 2014 4:20:23 PM by Hibernate Tools 3.4.0.CR1

/**
 * UserRoles generated by hbm2java
 */
public class UserRoles implements java.io.Serializable {

	private Integer id;
	private Integer userId;
	private Integer roleId;

	public UserRoles() {
	}

	public UserRoles(Integer userId, Integer roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
