package com.chazwade.kappa.block;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMarble extends BlockMod{
	public BlockMarble(){
		super("BlockMarble", Material.rock);
		setHardness(1.25F);
		setResistance(7.0F);
		setStepSound(SoundType.STONE);
	}
}
