package com.shinetechchina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "DEPARTMENT")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Department extends AbstractAuditableCancelable<User, Long> {

	private static final long serialVersionUID = -3810761672033627623L;

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

}
