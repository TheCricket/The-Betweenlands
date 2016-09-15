package thebetweenlands.client.audio.ambience.list;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import thebetweenlands.client.audio.ambience.AmbienceType;
import thebetweenlands.common.registries.SoundRegistry;
import thebetweenlands.common.world.WorldProviderBetweenlands;

public class CaveAmbienceType extends AmbienceType {
	@Override
	public boolean isActive() {
		return this.getPlayer().posY <= WorldProviderBetweenlands.CAVE_START;
	}

	@Override
	public EnumAmbienceLayer getAmbienceLayer() {
		return EnumAmbienceLayer.LAYER1;
	}

	@Override
	public int getPriority() {
		return 0;
	}

	@Override
	public SoundCategory getCategory() {
		return SoundCategory.AMBIENT;
	}

	@Override
	public SoundEvent getSound() {
		return SoundRegistry.AMBIENT_CAVE;
	}
}
