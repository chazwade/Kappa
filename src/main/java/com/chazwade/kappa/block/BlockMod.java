package com.chazwade.kappa.block;

import com.chazwade.kappa.Kappa;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMod extends Block{
	
	public BlockMod(String name, Material materialIn, int variants)
	{
		super (materialIn);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Kappa.tabKappa);
		for (int i = 0; i < variants; i++){
			
		String newName = name + "_" + variants;
			Block block = Block.getBlockFromName(newName);
			GameRegistry.registerBlock(block);
			System.out.println(newName);
		}
}
	
}
