package io.github.citytech.core.init;

import io.github.citytech.CityTechMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit{

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CityTechMod.MOD_ID);

	public static final RegistryObject<Item> CITYTECH_WRENCH = ITEMS.register("wrench",() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}