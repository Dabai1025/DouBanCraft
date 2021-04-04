package ldsdb.examplemod.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.event.RegistryEvent.Register;

@Mod.EventBusSubscriber
public class BlockRegistryHandler
{
    public static final BlockDouBan BLOCK_DOU_BAN = new BlockDouBan();
    @SubscribeEvent
    public static void onRegistry(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BLOCK_DOU_BAN);
    }
}
