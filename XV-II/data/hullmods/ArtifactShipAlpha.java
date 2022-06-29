package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class ArtifactShipAlpha extends BaseHullMod {

	public static float DAMAGE_BONUS = 4.20f;
	public static float ARMOR_DAMAGE_TAKEN = 0.6875f;
	public static float RATE_OF_FIRE = 2.10f;
	public static float RANGE_BONUS = 380f;
	

	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getBallisticWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getMissileWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getEnergyWeaponDamageMult().modifyMult(id, DAMAGE_BONUS);
		stats.getBallisticRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getEnergyRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getMissileRoFMult().modifyMult(id, RATE_OF_FIRE);
		stats.getArmorDamageTakenMult().modifyMult(id, ARMOR_DAMAGE_TAKEN);
		stats.getMissileWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
		stats.getBallisticWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
		stats.getEnergyWeaponRangeBonus().modifyPercent(id, RANGE_BONUS);
	}
}
