package thebetweenlands.client.audio.ambience.list;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import thebetweenlands.client.audio.ambience.AmbienceType;
import thebetweenlands.common.world.storage.chunk.storage.location.LocationAmbience;
import thebetweenlands.common.world.storage.chunk.storage.location.LocationAmbience.EnumLocationAmbience;
import thebetweenlands.common.world.storage.chunk.storage.location.LocationStorage;

public class LocationAmbienceType extends AmbienceType {
	private final EnumLocationAmbience ambience;
	private final SoundEvent sound;

	public LocationAmbienceType(EnumLocationAmbience ambience, SoundEvent sound) {
		this.ambience = ambience;
		this.sound = sound;
	}

	protected LocationAmbience getAmbience() {
		return LocationStorage.getAmbience(this.getPlayer());
	}

	@Override
	public boolean isActive() {
		return this.getAmbience() != null && this.getAmbience().type == this.ambience;
	}

	@Override
	public EnumAmbienceLayer getAmbienceLayer() {
		return EnumAmbienceLayer.LAYER1;
	}

	@Override
	public int getPriority() {
		return 5;
	}

	@Override
	public boolean stopsMusic() {
		return true;
	}

	@Override
	public SoundCategory getCategory() {
		return SoundCategory.AMBIENT;
	}

	@Override
	public SoundEvent getSound() {
		return this.sound;
	}
}
