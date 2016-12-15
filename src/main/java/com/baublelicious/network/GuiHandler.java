package com.baublelicious.network;

import com.baublelicious.client.gui.GuiMagnetRing;
import com.baublelicious.client.gui.GuiPedestal;
import com.baublelicious.container.MagnetRingContainer;
import com.baublelicious.container.PedestalContainer;
import com.baublelicious.tiles.TilePedestal;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
  @Override
  public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    switch (id) {
      case 0:
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TilePedestal) {
          return new PedestalContainer(player.inventory, (TilePedestal) tileEntity);
        }
        break;
      case 1:
        return new MagnetRingContainer(x, player.inventory);
    }

    return null;
  }

  @Override
  public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    switch (id) {
      case 0:
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TilePedestal) {
          return new GuiPedestal(player.inventory, (TilePedestal) tileEntity);
        }
        break;
      case 1:
        return new GuiMagnetRing(new MagnetRingContainer(x, player.inventory));
    }
    return null;
  }
}