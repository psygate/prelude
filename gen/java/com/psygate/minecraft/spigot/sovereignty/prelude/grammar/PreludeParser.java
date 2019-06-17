// Generated from com\psygate\minecraft\spigot\sovereignty\prelude\grammar\Prelude.g4 by ANTLR 4.5.1
package com.psygate.minecraft.spigot.sovereignty.prelude.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreludeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, T__204=205, T__205=206, T__206=207, T__207=208, T__208=209, 
		T__209=210, T__210=211, T__211=212, T__212=213, T__213=214, T__214=215, 
		T__215=216, T__216=217, T__217=218, T__218=219, T__219=220, T__220=221, 
		T__221=222, T__222=223, T__223=224, T__224=225, T__225=226, T__226=227, 
		T__227=228, T__228=229, T__229=230, T__230=231, T__231=232, T__232=233, 
		T__233=234, T__234=235, T__235=236, T__236=237, T__237=238, T__238=239, 
		T__239=240, T__240=241, T__241=242, T__242=243, T__243=244, T__244=245, 
		T__245=246, T__246=247, T__247=248, T__248=249, T__249=250, T__250=251, 
		T__251=252, T__252=253, T__253=254, T__254=255, T__255=256, T__256=257, 
		T__257=258, T__258=259, T__259=260, T__260=261, T__261=262, T__262=263, 
		T__263=264, T__264=265, T__265=266, T__266=267, T__267=268, T__268=269, 
		T__269=270, T__270=271, T__271=272, T__272=273, T__273=274, T__274=275, 
		T__275=276, T__276=277, T__277=278, T__278=279, T__279=280, T__280=281, 
		T__281=282, T__282=283, T__283=284, T__284=285, T__285=286, T__286=287, 
		T__287=288, T__288=289, T__289=290, T__290=291, T__291=292, T__292=293, 
		T__293=294, T__294=295, T__295=296, T__296=297, T__297=298, T__298=299, 
		T__299=300, T__300=301, T__301=302, T__302=303, T__303=304, T__304=305, 
		T__305=306, T__306=307, T__307=308, T__308=309, T__309=310, T__310=311, 
		T__311=312, T__312=313, T__313=314, T__314=315, T__315=316, T__316=317, 
		T__317=318, T__318=319, T__319=320, T__320=321, T__321=322, T__322=323, 
		T__323=324, T__324=325, T__325=326, T__326=327, T__327=328, T__328=329, 
		T__329=330, T__330=331, T__331=332, T__332=333, T__333=334, T__334=335, 
		T__335=336, T__336=337, T__337=338, T__338=339, T__339=340, T__340=341, 
		T__341=342, T__342=343, T__343=344, T__344=345, T__345=346, T__346=347, 
		T__347=348, T__348=349, T__349=350, T__350=351, T__351=352, T__352=353, 
		T__353=354, T__354=355, T__355=356, T__356=357, T__357=358, T__358=359, 
		T__359=360, T__360=361, T__361=362, T__362=363, T__363=364, T__364=365, 
		T__365=366, T__366=367, T__367=368, T__368=369, T__369=370, T__370=371, 
		T__371=372, T__372=373, T__373=374, T__374=375, T__375=376, T__376=377, 
		T__377=378, T__378=379, T__379=380, T__380=381, T__381=382, T__382=383, 
		T__383=384, T__384=385, T__385=386, T__386=387, WS=388, COMMENT=389, CBROPEN=390, 
		CBRCLOSE=391, NUMBER=392, COLLECT=393, BREAK=394, PLACE=395, CRAFT=396, 
		ENCHANT=397, EAT=398, PLAY=399, WALK=400, HINT=401, STRING=402, GAINXP=403, 
		XPUNIT_LEVEL=404, XPUNIT_XP=405, AND=406, OR=407, SATURATION=408, METRIC_UNIT=409, 
		TIME_UNIT=410, MATERIAL=411;
	public static final int
		RULE_material = 0, RULE_help_text = 1, RULE_play_time = 2, RULE_walk = 3, 
		RULE_eat_saturation = 4, RULE_eat_material = 5, RULE_gainxp_xp = 6, RULE_gainxp_level = 7, 
		RULE_placeblock = 8, RULE_breakblock = 9, RULE_action = 10, RULE_and = 11, 
		RULE_or = 12, RULE_atom = 13, RULE_scoped = 14, RULE_scope = 15, RULE_parse = 16;
	public static final String[] ruleNames = {
		"material", "help_text", "play_time", "walk", "eat_saturation", "eat_material", 
		"gainxp_xp", "gainxp_level", "placeblock", "breakblock", "action", "and", 
		"or", "atom", "scoped", "scope", "parse"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'air'", "'stone'", "'grass'", "'dirt'", "'cobblestone'", "'wood'", 
		"'sapling'", "'bedrock'", "'water'", "'stationary_water'", "'lava'", "'stationary_lava'", 
		"'sand'", "'gravel'", "'gold_ore'", "'iron_ore'", "'coal_ore'", "'log'", 
		"'leaves'", "'sponge'", "'glass'", "'lapis_ore'", "'lapis_block'", "'dispenser'", 
		"'sandstone'", "'note_block'", "'bed_block'", "'powered_rail'", "'detector_rail'", 
		"'piston_sticky_base'", "'web'", "'long_grass'", "'dead_bush'", "'piston_base'", 
		"'piston_extension'", "'wool'", "'piston_moving_piece'", "'yellow_flower'", 
		"'red_rose'", "'brown_mushroom'", "'red_mushroom'", "'gold_block'", "'iron_block'", 
		"'double_step'", "'step'", "'brick'", "'tnt'", "'bookshelf'", "'mossy_cobblestone'", 
		"'obsidian'", "'torch'", "'fire'", "'mob_spawner'", "'wood_stairs'", "'chest'", 
		"'redstone_wire'", "'diamond_ore'", "'diamond_block'", "'workbench'", 
		"'crops'", "'soil'", "'furnace'", "'burning_furnace'", "'sign_post'", 
		"'wooden_door'", "'ladder'", "'rails'", "'cobblestone_stairs'", "'wall_sign'", 
		"'lever'", "'stone_plate'", "'iron_door_block'", "'wood_plate'", "'redstone_ore'", 
		"'glowing_redstone_ore'", "'redstone_torch_off'", "'redstone_torch_on'", 
		"'stone_button'", "'snow'", "'ice'", "'snow_block'", "'cactus'", "'clay'", 
		"'sugar_cane_block'", "'jukebox'", "'fence'", "'pumpkin'", "'netherrack'", 
		"'soul_sand'", "'glowstone'", "'portal'", "'jack_o_lantern'", "'cake_block'", 
		"'diode_block_off'", "'diode_block_on'", "'stained_glass'", "'trap_door'", 
		"'monster_eggs'", "'smooth_brick'", "'huge_mushroom_1'", "'huge_mushroom_2'", 
		"'iron_fence'", "'thin_glass'", "'melon_block'", "'pumpkin_stem'", "'melon_stem'", 
		"'vine'", "'fence_gate'", "'brick_stairs'", "'smooth_stairs'", "'mycel'", 
		"'water_lily'", "'nether_brick'", "'nether_fence'", "'nether_brick_stairs'", 
		"'nether_warts'", "'enchantment_table'", "'brewing_stand'", "'cauldron'", 
		"'ender_portal'", "'ender_portal_frame'", "'ender_stone'", "'dragon_egg'", 
		"'redstone_lamp_off'", "'redstone_lamp_on'", "'wood_double_step'", "'wood_step'", 
		"'cocoa'", "'sandstone_stairs'", "'emerald_ore'", "'ender_chest'", "'tripwire_hook'", 
		"'tripwire'", "'emerald_block'", "'spruce_wood_stairs'", "'birch_wood_stairs'", 
		"'jungle_wood_stairs'", "'command'", "'beacon'", "'cobble_wall'", "'flower_pot'", 
		"'carrot'", "'potato'", "'wood_button'", "'skull'", "'anvil'", "'trapped_chest'", 
		"'gold_plate'", "'iron_plate'", "'redstone_comparator_off'", "'redstone_comparator_on'", 
		"'daylight_detector'", "'redstone_block'", "'quartz_ore'", "'hopper'", 
		"'quartz_block'", "'quartz_stairs'", "'activator_rail'", "'dropper'", 
		"'stained_clay'", "'stained_glass_pane'", "'leaves_2'", "'log_2'", "'acacia_stairs'", 
		"'dark_oak_stairs'", "'slime_block'", "'barrier'", "'iron_trapdoor'", 
		"'prismarine'", "'sea_lantern'", "'hay_block'", "'carpet'", "'hard_clay'", 
		"'coal_block'", "'packed_ice'", "'double_plant'", "'standing_banner'", 
		"'wall_banner'", "'daylight_detector_inverted'", "'red_sandstone'", "'red_sandstone_stairs'", 
		"'double_stone_slab2'", "'stone_slab2'", "'spruce_fence_gate'", "'birch_fence_gate'", 
		"'jungle_fence_gate'", "'dark_oak_fence_gate'", "'acacia_fence_gate'", 
		"'spruce_fence'", "'birch_fence'", "'jungle_fence'", "'dark_oak_fence'", 
		"'acacia_fence'", "'spruce_door'", "'birch_door'", "'jungle_door'", "'acacia_door'", 
		"'dark_oak_door'", "'iron_spade'", "'iron_pickaxe'", "'iron_axe'", "'flint_and_steel'", 
		"'apple'", "'bow'", "'arrow'", "'coal'", "'diamond'", "'iron_ingot'", 
		"'gold_ingot'", "'iron_sword'", "'wood_sword'", "'wood_spade'", "'wood_pickaxe'", 
		"'wood_axe'", "'stone_sword'", "'stone_spade'", "'stone_pickaxe'", "'stone_axe'", 
		"'diamond_sword'", "'diamond_spade'", "'diamond_pickaxe'", "'diamond_axe'", 
		"'stick'", "'bowl'", "'mushroom_soup'", "'gold_sword'", "'gold_spade'", 
		"'gold_pickaxe'", "'gold_axe'", "'string'", "'feather'", "'sulphur'", 
		"'wood_hoe'", "'stone_hoe'", "'iron_hoe'", "'diamond_hoe'", "'gold_hoe'", 
		"'seeds'", "'wheat'", "'bread'", "'leather_helmet'", "'leather_chestplate'", 
		"'leather_leggings'", "'leather_boots'", "'chainmail_helmet'", "'chainmail_chestplate'", 
		"'chainmail_leggings'", "'chainmail_boots'", "'iron_helmet'", "'iron_chestplate'", 
		"'iron_leggings'", "'iron_boots'", "'diamond_helmet'", "'diamond_chestplate'", 
		"'diamond_leggings'", "'diamond_boots'", "'gold_helmet'", "'gold_chestplate'", 
		"'gold_leggings'", "'gold_boots'", "'flint'", "'pork'", "'grilled_pork'", 
		"'painting'", "'golden_apple'", "'sign'", "'wood_door'", "'bucket'", "'water_bucket'", 
		"'lava_bucket'", "'minecart'", "'saddle'", "'iron_door'", "'redstone'", 
		"'snow_ball'", "'boat'", "'leather'", "'milk_bucket'", "'clay_brick'", 
		"'clay_ball'", "'sugar_cane'", "'paper'", "'book'", "'slime_ball'", "'storage_minecart'", 
		"'powered_minecart'", "'egg'", "'compass'", "'fishing_rod'", "'watch'", 
		"'glowstone_dust'", "'raw_fish'", "'cooked_fish'", "'ink_sack'", "'bone'", 
		"'sugar'", "'cake'", "'bed'", "'diode'", "'cookie'", "'map'", "'shears'", 
		"'melon'", "'pumpkin_seeds'", "'melon_seeds'", "'raw_beef'", "'cooked_beef'", 
		"'raw_chicken'", "'cooked_chicken'", "'rotten_flesh'", "'ender_pearl'", 
		"'blaze_rod'", "'ghast_tear'", "'gold_nugget'", "'nether_stalk'", "'potion'", 
		"'glass_bottle'", "'spider_eye'", "'fermented_spider_eye'", "'blaze_powder'", 
		"'magma_cream'", "'brewing_stand_item'", "'cauldron_item'", "'eye_of_ender'", 
		"'speckled_melon'", "'monster_egg'", "'exp_bottle'", "'fireball'", "'book_and_quill'", 
		"'written_book'", "'emerald'", "'item_frame'", "'flower_pot_item'", "'carrot_item'", 
		"'potato_item'", "'baked_potato'", "'poisonous_potato'", "'empty_map'", 
		"'golden_carrot'", "'skull_item'", "'carrot_stick'", "'nether_star'", 
		"'pumpkin_pie'", "'firework'", "'firework_charge'", "'enchanted_book'", 
		"'redstone_comparator'", "'nether_brick_item'", "'quartz'", "'explosive_minecart'", 
		"'hopper_minecart'", "'prismarine_shard'", "'prismarine_crystals'", "'rabbit'", 
		"'cooked_rabbit'", "'rabbit_stew'", "'rabbit_foot'", "'rabbit_hide'", 
		"'armor_stand'", "'iron_barding'", "'gold_barding'", "'diamond_barding'", 
		"'leash'", "'name_tag'", "'command_minecart'", "'mutton'", "'cooked_mutton'", 
		"'banner'", "'spruce_door_item'", "'birch_door_item'", "'jungle_door_item'", 
		"'acacia_door_item'", "'dark_oak_door_item'", "'gold_record'", "'green_record'", 
		"'record_3'", "'record_4'", "'record_5'", "'record_6'", "'record_7'", 
		"'record_8'", "'record_9'", "'record_10'", "'record_11'", "'record_12'", 
		"'any'", "'*'", null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "WS", "COMMENT", "CBROPEN", "CBRCLOSE", "NUMBER", 
		"COLLECT", "BREAK", "PLACE", "CRAFT", "ENCHANT", "EAT", "PLAY", "WALK", 
		"HINT", "STRING", "GAINXP", "XPUNIT_LEVEL", "XPUNIT_XP", "AND", "OR", 
		"SATURATION", "METRIC_UNIT", "TIME_UNIT", "MATERIAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Prelude.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PreludeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MaterialContext extends ParserRuleContext {
		public MaterialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_material; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterMaterial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitMaterial(this);
		}
	}

	public final MaterialContext material() throws RecognitionException {
		MaterialContext _localctx = new MaterialContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_material);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__130 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (T__136 - 128)) | (1L << (T__137 - 128)) | (1L << (T__138 - 128)) | (1L << (T__139 - 128)) | (1L << (T__140 - 128)) | (1L << (T__141 - 128)) | (1L << (T__142 - 128)) | (1L << (T__143 - 128)) | (1L << (T__144 - 128)) | (1L << (T__145 - 128)) | (1L << (T__146 - 128)) | (1L << (T__147 - 128)) | (1L << (T__148 - 128)) | (1L << (T__149 - 128)) | (1L << (T__150 - 128)) | (1L << (T__151 - 128)) | (1L << (T__152 - 128)) | (1L << (T__153 - 128)) | (1L << (T__154 - 128)) | (1L << (T__155 - 128)) | (1L << (T__156 - 128)) | (1L << (T__157 - 128)) | (1L << (T__158 - 128)) | (1L << (T__159 - 128)) | (1L << (T__160 - 128)) | (1L << (T__161 - 128)) | (1L << (T__162 - 128)) | (1L << (T__163 - 128)) | (1L << (T__164 - 128)) | (1L << (T__165 - 128)) | (1L << (T__166 - 128)) | (1L << (T__167 - 128)) | (1L << (T__168 - 128)) | (1L << (T__169 - 128)) | (1L << (T__170 - 128)) | (1L << (T__171 - 128)) | (1L << (T__172 - 128)) | (1L << (T__173 - 128)) | (1L << (T__174 - 128)) | (1L << (T__175 - 128)) | (1L << (T__176 - 128)) | (1L << (T__177 - 128)) | (1L << (T__178 - 128)) | (1L << (T__179 - 128)) | (1L << (T__180 - 128)) | (1L << (T__181 - 128)) | (1L << (T__182 - 128)) | (1L << (T__183 - 128)) | (1L << (T__184 - 128)) | (1L << (T__185 - 128)) | (1L << (T__186 - 128)) | (1L << (T__187 - 128)) | (1L << (T__188 - 128)) | (1L << (T__189 - 128)) | (1L << (T__190 - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)) | (1L << (T__201 - 192)) | (1L << (T__202 - 192)) | (1L << (T__203 - 192)) | (1L << (T__204 - 192)) | (1L << (T__205 - 192)) | (1L << (T__206 - 192)) | (1L << (T__207 - 192)) | (1L << (T__208 - 192)) | (1L << (T__209 - 192)) | (1L << (T__210 - 192)) | (1L << (T__211 - 192)) | (1L << (T__212 - 192)) | (1L << (T__213 - 192)) | (1L << (T__214 - 192)) | (1L << (T__215 - 192)) | (1L << (T__216 - 192)) | (1L << (T__217 - 192)) | (1L << (T__218 - 192)) | (1L << (T__219 - 192)) | (1L << (T__220 - 192)) | (1L << (T__221 - 192)) | (1L << (T__222 - 192)) | (1L << (T__223 - 192)) | (1L << (T__224 - 192)) | (1L << (T__225 - 192)) | (1L << (T__226 - 192)) | (1L << (T__227 - 192)) | (1L << (T__228 - 192)) | (1L << (T__229 - 192)) | (1L << (T__230 - 192)) | (1L << (T__231 - 192)) | (1L << (T__232 - 192)) | (1L << (T__233 - 192)) | (1L << (T__234 - 192)) | (1L << (T__235 - 192)) | (1L << (T__236 - 192)) | (1L << (T__237 - 192)) | (1L << (T__238 - 192)) | (1L << (T__239 - 192)) | (1L << (T__240 - 192)) | (1L << (T__241 - 192)) | (1L << (T__242 - 192)) | (1L << (T__243 - 192)) | (1L << (T__244 - 192)) | (1L << (T__245 - 192)) | (1L << (T__246 - 192)) | (1L << (T__247 - 192)) | (1L << (T__248 - 192)) | (1L << (T__249 - 192)) | (1L << (T__250 - 192)) | (1L << (T__251 - 192)) | (1L << (T__252 - 192)) | (1L << (T__253 - 192)) | (1L << (T__254 - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T__255 - 256)) | (1L << (T__256 - 256)) | (1L << (T__257 - 256)) | (1L << (T__258 - 256)) | (1L << (T__259 - 256)) | (1L << (T__260 - 256)) | (1L << (T__261 - 256)) | (1L << (T__262 - 256)) | (1L << (T__263 - 256)) | (1L << (T__264 - 256)) | (1L << (T__265 - 256)) | (1L << (T__266 - 256)) | (1L << (T__267 - 256)) | (1L << (T__268 - 256)) | (1L << (T__269 - 256)) | (1L << (T__270 - 256)) | (1L << (T__271 - 256)) | (1L << (T__272 - 256)) | (1L << (T__273 - 256)) | (1L << (T__274 - 256)) | (1L << (T__275 - 256)) | (1L << (T__276 - 256)) | (1L << (T__277 - 256)) | (1L << (T__278 - 256)) | (1L << (T__279 - 256)) | (1L << (T__280 - 256)) | (1L << (T__281 - 256)) | (1L << (T__282 - 256)) | (1L << (T__283 - 256)) | (1L << (T__284 - 256)) | (1L << (T__285 - 256)) | (1L << (T__286 - 256)) | (1L << (T__287 - 256)) | (1L << (T__288 - 256)) | (1L << (T__289 - 256)) | (1L << (T__290 - 256)) | (1L << (T__291 - 256)) | (1L << (T__292 - 256)) | (1L << (T__293 - 256)) | (1L << (T__294 - 256)) | (1L << (T__295 - 256)) | (1L << (T__296 - 256)) | (1L << (T__297 - 256)) | (1L << (T__298 - 256)) | (1L << (T__299 - 256)) | (1L << (T__300 - 256)) | (1L << (T__301 - 256)) | (1L << (T__302 - 256)) | (1L << (T__303 - 256)) | (1L << (T__304 - 256)) | (1L << (T__305 - 256)) | (1L << (T__306 - 256)) | (1L << (T__307 - 256)) | (1L << (T__308 - 256)) | (1L << (T__309 - 256)) | (1L << (T__310 - 256)) | (1L << (T__311 - 256)) | (1L << (T__312 - 256)) | (1L << (T__313 - 256)) | (1L << (T__314 - 256)) | (1L << (T__315 - 256)) | (1L << (T__316 - 256)) | (1L << (T__317 - 256)) | (1L << (T__318 - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T__319 - 320)) | (1L << (T__320 - 320)) | (1L << (T__321 - 320)) | (1L << (T__322 - 320)) | (1L << (T__323 - 320)) | (1L << (T__324 - 320)) | (1L << (T__325 - 320)) | (1L << (T__326 - 320)) | (1L << (T__327 - 320)) | (1L << (T__328 - 320)) | (1L << (T__329 - 320)) | (1L << (T__330 - 320)) | (1L << (T__331 - 320)) | (1L << (T__332 - 320)) | (1L << (T__333 - 320)) | (1L << (T__334 - 320)) | (1L << (T__335 - 320)) | (1L << (T__336 - 320)) | (1L << (T__337 - 320)) | (1L << (T__338 - 320)) | (1L << (T__339 - 320)) | (1L << (T__340 - 320)) | (1L << (T__341 - 320)) | (1L << (T__342 - 320)) | (1L << (T__343 - 320)) | (1L << (T__344 - 320)) | (1L << (T__345 - 320)) | (1L << (T__346 - 320)) | (1L << (T__347 - 320)) | (1L << (T__348 - 320)) | (1L << (T__349 - 320)) | (1L << (T__350 - 320)) | (1L << (T__351 - 320)) | (1L << (T__352 - 320)) | (1L << (T__353 - 320)) | (1L << (T__354 - 320)) | (1L << (T__355 - 320)) | (1L << (T__356 - 320)) | (1L << (T__357 - 320)) | (1L << (T__358 - 320)) | (1L << (T__359 - 320)) | (1L << (T__360 - 320)) | (1L << (T__361 - 320)) | (1L << (T__362 - 320)) | (1L << (T__363 - 320)) | (1L << (T__364 - 320)) | (1L << (T__365 - 320)) | (1L << (T__366 - 320)) | (1L << (T__367 - 320)) | (1L << (T__368 - 320)) | (1L << (T__369 - 320)) | (1L << (T__370 - 320)) | (1L << (T__371 - 320)) | (1L << (T__372 - 320)) | (1L << (T__373 - 320)) | (1L << (T__374 - 320)) | (1L << (T__375 - 320)) | (1L << (T__376 - 320)) | (1L << (T__377 - 320)) | (1L << (T__378 - 320)) | (1L << (T__379 - 320)) | (1L << (T__380 - 320)) | (1L << (T__381 - 320)) | (1L << (T__382 - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (T__383 - 384)) | (1L << (T__384 - 384)) | (1L << (T__385 - 384)) | (1L << (T__386 - 384)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Help_textContext extends ParserRuleContext {
		public TerminalNode HINT() { return getToken(PreludeParser.HINT, 0); }
		public TerminalNode STRING() { return getToken(PreludeParser.STRING, 0); }
		public Help_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterHelp_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitHelp_text(this);
		}
	}

	public final Help_textContext help_text() throws RecognitionException {
		Help_textContext _localctx = new Help_textContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_help_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(HINT);
			setState(37);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Play_timeContext extends ParserRuleContext {
		public TerminalNode PLAY() { return getToken(PreludeParser.PLAY, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode TIME_UNIT() { return getToken(PreludeParser.TIME_UNIT, 0); }
		public Play_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterPlay_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitPlay_time(this);
		}
	}

	public final Play_timeContext play_time() throws RecognitionException {
		Play_timeContext _localctx = new Play_timeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_play_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(PLAY);
			setState(40);
			match(NUMBER);
			setState(41);
			match(TIME_UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WalkContext extends ParserRuleContext {
		public TerminalNode WALK() { return getToken(PreludeParser.WALK, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode METRIC_UNIT() { return getToken(PreludeParser.METRIC_UNIT, 0); }
		public WalkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterWalk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitWalk(this);
		}
	}

	public final WalkContext walk() throws RecognitionException {
		WalkContext _localctx = new WalkContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_walk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(WALK);
			setState(44);
			match(NUMBER);
			setState(45);
			match(METRIC_UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eat_saturationContext extends ParserRuleContext {
		public TerminalNode EAT() { return getToken(PreludeParser.EAT, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode SATURATION() { return getToken(PreludeParser.SATURATION, 0); }
		public Eat_saturationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eat_saturation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterEat_saturation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitEat_saturation(this);
		}
	}

	public final Eat_saturationContext eat_saturation() throws RecognitionException {
		Eat_saturationContext _localctx = new Eat_saturationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_eat_saturation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(EAT);
			setState(48);
			match(NUMBER);
			setState(49);
			match(SATURATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eat_materialContext extends ParserRuleContext {
		public TerminalNode EAT() { return getToken(PreludeParser.EAT, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode MATERIAL() { return getToken(PreludeParser.MATERIAL, 0); }
		public Eat_materialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eat_material; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterEat_material(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitEat_material(this);
		}
	}

	public final Eat_materialContext eat_material() throws RecognitionException {
		Eat_materialContext _localctx = new Eat_materialContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eat_material);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(EAT);
			setState(52);
			match(NUMBER);
			setState(53);
			match(MATERIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gainxp_xpContext extends ParserRuleContext {
		public TerminalNode GAINXP() { return getToken(PreludeParser.GAINXP, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode XPUNIT_XP() { return getToken(PreludeParser.XPUNIT_XP, 0); }
		public Gainxp_xpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gainxp_xp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterGainxp_xp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitGainxp_xp(this);
		}
	}

	public final Gainxp_xpContext gainxp_xp() throws RecognitionException {
		Gainxp_xpContext _localctx = new Gainxp_xpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gainxp_xp);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(GAINXP);
				setState(56);
				match(NUMBER);
				setState(57);
				match(XPUNIT_XP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(GAINXP);
				setState(59);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Gainxp_levelContext extends ParserRuleContext {
		public TerminalNode GAINXP() { return getToken(PreludeParser.GAINXP, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode XPUNIT_LEVEL() { return getToken(PreludeParser.XPUNIT_LEVEL, 0); }
		public Gainxp_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gainxp_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterGainxp_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitGainxp_level(this);
		}
	}

	public final Gainxp_levelContext gainxp_level() throws RecognitionException {
		Gainxp_levelContext _localctx = new Gainxp_levelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gainxp_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(GAINXP);
			setState(63);
			match(NUMBER);
			setState(64);
			match(XPUNIT_LEVEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlaceblockContext extends ParserRuleContext {
		public TerminalNode PLACE() { return getToken(PreludeParser.PLACE, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode MATERIAL() { return getToken(PreludeParser.MATERIAL, 0); }
		public PlaceblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterPlaceblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitPlaceblock(this);
		}
	}

	public final PlaceblockContext placeblock() throws RecognitionException {
		PlaceblockContext _localctx = new PlaceblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_placeblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PLACE);
			setState(67);
			match(NUMBER);
			setState(68);
			match(MATERIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakblockContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PreludeParser.BREAK, 0); }
		public TerminalNode NUMBER() { return getToken(PreludeParser.NUMBER, 0); }
		public TerminalNode MATERIAL() { return getToken(PreludeParser.MATERIAL, 0); }
		public BreakblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterBreakblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitBreakblock(this);
		}
	}

	public final BreakblockContext breakblock() throws RecognitionException {
		BreakblockContext _localctx = new BreakblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(BREAK);
			setState(71);
			match(NUMBER);
			setState(72);
			match(MATERIAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public BreakblockContext breakblock() {
			return getRuleContext(BreakblockContext.class,0);
		}
		public PlaceblockContext placeblock() {
			return getRuleContext(PlaceblockContext.class,0);
		}
		public Gainxp_levelContext gainxp_level() {
			return getRuleContext(Gainxp_levelContext.class,0);
		}
		public Gainxp_xpContext gainxp_xp() {
			return getRuleContext(Gainxp_xpContext.class,0);
		}
		public Eat_materialContext eat_material() {
			return getRuleContext(Eat_materialContext.class,0);
		}
		public Eat_saturationContext eat_saturation() {
			return getRuleContext(Eat_saturationContext.class,0);
		}
		public WalkContext walk() {
			return getRuleContext(WalkContext.class,0);
		}
		public Play_timeContext play_time() {
			return getRuleContext(Play_timeContext.class,0);
		}
		public List<Help_textContext> help_text() {
			return getRuleContexts(Help_textContext.class);
		}
		public Help_textContext help_text(int i) {
			return getRuleContext(Help_textContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(74);
				breakblock();
				}
				break;
			case 2:
				{
				setState(75);
				placeblock();
				}
				break;
			case 3:
				{
				setState(76);
				gainxp_level();
				}
				break;
			case 4:
				{
				setState(77);
				gainxp_xp();
				}
				break;
			case 5:
				{
				setState(78);
				eat_material();
				}
				break;
			case 6:
				{
				setState(79);
				eat_saturation();
				}
				break;
			case 7:
				{
				setState(80);
				walk();
				}
				break;
			case 8:
				{
				setState(81);
				play_time();
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HINT) {
				{
				{
				setState(84);
				help_text();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(PreludeParser.AND, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(AND);
			setState(91);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(PreludeParser.OR, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(OR);
			setState(94);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atom);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case CBROPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				scope();
				}
				break;
			case BREAK:
			case PLACE:
			case EAT:
			case PLAY:
			case WALK:
			case GAINXP:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				action();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopedContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<AndContext> and() {
			return getRuleContexts(AndContext.class);
		}
		public AndContext and(int i) {
			return getRuleContext(AndContext.class,i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public ScopedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterScoped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitScoped(this);
		}
	}

	public final ScopedContext scoped() throws RecognitionException {
		ScopedContext _localctx = new ScopedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scoped);
		int _la;
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(100);
				atom();
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(103);
					switch (_input.LA(1)) {
					case AND:
						{
						setState(101);
						and();
						}
						break;
					case OR:
						{
						setState(102);
						or();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AND || _la==OR );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode CBROPEN() { return getToken(PreludeParser.CBROPEN, 0); }
		public TerminalNode CBRCLOSE() { return getToken(PreludeParser.CBRCLOSE, 0); }
		public ScopedContext scoped() {
			return getRuleContext(ScopedContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CBROPEN);
			{
			setState(111);
			scoped();
			}
			setState(112);
			match(CBRCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParseContext extends ParserRuleContext {
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreludeListener ) ((PreludeListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			scope();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u019dw\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fU\n\f\3"+
		"\f\7\fX\n\f\f\f\16\f[\13\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\5\17e"+
		"\n\17\3\20\3\20\3\20\6\20j\n\20\r\20\16\20k\3\20\5\20o\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\3\3\2\3\u0185r\2$\3\2\2\2\4&\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\61"+
		"\3\2\2\2\f\65\3\2\2\2\16>\3\2\2\2\20@\3\2\2\2\22D\3\2\2\2\24H\3\2\2\2"+
		"\26T\3\2\2\2\30\\\3\2\2\2\32_\3\2\2\2\34d\3\2\2\2\36n\3\2\2\2 p\3\2\2"+
		"\2\"t\3\2\2\2$%\t\2\2\2%\3\3\2\2\2&\'\7\u0193\2\2\'(\7\u0194\2\2(\5\3"+
		"\2\2\2)*\7\u0191\2\2*+\7\u018a\2\2+,\7\u019c\2\2,\7\3\2\2\2-.\7\u0192"+
		"\2\2./\7\u018a\2\2/\60\7\u019b\2\2\60\t\3\2\2\2\61\62\7\u0190\2\2\62\63"+
		"\7\u018a\2\2\63\64\7\u019a\2\2\64\13\3\2\2\2\65\66\7\u0190\2\2\66\67\7"+
		"\u018a\2\2\678\7\u019d\2\28\r\3\2\2\29:\7\u0195\2\2:;\7\u018a\2\2;?\7"+
		"\u0197\2\2<=\7\u0195\2\2=?\7\u018a\2\2>9\3\2\2\2><\3\2\2\2?\17\3\2\2\2"+
		"@A\7\u0195\2\2AB\7\u018a\2\2BC\7\u0196\2\2C\21\3\2\2\2DE\7\u018d\2\2E"+
		"F\7\u018a\2\2FG\7\u019d\2\2G\23\3\2\2\2HI\7\u018c\2\2IJ\7\u018a\2\2JK"+
		"\7\u019d\2\2K\25\3\2\2\2LU\5\24\13\2MU\5\22\n\2NU\5\20\t\2OU\5\16\b\2"+
		"PU\5\f\7\2QU\5\n\6\2RU\5\b\5\2SU\5\6\4\2TL\3\2\2\2TM\3\2\2\2TN\3\2\2\2"+
		"TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UY\3\2\2\2VX\5\4\3\2"+
		"WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\27\3\2\2\2[Y\3\2\2\2\\]\7\u0198"+
		"\2\2]^\5\34\17\2^\31\3\2\2\2_`\7\u0199\2\2`a\5\34\17\2a\33\3\2\2\2be\5"+
		" \21\2ce\5\26\f\2db\3\2\2\2dc\3\2\2\2e\35\3\2\2\2fi\5\34\17\2gj\5\30\r"+
		"\2hj\5\32\16\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2"+
		"\2\2mo\5\34\17\2nf\3\2\2\2nm\3\2\2\2o\37\3\2\2\2pq\7\u0188\2\2qr\5\36"+
		"\20\2rs\7\u0189\2\2s!\3\2\2\2tu\5 \21\2u#\3\2\2\2\t>TYdikn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}