/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables;


import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.MaterialConverter;
import com.psygate.minecraft.spigot.sovereignty.nucleus.sql.util.UUIDByteConverter;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Keys;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.Nucleus;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludeBrokenMaterialsRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.bukkit.Material;
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
public class PreludeBrokenMaterials extends TableImpl<PreludeBrokenMaterialsRecord> {

	private static final long serialVersionUID = -320855362;

	/**
	 * The reference instance of <code>nucleus.prelude_broken_materials</code>
	 */
	public static final PreludeBrokenMaterials PRELUDE_BROKEN_MATERIALS = new PreludeBrokenMaterials();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PreludeBrokenMaterialsRecord> getRecordType() {
		return PreludeBrokenMaterialsRecord.class;
	}

	/**
	 * The column <code>nucleus.prelude_broken_materials.puuid</code>.
	 */
	public final TableField<PreludeBrokenMaterialsRecord, UUID> PUUID = createField("puuid", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "", new UUIDByteConverter());

	/**
	 * The column <code>nucleus.prelude_broken_materials.broken_material</code>.
	 */
	public final TableField<PreludeBrokenMaterialsRecord, Material> BROKEN_MATERIAL = createField("broken_material", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "", new MaterialConverter());

	/**
	 * The column <code>nucleus.prelude_broken_materials.amount</code>.
	 */
	public final TableField<PreludeBrokenMaterialsRecord, Integer> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>nucleus.prelude_broken_materials</code> table reference
	 */
	public PreludeBrokenMaterials() {
		this("prelude_broken_materials", null);
	}

	/**
	 * Create an aliased <code>nucleus.prelude_broken_materials</code> table reference
	 */
	public PreludeBrokenMaterials(String alias) {
		this(alias, PRELUDE_BROKEN_MATERIALS);
	}

	private PreludeBrokenMaterials(String alias, Table<PreludeBrokenMaterialsRecord> aliased) {
		this(alias, aliased, null);
	}

	private PreludeBrokenMaterials(String alias, Table<PreludeBrokenMaterialsRecord> aliased, Field<?>[] parameters) {
		super(alias, Nucleus.NUCLEUS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<PreludeBrokenMaterialsRecord> getPrimaryKey() {
		return Keys.KEY_PRELUDE_BROKEN_MATERIALS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<PreludeBrokenMaterialsRecord>> getKeys() {
		return Arrays.<UniqueKey<PreludeBrokenMaterialsRecord>>asList(Keys.KEY_PRELUDE_BROKEN_MATERIALS_PRIMARY, Keys.KEY_PRELUDE_BROKEN_MATERIALS_PUUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeBrokenMaterials as(String alias) {
		return new PreludeBrokenMaterials(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PreludeBrokenMaterials rename(String name) {
		return new PreludeBrokenMaterials(name, null);
	}
}
