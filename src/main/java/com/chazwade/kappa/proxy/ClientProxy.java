package com.chazwade.kappa.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		System.out.println("Commencing Kappa:Client Pre-Init");
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		System.out.println("Commencing Kappa:Client Init");
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
		System.out.println("Commencing Kappa:Client Post-Init");
	}
}
