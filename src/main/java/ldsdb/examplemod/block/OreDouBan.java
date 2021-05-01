package ldsdb.examplemod.block;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.creativetab.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;
import java.util.Random;

import static ldsdb.examplemod.item.ItemRegistryHandler.DOU_BAN;
public class OreDouBan extends Block
{
    public OreDouBan()
    {
        super(Material.ROCK);
        this.setSoundType(SoundType.STONE);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setCreativeTab(Tab.TAB);
        this.setRegistryName("douban_ore");
        this.setUnlocalizedName(DouBan.MODID + "douban_ore");
    }

    @Nonnull
    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return DOU_BAN;
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 2;
        int min = 0;
        return rand.nextInt(max) + min;
    }
}
