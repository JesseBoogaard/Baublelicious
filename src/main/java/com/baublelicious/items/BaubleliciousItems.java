package com.baublelicious.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaubleliciousItems {

	
	public static BaubleliciousBasicItem TestItem;
	
	public static void init() {
		TestItem = register(new BaubleliciousBasicItem("TestItem").setCreativeTab(CreativeTabs.MATERIALS));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof BaubleliciousBasicItem) {
			((BaubleliciousBasicItem)item).registerItemModel(item);
		}

		return item;
	}
	
}
