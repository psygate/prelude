/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.daos;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeEatenMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.records.PreludeEatenMaterialsRecord;

import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.bukkit.Material;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class PreludeEatenMaterialsDao extends DAOImpl<PreludeEatenMaterialsRecord, com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials, UUID> {

	/**
	 * Create a new PreludeEatenMaterialsDao without any configuration
	 */
	public PreludeEatenMaterialsDao() {
		super(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS, com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials.class);
	}

	/**
	 * Create a new PreludeEatenMaterialsDao with an attached configuration
	 */
	public PreludeEatenMaterialsDao(Configuration configuration) {
		super(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS, com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected UUID getId(com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials object) {
		return object.getPuuid();
	}

	/**
	 * Fetch records that have <code>puuid IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials> fetchByPuuid(UUID... values) {
		return fetch(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS.PUUID, values);
	}

	/**
	 * Fetch a unique record that has <code>puuid = value</code>
	 */
	public com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials fetchOneByPuuid(UUID value) {
		return fetchOne(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS.PUUID, value);
	}

	/**
	 * Fetch records that have <code>eaten_material IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials> fetchByEatenMaterial(Material... values) {
		return fetch(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS.EATEN_MATERIAL, values);
	}

	/**
	 * Fetch records that have <code>amount IN (values)</code>
	 */
	public List<com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos.PreludeEatenMaterials> fetchByAmount(Integer... values) {
		return fetch(PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS.AMOUNT, values);
	}
}
