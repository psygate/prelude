// Generated from com\psygate\minecraft\spigot\sovereignty\prelude\grammar\Prelude.g4 by ANTLR 4.5.1
package com.psygate.minecraft.spigot.sovereignty.prelude.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PreludeParser}.
 */
public interface PreludeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PreludeParser#material}.
	 * @param ctx the parse tree
	 */
	void enterMaterial(PreludeParser.MaterialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#material}.
	 * @param ctx the parse tree
	 */
	void exitMaterial(PreludeParser.MaterialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#help_text}.
	 * @param ctx the parse tree
	 */
	void enterHelp_text(PreludeParser.Help_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#help_text}.
	 * @param ctx the parse tree
	 */
	void exitHelp_text(PreludeParser.Help_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#play_time}.
	 * @param ctx the parse tree
	 */
	void enterPlay_time(PreludeParser.Play_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#play_time}.
	 * @param ctx the parse tree
	 */
	void exitPlay_time(PreludeParser.Play_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#walk}.
	 * @param ctx the parse tree
	 */
	void enterWalk(PreludeParser.WalkContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#walk}.
	 * @param ctx the parse tree
	 */
	void exitWalk(PreludeParser.WalkContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#eat_saturation}.
	 * @param ctx the parse tree
	 */
	void enterEat_saturation(PreludeParser.Eat_saturationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#eat_saturation}.
	 * @param ctx the parse tree
	 */
	void exitEat_saturation(PreludeParser.Eat_saturationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#eat_material}.
	 * @param ctx the parse tree
	 */
	void enterEat_material(PreludeParser.Eat_materialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#eat_material}.
	 * @param ctx the parse tree
	 */
	void exitEat_material(PreludeParser.Eat_materialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#gainxp_xp}.
	 * @param ctx the parse tree
	 */
	void enterGainxp_xp(PreludeParser.Gainxp_xpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#gainxp_xp}.
	 * @param ctx the parse tree
	 */
	void exitGainxp_xp(PreludeParser.Gainxp_xpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#gainxp_level}.
	 * @param ctx the parse tree
	 */
	void enterGainxp_level(PreludeParser.Gainxp_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#gainxp_level}.
	 * @param ctx the parse tree
	 */
	void exitGainxp_level(PreludeParser.Gainxp_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#placeblock}.
	 * @param ctx the parse tree
	 */
	void enterPlaceblock(PreludeParser.PlaceblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#placeblock}.
	 * @param ctx the parse tree
	 */
	void exitPlaceblock(PreludeParser.PlaceblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#breakblock}.
	 * @param ctx the parse tree
	 */
	void enterBreakblock(PreludeParser.BreakblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#breakblock}.
	 * @param ctx the parse tree
	 */
	void exitBreakblock(PreludeParser.BreakblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PreludeParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PreludeParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(PreludeParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(PreludeParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(PreludeParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(PreludeParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PreludeParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PreludeParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#scoped}.
	 * @param ctx the parse tree
	 */
	void enterScoped(PreludeParser.ScopedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#scoped}.
	 * @param ctx the parse tree
	 */
	void exitScoped(PreludeParser.ScopedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(PreludeParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(PreludeParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreludeParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PreludeParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreludeParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PreludeParser.ParseContext ctx);
}