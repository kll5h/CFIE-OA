package com.shinetechchina.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.joda.time.DateTime;
import org.springframework.data.jpa.domain.AbstractAuditable;

@MappedSuperclass
public abstract class AbstractAuditableCancelable<U, PK extends Serializable> extends AbstractAuditable<U, PK> implements Cancelable<U, PK> {

	private static final long serialVersionUID = 836149810555211049L;

	@Column
	private Boolean canceled;

	@ManyToOne
	private U canceledBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date canceledDate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.entity.Cancelable#getCanceled()
	 */
	@Override
	public Boolean getCanceled() {
		return canceled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.entity.Cancelable#setCanceled(java.lang.Boolean)
	 */
	@Override
	public void setCanceled(final Boolean canceled) {
		this.canceled = canceled;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.entity.Cancelable#getCanceledBy()
	 */
	@Override
	public U getCanceledBy() {
		return canceledBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.entity.Cancelable#setCanceledBy(java.lang.Object)
	 */
	@Override
	public void setCanceledBy(final U canceledBy) {
		this.canceledBy = canceledBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.entity.Cancelable#getCanceledDate()
	 */
	@Override
	public DateTime getCanceledDate() {
		return null == canceledDate ? null : new DateTime(canceledDate);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shinetechchina.entity.Cancelable#setCanceledDate(org.joda.time.DateTime
	 * )
	 */
	@Override
	public void setCanceledDate(final DateTime canceledDate) {
		this.canceledDate = null == canceledDate ? null : canceledDate.toDate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.jpa.domain.AbstractPersistable#toString()
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
