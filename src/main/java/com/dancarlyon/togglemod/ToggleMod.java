package com.dancarlyon.togglemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Load network handle, mod configs, items & blocks

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
