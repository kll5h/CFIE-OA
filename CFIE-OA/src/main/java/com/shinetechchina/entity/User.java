package com.shinetechchina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "USER")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends AbstractAuditableCancelable<User, Long> {

	private static final long serialVersionUID = -2336248559627107542L;

	@Column(name = "USERNAME", length = 100, nullable = false)
	private String username;

	@Column(name = "EMAIL", length = 100, nullable = false)
	private String email;

	@Column(name = "MOBILE_PHONE_NUMBER", length = 20)
	private String mobilePhoneNumber;

	@Column(name = "PASSWORD", length = 100)
	private String password;

	@Column(name = "SALT", length = 10)
	private String salt;

	@Column(name = "ADMIN")
	private Boolean admin;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

}
