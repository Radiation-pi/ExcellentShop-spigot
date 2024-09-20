package su.nightexpress.nexshop.product.packer.impl;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.nightexpress.nexshop.product.packer.AbstractPluginItemPacker;
import su.nightexpress.nexshop.product.handler.impl.OraxenItemHandler;

public class OraxenItemPacker extends AbstractPluginItemPacker<OraxenItemHandler> {

    public OraxenItemPacker(@NotNull OraxenItemHandler handler, @NotNull String itemId, int amount) {
        super(handler, itemId, amount);
    }

    @Override
    @Nullable
    public ItemStack createItem() {
        return this.handler.createItem(this.itemId);
    }
}
