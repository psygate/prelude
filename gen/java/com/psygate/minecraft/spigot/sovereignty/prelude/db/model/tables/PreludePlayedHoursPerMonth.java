/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.UUIDByteConverter;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludePlayedHoursPerMonthRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class PreludePlayedHoursPerMonth extends TableImpl<PreludePlayedHoursPerMonthRecord> {

	private static final long serialVersionUID = 482919184;

	/**
	 * The reference instance of <code>nucleus.prelude_played_hours_per_month</code>
	 */
	public static final PreludePlayedHoursPerMonth PRELUDE_PLAYED_HOURS_PER_MONTH = new PreludePlayedHoursPerMonth();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PreludePlayedHoursPerMonthRecord> getRecordType() {
		return PreludePlayedHoursPerMonthRecord.class;
	}

	/**
	 * The column <code>nucleus.prelude_played_hours_per_month.puuid</code>.
	 */
	public final TableField<PreludePlayedHoursPerMonthRecord, UUID> PUUID = createField("puuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * The column <code>nucleus.prelude_played_hours_per_month.month</code>.
	 */
	public final TableField<PreludePlayedHoursPerMonthRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nucleus.prelude_played_hours_per_month.year</code>.
	 */
	public final TableField<PreludePlayedHoursPerMonthRecord, Integer> YEAR = createField("year", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nucleus.prelude_played_hours_per_month.millis_played</code>.
	 */
	public final TableField<PreludePlayedHoursPerMonthRecord, Long> MILLIS_PLAYED = createField("millis_played", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * Create a <code>nucleus.prelude_played_hours_per_month</code> table reference
	 */
	public PreludePlayedHoursPerMonth() {
		this("prelude_played_hours_per_month", null);
	}

	/**
	 * Create an aliased <code>nucleus.prelude_played_hours_per_month</code> table reference
	 */
	public PreludePlayedHoursPerMonth(String alias) {
		this(alias, PRELUDE_PLAYED_HOURS_PER_MONTH);
	}

	private PreludePlayedHoursPerMonth(String alias, Table<PreludePlayedHoursPerMonthRecord> aliased) {
		this(alias, aliased, null);
	}

	private PreludePlayedHoursPerMonth(String alias, Table<PreludePlayedHoursPerMonthRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PreludePlayedHoursPerMonthRecord> getPrimaryKey() {
		return Keys.KEY_PRELUDE_PLAYED_HOURS_PER_MONTH_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PreludePlayedHoursPerMonthRecord>> getKeys() {
		return Arrays.<UniqueKey<PreludePlayedHoursPerMonthRecord>>asList(Keys.KEY_PRELUDE_PLAYED_HOURS_PER_MONTH_PRIMARY, Keys.KEY_PRELUDE_PLAYED_HOURS_PER_MONTH_MONTH);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludePlayedHoursPerMonth as(String alias) {
		return new PreludePlayedHoursPerMonth(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PreludePlayedHoursPerMonth rename(String name) {
		return new PreludePlayedHoursPerMonth(name, null);
	}
}