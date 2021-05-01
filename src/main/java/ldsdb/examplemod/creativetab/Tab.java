package ldsdb.examplemod.creativetab;

import ldsdb.examplemod.DouBan;
import ldsdb.examplemod.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tab extends CreativeTabs
{
    public static final Tab TAB = new Tab();

    public Tab()
    {
        super(String.valueOf(TAB));
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.DOU_BAN);
    }
    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
    @Override
    public int getSearchbarWidth()
    {
        return 45;
    }
    @Override
    public String getBackgroundImageName()
    {
        return "douban.png";
    }
}
