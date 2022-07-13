package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class ArtifactEliteAlpha extends BaseHullMod {

	public static float DAMAGE_BONUS = 1.90f;
	public static float ARMOR_DAMAGE_TAKEN = 0.5875f;
	public static float RATE_OF_FIRE = 1.30f;
	public static float RANGE_BONUS = 110f;
	public static float TIME_MULT = 2.14f;
	public static float HULL_DAMAGE_TAKEN = 0.18f;
	public static float STEALTH_BONUS = 0.04f;
	public static float RADAR_BONUS = 2.97f;
	public static float SHIELD_BONUS_UNFOLD = 5.5f;
	

	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getBallisticWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getMissileWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getEnergyWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getBallisticRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getEnergyRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getMissileRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getArmorDamageTakenMult().modifyMult(id, ARMOR_DAMAGE_TAKEN);
		stats.getHullDamageTakenMult().modifyMult(id, HULL_DAMAGE_TAKEN);
		stats.getMissileWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
		stats.getBallisticWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
		stats.getEnergyWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
		stats.getSensorProfile().modifyMult(id, STEALTH_BONUS);
		stats.getSensorStrength().modifyMult(id, RADAR_BONUS);
		stats.getShieldUnfoldRateMult().modifyMult(id, SHIELD_BONUS_UNFOLD);
		stats.getTimeMult().modifyMult(id, TIME_MULT);
	}
}
