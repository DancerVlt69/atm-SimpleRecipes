package net.dancervlt69.jmsrforge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(JmsrForge.MODID)
public class JmsrForge {
	public static final Logger LOGGER = LogManager.getLogger(JmsrForge.class);
	public static final String MODID = "jmsr_forge";

	public JmsrForge() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		eventBus.addListener(this::commonSetup);
		eventBus.addListener(this::clientSetup);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(FMLCommonSetupEvent event) {

		LOGGER.info("Common Setup started...");

		// elements.getElements().forEach(element -> element.init(event));

		LOGGER.info("Common Setup finished.");

	}

	public void clientSetup(FMLClientSetupEvent event) {

		LOGGER.info("Client Setup started...");

		// elements.getElements().forEach(element -> element.clientLoad(event));

		LOGGER.info("Client Setup finished.");
	}
}
