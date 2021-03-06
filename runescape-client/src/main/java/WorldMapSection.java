import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lav;S)V",
		garbageValue = "19050"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "(IIII)Z",
		garbageValue = "241939554"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "639074408"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "(IIII)[I",
		garbageValue = "1868308301"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "(IIB)Lhs;",
		garbageValue = "0"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "(Lkj;B)V",
		garbageValue = "125"
	)
	@Export("read")
	void read(Buffer var1);
}
