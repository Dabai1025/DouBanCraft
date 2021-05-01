package ldsdb.examplemod.item;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.creativetab.Tab;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDouBanFood extends ItemFood
{
    public ItemDouBanFood ()
    {
        super(5, 3, false);
        this.setUnlocalizedName(DouBan.MODID + ".douban_food");
        this.setCreativeTab(Tab.TAB);
        this.setRegistryName("douban_food");
        this.setAlwaysEdible();
    }

    @SideOnly(Side.CLIENT)
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 300, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 600, 0));
            }
        }