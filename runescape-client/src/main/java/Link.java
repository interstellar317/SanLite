import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("Link")
public class Link {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lgq;"
	)
	@Export("previous")
	public Link previous;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lgq;"
	)
	@Export("next")
	public Link next;

	@ObfuscatedName("f")
	@Export("remove")
	public void remove() {
		if (this.next != null) {
			this.next.previous = this.previous;
			this.previous.next = this.next;
			this.previous = null;
			this.next = null;
		}
	}
}
