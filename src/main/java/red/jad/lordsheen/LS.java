package red.jad.lordsheen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LS implements ModInitializer, ClientModInitializer {

	private static final String MOD_ID = "lordsheen";
	public static Identifier id(String path){
		return new Identifier(MOD_ID, path);
	}

	public static final Block COMBHEAD = new CombheadBlock();

	public static final Identifier SONG = id("song");
	public static SoundEvent SONG_EVENT = new SoundEvent(SONG);

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, id("combhead"), COMBHEAD);
		Registry.register(Registry.ITEM, id("combhead"), new BlockItem(COMBHEAD, new Item.Settings().group(ItemGroup.DECORATIONS)));
		Registry.register(Registry.SOUND_EVENT, SONG, SONG_EVENT);
	}

    @Environment(EnvType.CLIENT)
	@Override
	public void onInitializeClient(){

    }
}
