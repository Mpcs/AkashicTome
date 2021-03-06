package vazkii.akashictome;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.SpecialRecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(AkashicTome.MOD_ID)
public class RecipeSerializer {

    @ObjectHolder("attachment")
    public static IRecipeSerializer<AttachementRecipe> ATTACHMENT;

    @Mod.EventBusSubscriber(modid = AkashicTome.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Registration {
        @SubscribeEvent
        public static void onRecipeSerializerRegistry(final RegistryEvent.Register<IRecipeSerializer<?>> event) {
            IForgeRegistry<IRecipeSerializer<?>> registry = event.getRegistry();
            registry.register(new SpecialRecipeSerializer<>(AttachementRecipe::new).setRegistryName(AkashicTome.MOD_ID, "attachment"));
        }
    }
}
