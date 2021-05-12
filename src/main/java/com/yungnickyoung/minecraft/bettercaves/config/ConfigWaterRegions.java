package com.yungnickyoung.minecraft.bettercaves.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;

public class ConfigWaterRegions {
    @ConfigEntry.Gui.Tooltip()
    @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    public double waterRegionSpawnChance = 40.0;

    @ConfigEntry.Gui.Tooltip(count = 2)
    public String waterRegionSize = "Medium";

    @ConfigEntry.Gui.Tooltip(count = 6)
    public double waterRegionSizeCustomValue = 0.004;
}
