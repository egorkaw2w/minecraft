package net.mazOFF.epickmod.block;

import net.mazOFF.epickmod.Item.ModCreativeModeTab;
import net.mazOFF.epickmod.Item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mazOFF.epickmod.epickmod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, epickmod.MOD_ID);

    public static final RegistryObject<Block> Kukumber_BLOCK = registryBLock("kukumber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.CoolTab);

    public static final RegistryObject<Block> Kukumber_ORE = registryBLock("kukumber_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(99f).requiresCorrectToolForDrops()), ModCreativeModeTab.CoolTab);
    public static final RegistryObject<Block> Kvacumber_BLOCK = registryBLock("kvacumber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(95f).requiresCorrectToolForDrops()), ModCreativeModeTab.CoolTab);



    public static <T extends Block> RegistryObject<T> registryBLock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name,block);
        registryBlocktem(name,toReturns,tab);
        return toReturns;
    }

    public static <T extends Block>RegistryObject<Item> registryBlocktem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
