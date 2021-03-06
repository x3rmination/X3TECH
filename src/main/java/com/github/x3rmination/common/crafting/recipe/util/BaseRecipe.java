package com.github.x3rmination.common.crafting.recipe.util;


import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.Objects;

public class BaseRecipe implements IRecipe<IInventory> {

    private final IRecipeType<?> recipeType;
    private final ResourceLocation id;
    private final IRecipeSerializer<?> recipeSerializer;
    private final ItemStack result;
    private final Ingredient ingredient;

    public BaseRecipe(IRecipeType<?> type, IRecipeSerializer<?> serializer, ResourceLocation id, Ingredient ingredient, ItemStack result) {
        this.recipeType = type;
        this.recipeSerializer = serializer;
        this.id = Objects.requireNonNull(id, "Recipe name cannot be null.");
        this.ingredient = ingredient;
        this.result = result;
    }

    public void write(PacketBuffer buffer) {}

    @Override
    public boolean matches(IInventory pInv, World pLevel) {
        //Override me!!!
        return false;
    }

    @Override
    public ItemStack assemble(IInventory pInv) {
        return this.result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return this.result;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public IRecipeSerializer<?> getSerializer() {
        return this.recipeSerializer;
    }

    @Override
    public IRecipeType<?> getType() {
        return this.recipeType;
    }
}
