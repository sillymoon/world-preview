package caeruleusTait.world.preview.client.gui;

import caeruleusTait.world.preview.backend.color.PreviewData;
import caeruleusTait.world.preview.client.gui.widgets.lists.BiomesList;
import caeruleusTait.world.preview.client.gui.widgets.lists.StructuresList;
import com.mojang.blaze3d.platform.NativeImage;
import it.unimi.dsi.fastutil.shorts.Short2LongMap;
import net.minecraft.world.item.ItemStack;

public interface PreviewDisplayDataProvider {
    PreviewData previewData();

    BiomesList.BiomeEntry biome4Id(int id);

    StructuresList.StructureEntry structure4Id(int id);

    NativeImage[] structureIcons();

    ItemStack[] structureItems();

    void onBiomeVisuallySelected(BiomesList.BiomeEntry entry);

    void onVisibleBiomesChanged(Short2LongMap visibleBiomes);

    void onVisibleStructuresChanged(Short2LongMap visibleStructures);

    StructureRenderInfo[] renderStructureMap();

    int[] heightColorMap();

    int yMin();

    int yMax();

    boolean isUpdating();

    boolean setupFailed();

    interface StructureRenderInfo {
        boolean show();
    }
}
