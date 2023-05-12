package me.tenteur.hardenedsurvival.EventListeners;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class MobEventListener implements Listener {

    @EventHandler
    public void onCreeperExplode(EntityExplodeEvent event) {
        Entity entity = event.getEntity();
        if (entity.getType().equals(EntityType.CREEPER)) {
            event.setCancelled(true);
            Location loc = new Location(entity.getWorld(), entity.getLocation().getX(), entity.getLocation().getY(), entity.getLocation().getZ());
            float power = 20.0f;
            boolean setFire = false;
            boolean breakBlocks = true;
            loc.getWorld().createExplosion(loc, power, setFire, breakBlocks);
        }
    }
}
