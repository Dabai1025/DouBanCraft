package ldsdb.examplemod.item;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.creativetab.Tab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;


public class ItemDouBan extends Item
{
    public ItemDouBan ()
    {
        this.setUnlocalizedName(DouBan.MODID + ".douBan");
        this.setRegistryName("dou_ban");
        this.setMaxStackSize(114514-114450);
        this.setCreativeTab(Tab.TAB);
    }
}

