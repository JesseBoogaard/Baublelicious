package com.baublelicious;

import com.baublelicious.items.BaubleliciousItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class Baublelicious
{

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
     
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	BaubleliciousItems.createItems();
    }
}
