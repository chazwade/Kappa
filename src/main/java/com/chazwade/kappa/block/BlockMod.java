package com.chazwade.kappa.block;

import com.chazwade.kappa.Kappa;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMod extends Block{
	
	public BlockMod(String name, Material materialIn)
	{
		super (materialIn);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Kappa.tabKappa);
		Block block = Block.getBlockFromName(name);
	GameRegistry.registerBlock(block);
}
	
}
