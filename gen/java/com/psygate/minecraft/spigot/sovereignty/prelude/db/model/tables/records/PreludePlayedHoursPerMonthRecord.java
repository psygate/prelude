/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlayedHoursPerMonth;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces.IPreludePlayedHoursPerMonth;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PreludePlayedHoursPerMonthRecord extends UpdatableRecordImpl<PreludePlayedHoursPerMonthRecord> implements Record4<UUID, Integer, Integer, Long>, IPreludePlayedHoursPerMonth {

	private static final long serialVersionUID = -545055214;

	/**
	 * Setter for <code>nucleus.prelude_played_hours_per_month.puuid</code>.
	 */
	public void setPuuid(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_played_hours_per_month.puuid</code>.
	 */
	@Override
	public UUID getPuuid() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.prelude_played_hours_per_month.month</code>.
	 */
	public void setMonth(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_played_hours_per_month.month</code>.
	 */
	@Override
	public Integer getMonth() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>nucleus.prelude_played_hours_per_month.year</code>.
	 */
	public void setYear(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_played_hours_per_month.year</code>.
	 */
	@Override
	public Integer getYear() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>nucleus.prelude_played_hours_per_month.millis_played</code>.
	 */
	public void setMillisPlayed(Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_played_hours_per_month.millis_played</code>.
	 */
	@Override
	public Long getMillisPlayed() {
		return (Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<UUID> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UUID, Integer, Integer, Long> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UUID, Integer, Integer, Long> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH.PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH.MONTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH.YEAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field4() {
		return PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH.MILLIS_PLAYED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value1() {
		return getPuuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getMonth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getYear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value4() {
		return getMillisPlayed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonthRecord value1(UUID value) {
		setPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonthRecord value2(Integer value) {
		setMonth(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonthRecord value3(Integer value) {
		setYear(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonthRecord value4(Long value) {
		setMillisPlayed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonthRecord values(UUID value1, Integer value2, Integer value3, Long value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PreludePlayedHoursPerMonthRecord
	 */
	public PreludePlayedHoursPerMonthRecord() {
		super(PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH);
	}

	/**
	 * Create a detached, initialised PreludePlayedHoursPerMonthRecord
	 */
	public PreludePlayedHoursPerMonthRecord(UUID puuid, Integer month, Integer year, Long millisPlayed) {
		super(PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH);

		setValue(0, puuid);
		setValue(1, month);
		setValue(2, year);
		setValue(3, millisPlayed);
	}
}
