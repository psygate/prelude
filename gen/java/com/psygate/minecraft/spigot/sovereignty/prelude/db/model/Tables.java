/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeBrokenMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeCraftedMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeEatenMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeEnchantedMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeOverridesLog;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlacedMaterials;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlayedHoursPerMonth;
import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlayerData;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in nucleus
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table nucleus.prelude_broken_materials
	 */
	public static final PreludeBrokenMaterials PRELUDE_BROKEN_MATERIALS = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeBrokenMaterials.PRELUDE_BROKEN_MATERIALS;

	/**
	 * The table nucleus.prelude_crafted_materials
	 */
	public static final PreludeCraftedMaterials PRELUDE_CRAFTED_MATERIALS = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeCraftedMaterials.PRELUDE_CRAFTED_MATERIALS;

	/**
	 * The table nucleus.prelude_eaten_materials
	 */
	public static final PreludeEatenMaterials PRELUDE_EATEN_MATERIALS = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeEatenMaterials.PRELUDE_EATEN_MATERIALS;

	/**
	 * The table nucleus.prelude_enchanted_materials
	 */
	public static final PreludeEnchantedMaterials PRELUDE_ENCHANTED_MATERIALS = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeEnchantedMaterials.PRELUDE_ENCHANTED_MATERIALS;

	/**
	 * The table nucleus.prelude_overrides_log
	 */
	public static final PreludeOverridesLog PRELUDE_OVERRIDES_LOG = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludeOverridesLog.PRELUDE_OVERRIDES_LOG;

	/**
	 * The table nucleus.prelude_placed_materials
	 */
	public static final PreludePlacedMaterials PRELUDE_PLACED_MATERIALS = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlacedMaterials.PRELUDE_PLACED_MATERIALS;

	/**
	 * The table nucleus.prelude_played_hours_per_month
	 */
	public static final PreludePlayedHoursPerMonth PRELUDE_PLAYED_HOURS_PER_MONTH = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlayedHoursPerMonth.PRELUDE_PLAYED_HOURS_PER_MONTH;

	/**
	 * The table nucleus.prelude_player_data
	 */
	public static final PreludePlayerData PRELUDE_PLAYER_DATA = com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.PreludePlayerData.PRELUDE_PLAYER_DATA;
}
