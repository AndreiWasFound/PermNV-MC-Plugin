package andreiwasfound.permnv;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        PotionEffect nightvisionpotion = new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 100);
        e.getPlayer().addPotionEffect(nightvisionpotion);
    }
}
