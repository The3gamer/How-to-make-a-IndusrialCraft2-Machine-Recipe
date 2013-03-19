package net.minecraft.src.ic2.api;

import ic2.api.Items


/*
* Recipe By The3gamer
*
* this Recipe will turn 1 snow block to a ice block
*
*To make the Recipe An item for another Item you change the (Block) To (ItemStack)
*
*You can edit all you like and fork
*/


//Add the recipe & Get Input for Output
public static void addCompressorRecipe(Block input,Block output){
getCompressorRecipes().add(new AbstractMap.SimpleEntery<Block, Block>(Block.snow, Block.ice output));
 
//Get compressor Output for input
public static Block getCommpressorOutputFor(Block input, boolean adjustInput) {
return getOutputFor(input, adjustInput, getCompressorRecipes());

}
