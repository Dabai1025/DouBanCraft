package ldsdb.examplemod.item;


import ldsdb.examplemod.DouBan;
import net.minecraft.item.Item;

public class ItemDouBan extends Item
{
    public ItemDouBan ()
    {
        this.setUnlocalizedName(DouBan.MODID + ".douBan");
        this.setRegistryName("dou_ban");
        this.setMaxStackSize(64);
    }
}

