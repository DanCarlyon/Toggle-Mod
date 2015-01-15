package com.dancarlyon.togglemod;

import com.dancarlyon.togglemod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraftforge.common.config.Configuration;

import java.util.EnumSet;

@Mod(modid="ToggleMod", name="Toggle Mod", version="1.7.10-1.0")
public class ToggleMod
{
    @Mod.Instance("ToggleMod")
    public static ToggleMod instance;

    static class Config
    {
        static boolean toggleLeftEnabled = true;
        static boolean toggleRightEnabled = true;
        static boolean toggleSneakEnabled = true;
        static boolean toggleRunEnabled = true;
        static boolean toggleSprintEnabled = true;
        static boolean toggleJumpEnabled = true;
        static boolean holdToAttackEnabled = true;
        static boolean autoOnlyAttackEnabled = true;
        static boolean notifyStatus = false;
    }

    @SidedProxy(clientSide = "com.dancarlyon.togglemod.proxy.ClientProxy", serverSide = "com.dancarlyon.togglemod.proxy.ServerProxy")
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Load network handle, mod configs, items & blocks
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        Config.toggleLeftEnabled = config.get("general", "ToggleLeft", true).getBoolean(false);
        Config.toggleRightEnabled = config.get("general", "ToggleRight", true).getBoolean(false);
        Config.toggleSneakEnabled = config.get("general", "ToggleSneak", true).getBoolean(false);
        Config.toggleRunEnabled = config.get("general", "ToggleRun", true).getBoolean(false);
        Config.toggleSprintEnabled = config.get("general", "ToggleSprint", true).getBoolean(false);
        Config.toggleJumpEnabled = config.get("general", "ToggleJump", true).getBoolean(false);
        Config.holdToAttackEnabled = config.get("general", "HoldToAttack", true).getBoolean(false);
        Config.autoOnlyAttackEnabled = config.get("general", "AutoOnlyAttack", true).getBoolean(false);
        Config.notifyStatus = config.get("general", "NotifyStatus", false).getBoolean(false);
        config.save();
    }

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        //Register GUI, tile enterties, event handlers and recipes


    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //Run after everything has finished initialising

    }
}
