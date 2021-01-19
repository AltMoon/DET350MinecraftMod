package net.mcreator.det;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public interface IProxyDET {
	void preInit(FMLPreInitializationEvent event);

	void init(FMLInitializationEvent event);

	void postInit(FMLPostInitializationEvent event);

	void serverLoad(FMLServerStartingEvent event);
}
