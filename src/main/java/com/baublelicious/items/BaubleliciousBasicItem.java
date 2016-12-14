package com.baublelicious.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

	public class BaubleliciousBasicItem extends Item {

		protected String name;

		public BaubleliciousBasicItem(String name) {
			this.name = name;
			setUnlocalizedName(name);
			setRegistryName(name);
		}

	

	}