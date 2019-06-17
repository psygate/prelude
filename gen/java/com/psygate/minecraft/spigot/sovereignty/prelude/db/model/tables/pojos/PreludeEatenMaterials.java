/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.pojos;


import com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces.IPreludeEatenMaterials;

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
public class PreludeEatenMaterials implements IPreludeEatenMaterials {

	private static final long serialVersionUID = -1348570143;

	private final UUID     puuid;
	private final Material eatenMaterial;
	private final Integer  amount;

	public PreludeEatenMaterials(PreludeEatenMaterials value) {
		this.puuid = value.puuid;
		this.eatenMaterial = value.eatenMaterial;
		this.amount = value.amount;
	}

	public PreludeEatenMaterials(
		UUID     puuid,
		Material eatenMaterial,
		Integer  amount
	) {
		this.puuid = puuid;
		this.eatenMaterial = eatenMaterial;
		this.amount = amount;
	}

	@Override
	public UUID getPuuid() {
		return this.puuid;
	}

	@Override
	public Material getEatenMaterial() {
		return this.eatenMaterial;
	}

	@Override
	public Integer getAmount() {
		return this.amount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("PreludeEatenMaterials (");

		sb.append(puuid);
		sb.append(", ").append(eatenMaterial);
		sb.append(", ").append(amount);

		sb.append(")");
		return sb.toString();
	}
}
