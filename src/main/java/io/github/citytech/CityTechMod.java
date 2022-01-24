package io.github.citytech;

import io.github.citytech.core.init.ItemInit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(CityTechMod.MOD_ID)
public class CityTechMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "citytech";

    public CityTechMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        bus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        bus.addListener(this::enqueueIMC);

        ItemInit.ITEMS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("citytech", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }
}
