/**
 * This class is generated by jOOQ
 */
package com.psygate.minecraft.spigot.sovereignty.prelude.db.model.tables.interfaces;


import java.io.Serializable;
import java.util.UUID;

import javax.annotation.Generated;


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
public interface IPreludeOverridesLog extends Serializable {

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.puuid</code>.
	 */
	public UUID getPuuid();

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.force_dedication</code>.
	 */
	public Byte getForceDedication();

	/**
	 * Getter for <code>nucleus.prelude_overrides_log.enforced_by</code>.
	 */
	public byte[] getEnforcedBy();
}
