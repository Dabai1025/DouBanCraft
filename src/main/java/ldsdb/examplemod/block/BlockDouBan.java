package ldsdb.examplemod.block;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.creativetab.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDouBan extends Block
{

    public BlockDouBan()
    {
        super(Material.GROUND);
        this.setUnlocalizedName(DouBan.MODID + "douban_block");
        this.setRegistryName("douban_block");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(0.6F);
        this.setCreativeTab(Tab.TAB);
    }
}