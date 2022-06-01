package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class MissileRangeBonusC extends BaseHullMod {

	public static float MISSILE_RANGE_BONUS = 1000f;
	

	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getMissileWeaponRangeBonus().modifyPercent(id, MISSILE_RANGE_BONUS);
	}
}
