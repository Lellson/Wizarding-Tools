package lellson.wizardingtools.entity;

import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class entityLaserProjectile extends EntityThrowable implements IProjectile {
	
	private int knockbackStrength;
	private int deathtimer;
	

	public entityLaserProjectile(World world) {
		super(world);
	}
	
	public entityLaserProjectile(World world, EntityLivingBase entity)
    {
		super(world, entity);
    }
	
	public entityLaserProjectile(World world, double d1, double d2, double d3)
    {
		super(world, d1, d2, d3);
    }

	@Override
	protected void onImpact(MovingObjectPosition position) {
		
		if (position.entityHit != null)
        {
            byte b0 = WizardingConfig.laserDamage;

            position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }

		for (int l = 0; l < 1; ++l)
        {
            this.worldObj.spawnParticle("reddust", this.posX + 0.2, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }
		

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
        
         }
	
		@Override
		public void onEntityUpdate() {
		
	            this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
	            
	            deathtimer++;
	            
	            if (deathtimer >= 200) {
	            	this.setDead();
	            	deathtimer = 0;
	            }
		}
		
		@Override
		protected float getGravityVelocity() {
			
			return 0F;
		}
		
		@Override
		protected float func_70182_d() {
			
			return 3F;
		}
}
