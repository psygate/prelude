/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeBrokenMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces.IPreludeBrokenMaterials;

import java.util.UUID;

import javax.annotation.Generated;

import org.bukkit.Material;
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
public class PreludeBrokenMaterialsRecord extends UpdatableRecordImpl<PreludeBrokenMaterialsRecord> implements Record3<UUID, Material, Integer>, IPreludeBrokenMaterials {

	private static final long serialVersionUID = -930739141;

	/**
	 * Setter for <code>nucleus.prelude_broken_materials.puuid</code>.
	 */
	public void setPuuid(UUID value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_broken_materials.puuid</code>.
	 */
	@Override
	public UUID getPuuid() {
		return (UUID) getValue(0);
	}

	/**
	 * Setter for <code>nucleus.prelude_broken_materials.broken_material</code>.
	 */
	public void setBrokenMaterial(Material value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_broken_materials.broken_material</code>.
	 */
	@Override
	public Material getBrokenMaterial() {
		return (Material) getValue(1);
	}

	/**
	 * Setter for <code>nucleus.prelude_broken_materials.amount</code>.
	 */
	public void setAmount(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nucleus.prelude_broken_materials.amount</code>.
	 */
	@Override
	public Integer getAmount() {
		return (Integer) getValue(2);
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
	public Row3<UUID, Material, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<UUID, Material, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field1() {
		return PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS.PUUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Material> field2() {
		return PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS.BROKEN_MATERIAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS.AMOUNT;
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
	public Material value2() {
		return getBrokenMaterial();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getAmount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeBrokenMaterialsRecord value1(UUID value) {
		setPuuid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeBrokenMaterialsRecord value2(Material value) {
		setBrokenMaterial(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeBrokenMaterialsRecord value3(Integer value) {
		setAmount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreludeBrokenMaterialsRecord values(UUID value1, Material value2, Integer value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PreludeBrokenMaterialsRecord
	 */
	public PreludeBrokenMaterialsRecord() {
		super(PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS);
	}

	/**
	 * Create a detached, initialised PreludeBrokenMaterialsRecord
	 */
	public PreludeBrokenMaterialsRecord(UUID puuid, Material brokenMaterial, Integer amount) {
		super(PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS);

		setValue(0, puuid);
		setValue(1, brokenMaterial);
		setValue(2, amount);
	}
}