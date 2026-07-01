package com.lnaidu14.minemod.item;

import com.lnaidu14.minemod.MineMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MineMod.MOD_ID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.registerItem(
            "bismuth",
            Item::new,
            props -> props
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
