package dev.afancydog;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items {


    public static final Item SUSPICIOUS_SUBSTANCE = register(
// Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings()),
            "effigy"
    );
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(Garden.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }
    public static void initialize() {}
}