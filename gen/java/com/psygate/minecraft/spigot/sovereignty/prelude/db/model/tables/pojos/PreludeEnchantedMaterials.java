/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces.IPreludeEnchantedMaterials;

import java.util.UUID;

import javax.annotation.Generated;

import org.bukkit.Material;


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
public class PreludeEnchantedMaterials implements IPreludeEnchantedMaterials {

	private static final long serialVersionUID = 1360650395;

	private final UUID     puuid;
	private final Material enchantedMaterial;
	private final Integer  amount;

	public PreludeEnchantedMaterials(PreludeEnchantedMaterials value) {
		this.puuid = value.puuid;
		this.enchantedMaterial = value.enchantedMaterial;
		this.amount = value.amount;
	}

	public PreludeEnchantedMaterials(
		UUID     puuid,
		Material enchantedMaterial,
		Integer  amount
	) {
		this.puuid = puuid;
		this.enchantedMaterial = enchantedMaterial;
		this.amount = amount;
	}

	@Override
	public UUID getPuuid() {
		return this.puuid;
	}

	@Override
	public Material getEnchantedMaterial() {
		return this.enchantedMaterial;
	}

	@Override
	public Integer getAmount() {
		return this.amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("PreludeEnchantedMaterials (");

		sb.append(puuid);
		sb.append(", ").append(enchantedMaterial);
		sb.append(", ").append(amount);

		sb.append(")");
		return sb.toString();
	}
}