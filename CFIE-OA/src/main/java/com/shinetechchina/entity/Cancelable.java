package com.shinetechchina.entity;

import java.io.Serializable;

import org.joda.time.DateTime;
import org.springframework.data.domain.Persistable;

public interface Cancelable<U, ID extends Serializable> extends Persistable<ID> {

	/**
	 * Returns the status of the canceled.
	 * 
	 * @return the canceled
	 */
	Boolean getCanceled();

	/**
	 * Sets the status of the canceled.
	 * 
	 * @param canceled
	 *            the status of canceled to set
	 */
	void setCanceled(final Boolean canceled);

	/**
	 * Returns the user who canceled the entity.
	 * 
	 * @return the canceledBy
	 */
	U getCanceledBy();

	/**
	 * Sets the user who canceled the entity.
	 * 
	 * @param canceledBy
	 *            entity to set
	 */
	void setCanceledBy(final U canceledBy);

	/**
	 * Returns the date of the canceled.
	 * 
	 * @return the canceledDate
	 */
	DateTime getCanceledDate();

	/**
	 * Sets the date of the canceled.
	 * 
	 * @param canceledDate
	 *            the date of canceled to set
	 */
	void setCanceledDate(final DateTime canceledDate);
}
