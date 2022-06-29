package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class ArtifactCarrierAlpha extends BaseHullMod {

	public static float FIGHTER_REFIT_REDUCTION = 0.08f;
	public static float HULL_DAMAGE_TAKEN = 0.4375f;
	public static float ARMOR_DAMAGE_TAKEN = 0.8975f;
	public static float STEALTH_BONUS = 0.5f;
	public static float RADAR_BONUS = 2.5f;

	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getArmorDamageTakenMult().modifyMult(id, ARMOR_DAMAGE_TAKEN);
		stats.getHullDamageTakenMult().modifyMult(id, HULL_DAMAGE_TAKEN);
		stats.getFighterRefitTimeMult().modifyMult(id, FIGHTER_REFIT_REDUCTION);
		stats.getSensorProfile().modifyMult(id, STEALTH_BONUS);
		stats.getSensorStrength().modifyMult(id, RADAR_BONUS);
	}
}
