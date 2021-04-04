package ldsdb.examplemod.item;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.creativetab.Tab;
import net.minecraft.item.ItemPickaxe;

public class ItemDouBanPickaxe extends ItemPickaxe
{
    public ItemDouBanPickaxe()
    {
        super(ItemRegistryHandler.DOUBAN_TOOL_MATERIAL);
        this.setUnlocalizedName(DouBan.MODID + ".douban_pickaxe");
        this.setCreativeTab(Tab.TAB);
        this.setRegistryName("douban_pickaxe");
    }
}
