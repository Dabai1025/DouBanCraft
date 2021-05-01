package ldsdb.examplemod.item;

import ldsdb.examplemod.block.BlockRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {
    // Add static field
    public static final ItemDouBan DOU_BAN = new ItemDouBan();
    public static final ItemBlock ITEM_BLOCK_DOU_BAN = new ItemBlock(BlockRegistryHandler.BLOCK_DOU_BAN);
    public static final Item.ToolMaterial DOUBAN_TOOL_MATERIAL = EnumHelper.addToolMaterial("DOUBAN", 5, 114, 7, 8.0f, 4);
    public static final ItemDouBanPickaxe DOU_BAN_PICKAXE = new ItemDouBanPickaxe();
    public static final ItemBlock ITEM_DOU_BAN_ORE = new ItemBlock(BlockRegistryHandler.ORE_DOU_BAN);
    public static final ItemDouBanFood ITEM_DOU_BAN_FOOD = new ItemDouBanFood();

    // onRegistry method
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(DOU_BAN);

        ITEM_BLOCK_DOU_BAN.setRegistryName(ITEM_BLOCK_DOU_BAN.getBlock().getRegistryName());
        registry.register(ITEM_BLOCK_DOU_BAN);

        registry.register(DOU_BAN_PICKAXE);

        ITEM_DOU_BAN_ORE.setRegistryName(ITEM_DOU_BAN_ORE.getBlock().getRegistryName());
        registry.register(ITEM_DOU_BAN_ORE);

        registry.register(ITEM_DOU_BAN_FOOD);

    }

    // Monitor textures registry
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    // onModelRegistry method
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event)
    {
        registerModel(DOU_BAN);
        registerModel(ITEM_BLOCK_DOU_BAN);
        registerModel(DOU_BAN_PICKAXE);
        registerModel(ITEM_DOU_BAN_ORE);
        registerModel(ITEM_DOU_BAN_FOOD);
    }
}
