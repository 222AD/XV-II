package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class ArtifactFighterAlpha extends BaseHullMod {

	public static float FIGHTER_DAMAGE_BONUS = 6.28f;
	public static float FIGHTER_HULL_DAMAGE_TAKEN = 0.3375f;
	public static float FIGHTER_ARMOR_DAMAGE_TAKEN = 0.6975f;
	public static float SPEED_BONUS = 2.3f;

    public void applyEffectsToFighterSpawnedByShip(ShipAPI fighter, ShipAPI ship, String id) {
        MutableShipStatsAPI stats = fighter.getMutableStats();
			
		stats.getAcceleration().modifyMult(id, SPEED_BONUS);
        stats.getDeceleration().modifyMult(id, SPEED_BONUS);
		stats.getMaxSpeed().modifyMult(id, SPEED_BONUS);
		stats.getBallisticWeaponDamageMult().modifyMult(id, FIGHTER_DAMAGE_BONUS);
		stats.getMissileWeaponDamageMult().modifyMult(id, FIGHTER_DAMAGE_BONUS);
		stats.getEnergyWeaponDamageMult().modifyMult(id, FIGHTER_DAMAGE_BONUS);
		stats.getHullDamageTakenMult().modifyMult(id, FIGHTER_HULL_DAMAGE_TAKEN);
		stats.getArmorDamageTakenMult().modifyMult(id, FIGHTER_ARMOR_DAMAGE_TAKEN);
	}
}
