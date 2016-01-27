package lellson.wizardingtools.entity;

import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class entityEnderBeltProjectile extends EntityThrowable implements IProjectile {
	
	private int knockbackStrength;
	private int deathtimer;
	

	public entityEnderBeltProjectile(World world) {
		super(world);
	}
	
	public entityEnderBeltProjectile(World world, EntityLivingBase entity)
    {
		super(world, entity);
    }
	
	public entityEnderBeltProjectile(World world, double d1, double d2, double d3)
    {
		super(world, d1, d2, d3);
    }

	protected void onImpact(MovingObjectPosition pos)
    {
        for (int i = 0; i < 32; ++i)
        {
            this.worldObj.spawnParticle("portal", this.posX, this.posY + this.rand.nextDouble() * 2.0D, this.posZ, this.rand.nextGaussian(), 0.0D, this.rand.nextGaussian());
        }

        if (!this.worldObj.isRemote)
        {
            if (this.getThrower() != null && this.getThrower() instanceof EntityPlayerMP)
            {
                EntityPlayerMP entityplayermp = (EntityPlayerMP)this.getThrower();

                if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj)
                {
                    EnderTeleportEvent event = new EnderTeleportEvent(entityplayermp, this.posX, this.posY, this.posZ, 5.0F);
                    if (!MinecraftForge.EVENT_BUS.post(event))
                    if (this.getThrower().isRiding())
                    {
                        this.getThrower().mountEntity((Entity)null);
                    }

                    this.getThrower().setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
                    this.getThrower().fallDistance = 0.0F;
                    this.getThrower().attackEntityFrom(DamageSource.fall, event.attackDamage);
                    }
                }
            }

            this.setDead();
        }
	
		@Override
		public void onEntityUpdate() {
		
			this.worldObj.spawnParticle("portal", this.posX, this.posY + this.rand.nextDouble() * 2.0D, this.posZ, this.rand.nextGaussian(), 0.0D, this.rand.nextGaussian());
	            
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
			
			return 6F;
		}
}
