/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeOverridesLog;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces.IPreludeOverridesLog;

import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PreludeOverridesLogRecord extends UpdatableRecordImpl<PreludeOverridesLogRecord> implements Record3<UUID, Byte, byte[]>, IPreludeOverridesLog {

	private static final long serialVersionUID = 856678624;

	/**
	 * Setter for <code>nucleus.prelude_overrides_log.puuid</code>.
	 */
	public void setPuuid(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.puuid</code>.
	 */
	@Override
	public UUID getPuuid() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.prelude_overrides_log.force_dedication</code>.
	 */
	public void setForceDedication(Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.force_dedication</code>.
	 */
	@Override
	public Byte getForceDedication() {
		return (Byte) getValue(1);
	}

	/**
	 * Setter for <code>nucleus.prelude_overrides_log.enforced_by</code>.
	 */
	public void setEnforcedBy(byte[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.enforced_by</code>.
	 */
	@Override
	public byte[] getEnforcedBy() {
		return (byte[]) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Byte, byte[]> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Byte, byte[]> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return PreludeOverridesLog.PRELUDE_OVERRIDES_LOG.PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field2() {
		return PreludeOverridesLog.PRELUDE_OVERRIDES_LOG.FORCE_DEDICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field3() {
		return PreludeOverridesLog.PRELUDE_OVERRIDES_LOG.ENFORCED_BY;
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
	public Byte value2() {
		return getForceDedication();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value3() {
		return getEnforcedBy();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeOverridesLogRecord value1(UUID value) {
		setPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeOverridesLogRecord value2(Byte value) {
		setForceDedication(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeOverridesLogRecord value3(byte[] value) {
		setEnforcedBy(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeOverridesLogRecord values(UUID value1, Byte value2, byte[] value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PreludeOverridesLogRecord
	 */
	public PreludeOverridesLogRecord() {
		super(PreludeOverridesLog.PRELUDE_OVERRIDES_LOG);
	}

	/**
	 * Create a detached, initialised PreludeOverridesLogRecord
	 */
	public PreludeOverridesLogRecord(UUID puuid, Byte forceDedication, byte[] enforcedBy) {
		super(PreludeOverridesLog.PRELUDE_OVERRIDES_LOG);

		setValue(0, puuid);
		setValue(1, forceDedication);
		setValue(2, enforcedBy);
	}
}
