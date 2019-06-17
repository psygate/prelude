package com.psygate.minecraft.spigot.sovereignty.prelude.configuration.parsing;

import org.bukkit.Material;

import java.util.Objects;
import java.util.Optional;

/**
 * Created by psygate on 26.04.2016.
 */
public class MaterialMatcher {
    // If this is not present, this will match any material.
    private Optional<Material> material;

    public MaterialMatcher(String materialName) {
        Objects.requireNonNull(materialName, () -> "Material name cannot be null.");
        if ("*".equalsIgnoreCase(materialName) || "any".equalsIgnoreCase(materialName)) {
            material = Optional.empty();
        } else {
            material = Optional.of(Material.valueOf(materialName.toUpperCase()));
        }
    }

    public boolean isMatchAll() {
        return !material.isPresent();
    }

    public Material getMaterial() {
        return material.get();
    }

    @Override
    public String toString() {
        return material.map(Material::toString).orElseGet(() -> "*");
    }
}
