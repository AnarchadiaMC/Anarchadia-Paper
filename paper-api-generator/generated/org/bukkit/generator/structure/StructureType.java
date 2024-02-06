package org.bukkit.generator.structure;

import io.papermc.paper.generated.GeneratedFrom;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.jetbrains.annotations.NotNull;

/**
 * Vanilla keys for StructureTypes.
 *
 * @apiNote The fields provided here are a direct representation of
 * what is available from the vanilla game source. They may be
 * changed (including removals) on any Minecraft version
 * bump, so cross-version compatibility is not provided on the
 * same level as it is on most of the other API.
 */
@SuppressWarnings({
        "unused",
        "SpellCheckingInspection"
})
@GeneratedFrom("1.20.4")
public abstract class StructureType implements Keyed {
    /**
     * {@code minecraft:buried_treasure}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType BURIED_TREASURE = fetch("buried_treasure");

    /**
     * {@code minecraft:desert_pyramid}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType DESERT_PYRAMID = fetch("desert_pyramid");

    /**
     * {@code minecraft:end_city}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType END_CITY = fetch("end_city");

    /**
     * {@code minecraft:fortress}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType FORTRESS = fetch("fortress");

    /**
     * {@code minecraft:igloo}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType IGLOO = fetch("igloo");

    /**
     * {@code minecraft:jigsaw}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType JIGSAW = fetch("jigsaw");

    /**
     * {@code minecraft:jungle_temple}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType JUNGLE_TEMPLE = fetch("jungle_temple");

    /**
     * {@code minecraft:mineshaft}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType MINESHAFT = fetch("mineshaft");

    /**
     * {@code minecraft:nether_fossil}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType NETHER_FOSSIL = fetch("nether_fossil");

    /**
     * {@code minecraft:ocean_monument}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType OCEAN_MONUMENT = fetch("ocean_monument");

    /**
     * {@code minecraft:ocean_ruin}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType OCEAN_RUIN = fetch("ocean_ruin");

    /**
     * {@code minecraft:ruined_portal}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType RUINED_PORTAL = fetch("ruined_portal");

    /**
     * {@code minecraft:shipwreck}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType SHIPWRECK = fetch("shipwreck");

    /**
     * {@code minecraft:stronghold}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType STRONGHOLD = fetch("stronghold");

    /**
     * {@code minecraft:swamp_hut}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType SWAMP_HUT = fetch("swamp_hut");

    /**
     * {@code minecraft:woodland_mansion}
     *
     * @apiNote This field is version-dependant and may be removed in future Minecraft versions
     */
    public static final StructureType WOODLAND_MANSION = fetch("woodland_mansion");

    private static @NotNull StructureType fetch(final @NotNull String key) {
        return Registry.STRUCTURE_TYPE.get(NamespacedKey.minecraft(key));
    }
}