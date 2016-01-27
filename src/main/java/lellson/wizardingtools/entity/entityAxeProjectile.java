package lellson.wizardingtools.entity;

import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class entityAxeProjectile extends EntityThrowable {
	
	private int knockbackStrength = 10;
	

	public entityAxeProjectile(World world) {
		super(world);
	}
	
	public entityAxeProjectile(World world, EntityLivingBase entity)
    {
		super(world, entity);
    }
	
	public entityAxeProjectile(World world, double d1, double d2, double d3)
    {
		super(world, d1, d2, d3);
    }
	
	public int getKnockbackStrength() {
		return 10;
	}
	
	public void setKnockbackStrength(int knockback)
    {
        this.knockbackStrength = knockback;
    }

	@Override
	protected void onImpact(MovingObjectPosition position) {
		
		if (position.entityHit != null)
        {
            byte b0 = WizardingConfig.axeDamage;

            position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }
		
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX + 0.2, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX - 0.2, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY, this.posZ + 0.2, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY, this.posZ - 0.2, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.2, this.posZ, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY - 0.2, this.posZ, 0.0D, 0.0D, 0.0D);
        }
		
		for (int l = 0; l < 2; ++l)
        {
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
            this.entityDropItem(new ItemStack(WizardingItems.itemEnhancedTitanAxe), 1);
        }
        
         }
	
		@Override
		public void onEntityUpdate() {
		
	            this.worldObj.spawnParticle("smoke", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
		}

}