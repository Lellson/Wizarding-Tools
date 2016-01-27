package lellson.wizardingtools.entity;

import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class entityRailProjectile extends EntityThrowable implements IProjectile {
	
	private int knockbackStrength = 10;
	private int deathtimer;
	

	public entityRailProjectile(World world) {
		super(world);
	}
	
	public entityRailProjectile(World world, EntityLivingBase entity)
    {
		super(world, entity);
    }
	
	public entityRailProjectile(World world, double d1, double d2, double d3)
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
            byte b0 = 25;

            position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
        }
		
        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
        
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, WizardingConfig.railExplosion, WizardingConfig.railExplosionTiles);
	}
	
	@Override
	protected float getGravityVelocity() {
		
		return 0F;
	}
	
	@Override
	protected float func_70182_d() {
		
		return 10F;
	}
	
	@Override
	public void onEntityUpdate() {
	
            this.worldObj.spawnParticle("flame", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
            
            deathtimer++;
            
            if (deathtimer >= 200) {
            	this.setDead();
            	deathtimer = 0;
            }
	}
}