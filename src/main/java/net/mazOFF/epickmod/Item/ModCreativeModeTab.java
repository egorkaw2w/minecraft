package net.mazOFF.epickmod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab CoolTab = new CreativeModeTab("CoolModeActive") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Kukumber.get());
        }
    };
}
