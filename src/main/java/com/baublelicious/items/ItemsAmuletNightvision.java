package com.baublelicious.items;

import baubles.api.BaubleType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemsAmuletNightvision extends ItemBaubles {
  public ItemsAmuletNightvision() {
    this.setUnlocalizedName("ItemsAmuletNightvision");
  }

  @Override
  public BaubleType getBaubleType(ItemStack stack) {
    return BaubleType.AMULET;
  }

  @Override
  public void onWornTick(ItemStack stack, EntityLivingBase entity) {
    PotionEffect effect = entity.getActivePotionEffect(Potion.nightVision);
    if (effect == null || effect.getDuration() < 900) entity.addPotionEffect(new PotionEffect(Potion.nightVision.id, 999999, 1, true));
  }

  @Override
  public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
    player.removePotionEffect(Potion.nightVision.id);
  }
}