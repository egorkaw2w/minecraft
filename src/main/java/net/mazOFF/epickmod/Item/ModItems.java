package net.mazOFF.epickmod.Item;

import net.mazOFF.epickmod.epickmod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, epickmod.MOD_ID);
    public static final RegistryObject<Item> Kukumber = ITEMS.register("kukumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item> Kvakamber = ITEMS.register("kvakamber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_HELMET = ITEMS.register("kukumber_helmet",
            () -> new ArmorItem(ModArmorMaterials.KUKUMBER, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_CHESTPLATE = ITEMS.register("kukumber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.KUKUMBER, EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_LEGGING = ITEMS.register("kukumber_legging",
            () -> new ArmorItem(ModArmorMaterials.KUKUMBER, EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_BOOTS = ITEMS.register("kukumber_boots",
            () -> new ArmorItem(ModArmorMaterials.KUKUMBER, EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));

    public static final RegistryObject<Item>  KUKUMBER_PICKAXE = ITEMS.register("kukumber_pickaxe",
            () -> new PickaxeItem(ModTiers.KUKUMBER,1,1f ,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_AXE = ITEMS.register("kukumber_axe",
            () -> new AxeItem(ModTiers.KUKUMBER,1,1f ,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_SHOVEL = ITEMS.register("kukumber_shovel",
            () -> new ShovelItem(ModTiers.KUKUMBER,1,1f ,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_HOE = ITEMS.register("kukumber_hoe",
            () -> new HoeItem(ModTiers.KUKUMBER,1,1f ,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));
    public static final RegistryObject<Item>  KUKUMBER_SWORD = ITEMS.register("kukumber_sword",
            () -> new SwordItem(ModTiers.KUKUMBER,1,1f ,new Item.Properties().tab(ModCreativeModeTab.CoolTab)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}