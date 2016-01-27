package lellson.wizardingtools.client;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import cpw.mods.fml.client.registry.RenderingRegistry;
import lellson.wizardingtools.entity.entityAxeProjectile;
import lellson.wizardingtools.entity.entityLaserProjectile;
import lellson.wizardingtools.entity.render.renderAxe;
import lellson.wizardingtools.entity.render.renderLaser;
import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingCommonProxy;

public class WizardingClientProxy extends WizardingCommonProxy{
	
	@Override
	public void registerRenderers() {
	RenderingRegistry.registerEntityRenderingHandler(entityAxeProjectile.class, new renderAxe(WizardingItems.itemEnhancedTitanAxe));
	
	RenderingRegistry.registerEntityRenderingHandler(entityLaserProjectile.class, new renderLaser(WizardingItems.itemLaserProjectile));
	}
}
