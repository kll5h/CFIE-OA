package com.shinetechchina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "POSITION")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Position extends AbstractAuditableCancelable<User, Long> {

	private static final long serialVersionUID = 9040925059814242805L;

	@Column(name = "NAME", length = 100, nullable = false)
	private String name;

	@Column(name = "PARENT_ID")
	private Long parentId;

	@Column(name = "PARENT_IDS", length = 200)
	private String parentIds;

	@Column(name = "ICON")
	private Byte[] icon;

	@Column(name = "WEIGHT")
	private Integer weight;

	@Column(name = "SHOWED")
	private Boolean showed;

	@Column(name = "MIN_NUMBER", nullable = false)
	private Integer minNumber;

	@Column(name = "MAX_NUMBER", nullable = false)
	private Integer maxNumber;

	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Department departmentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public Byte[] getIcon() {
		return icon;
	}

	public void setIcon(Byte[] icon) {
		this.icon = icon;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Boolean getShowed() {
		return showed;
	}

	public void setShowed(Boolean showed) {
		this.showed = showed;
	}

	public Integer getMinNumber() {
		return minNumber;
	}

	public void setMinNumber(Integer minNumber) {
		this.minNumber = minNumber;
	}

	public Integer getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(Integer maxNumber) {
		this.maxNumber = maxNumber;
	}

	public Department getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}

}
