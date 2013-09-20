package adventurebackpack.inventory;

import adventurebackpack.blocks.Blocks;
import adventurebackpack.items.ItemAdvBackpack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class SlotBackpack extends Slot{

	public SlotBackpack(IInventory inventory, int id, int x, int y) {
		super(inventory, id, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		return (!(stack.getItem() instanceof ItemAdvBackpack)&& !(stack.getItem().itemID == Blocks.advbackpack.blockID));
	}
}
