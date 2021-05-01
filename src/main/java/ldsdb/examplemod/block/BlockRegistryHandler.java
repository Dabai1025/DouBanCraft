package ldsdb.examplemod.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistryHandler
{
    public static final BlockDouBan BLOCK_DOU_BAN = new BlockDouBan();
    public static final OreDouBan ORE_DOU_BAN = new OreDouBan();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BLOCK_DOU_BAN);
        registry.register(ORE_DOU_BAN);
    }
}
