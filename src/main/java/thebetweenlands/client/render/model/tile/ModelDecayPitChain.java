package thebetweenlands.client.render.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelDecayPitChain extends ModelBase {
    ModelRenderer chain_mid_leftpiece;
    ModelRenderer chain_mid_rightpiece;
    ModelRenderer chain_mid_toppiece;
    ModelRenderer chain_mid_cornerpiece_topleft;
    ModelRenderer chain_mid_cornerpiece_topright;
    ModelRenderer chain_mid_bottompiece;
    ModelRenderer chain_mid_cornerpiece_bottomleft;
    ModelRenderer chain_mid_cornerpiece_bottomright;
    ModelRenderer chain_bottom_toppiece;
    ModelRenderer chain_bottom_frontpiece;
    ModelRenderer chain_bottom_backpiece;
    ModelRenderer chain_bottom_cornerpiece_topfront;
    ModelRenderer chain_bottom_cornerpiece_topback;
    ModelRenderer chain_top_bottompiece;
    ModelRenderer chain_top_frontpiece;
    ModelRenderer chain_top_backpiece;
    ModelRenderer chain_top_cornerpiece_bottomfront;
    ModelRenderer chain_top_cornerpiece_bottomback;
    ModelRenderer fancy_midchain_left_front;
    ModelRenderer fancy_midchain_left_back;
    ModelRenderer fancy_midchain_right_front;
    ModelRenderer fancy_midchain_right_back;
    ModelRenderer fancy_bottomchain_front_left;
    ModelRenderer fancy_bottomchain_front_right;
    ModelRenderer fancy_bottomchain_back_left;
    ModelRenderer fancy_topchain_front_left;
    ModelRenderer fancy_topchain_front_right;
    ModelRenderer fancy_topchain_back_left;
    ModelRenderer fancy_topchain_back_right;
    ModelRenderer fancy_bottomchain_back_right;

    public ModelDecayPitChain() {
        textureWidth = 64;
        textureHeight = 64;
        fancy_bottomchain_front_left = new ModelRenderer(this, 0, 38);
        fancy_bottomchain_front_left.setRotationPoint(1.5F, 24.0F, -5.0F);
        fancy_bottomchain_front_left.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_bottomchain_front_left, 0.0F, -0.091106186954104F, 0.0F);
        fancy_topchain_back_right = new ModelRenderer(this, 15, 42);
        fancy_topchain_back_right.setRotationPoint(-1.5F, 8.0F, 5.0F);
        fancy_topchain_back_right.addBox(-1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_topchain_back_right, 0.0F, -0.091106186954104F, 0.0F);
        chain_top_cornerpiece_bottomback = new ModelRenderer(this, 41, 27);
        chain_top_cornerpiece_bottomback.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_top_cornerpiece_bottomback.addBox(-1.5F, -3.0F, 2.0F, 3, 1, 2, 0.0F);
        chain_mid_rightpiece = new ModelRenderer(this, 13, 0);
        chain_mid_rightpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_rightpiece.addBox(2.0F, -5.0F, -1.5F, 3, 10, 3, 0.0F);
        chain_top_cornerpiece_bottomfront = new ModelRenderer(this, 41, 23);
        chain_top_cornerpiece_bottomfront.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_top_cornerpiece_bottomfront.addBox(-1.5F, -3.0F, -4.0F, 3, 1, 2, 0.0F);
        fancy_bottomchain_back_left = new ModelRenderer(this, 10, 38);
        fancy_bottomchain_back_left.setRotationPoint(1.5F, 24.0F, 5.0F);
        fancy_bottomchain_back_left.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_bottomchain_back_left, 0.0F, 0.091106186954104F, 0.0F);
        chain_top_backpiece = new ModelRenderer(this, 28, 23);
        chain_top_backpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_top_backpiece.addBox(-1.5F, -8.0F, 2.0F, 3, 5, 3, 0.0F);
        chain_mid_cornerpiece_topleft = new ModelRenderer(this, 41, 0);
        chain_mid_cornerpiece_topleft.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_cornerpiece_topleft.addBox(2.0F, -6.0F, -1.5F, 2, 1, 3, 0.0F);
        chain_mid_cornerpiece_topright = new ModelRenderer(this, 52, 0);
        chain_mid_cornerpiece_topright.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_cornerpiece_topright.addBox(-4.0F, -6.0F, -1.5F, 2, 1, 3, 0.0F);
        chain_mid_cornerpiece_bottomleft = new ModelRenderer(this, 41, 5);
        chain_mid_cornerpiece_bottomleft.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_cornerpiece_bottomleft.addBox(2.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F);
        chain_top_bottompiece = new ModelRenderer(this, 0, 23);
        chain_top_bottompiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_top_bottompiece.addBox(-1.5F, -4.0F, -2.0F, 3, 3, 4, 0.0F);
        fancy_topchain_front_right = new ModelRenderer(this, 5, 42);
        fancy_topchain_front_right.setRotationPoint(-1.5F, 8.0F, -5.0F);
        fancy_topchain_front_right.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_topchain_front_right, 0.0F, 0.091106186954104F, 0.0F);
        chain_bottom_cornerpiece_topfront = new ModelRenderer(this, 41, 14);
        chain_bottom_cornerpiece_topfront.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_bottom_cornerpiece_topfront.addBox(-1.5F, 2.0F, -4.0F, 3, 1, 2, 0.0F);
        fancy_midchain_left_front = new ModelRenderer(this, 0, 32);
        fancy_midchain_left_front.setRotationPoint(5.0F, 16.0F, -1.5F);
        fancy_midchain_left_front.addBox(-1.0F, -2.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(fancy_midchain_left_front, 0.0F, 0.091106186954104F, 0.0F);
        fancy_bottomchain_back_right = new ModelRenderer(this, 15, 38);
        fancy_bottomchain_back_right.setRotationPoint(-1.5F, 24.0F, 5.0F);
        fancy_bottomchain_back_right.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_bottomchain_back_right, 0.0F, -0.091106186954104F, 0.0F);
        chain_mid_cornerpiece_bottomright = new ModelRenderer(this, 52, 5);
        chain_mid_cornerpiece_bottomright.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_cornerpiece_bottomright.addBox(-4.0F, 5.0F, -1.5F, 2, 1, 3, 0.0F);
        chain_bottom_cornerpiece_topback = new ModelRenderer(this, 41, 18);
        chain_bottom_cornerpiece_topback.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_bottom_cornerpiece_topback.addBox(-1.5F, 2.0F, 2.0F, 3, 1, 2, 0.0F);
        chain_mid_leftpiece = new ModelRenderer(this, 0, 0);
        chain_mid_leftpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_leftpiece.addBox(-5.0F, -5.0F, -1.5F, 3, 10, 3, 0.0F);
        chain_mid_bottompiece = new ModelRenderer(this, 26, 7);
        chain_mid_bottompiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_bottompiece.addBox(-2.0F, 4.0F, -1.5F, 4, 3, 3, 0.0F);
        fancy_topchain_front_left = new ModelRenderer(this, 0, 42);
        fancy_topchain_front_left.setRotationPoint(1.5F, 8.0F, -5.0F);
        fancy_topchain_front_left.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_topchain_front_left, 0.0F, -0.091106186954104F, 0.0F);
        chain_bottom_frontpiece = new ModelRenderer(this, 15, 14);
        chain_bottom_frontpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_bottom_frontpiece.addBox(-1.5F, 3.0F, 2.0F, 3, 5, 3, 0.0F);
        fancy_bottomchain_front_right = new ModelRenderer(this, 5, 38);
        fancy_bottomchain_front_right.setRotationPoint(-1.5F, 24.0F, -5.0F);
        fancy_bottomchain_front_right.addBox(-1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_bottomchain_front_right, 0.0F, 0.091106186954104F, 0.0F);
        chain_bottom_backpiece = new ModelRenderer(this, 28, 14);
        chain_bottom_backpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_bottom_backpiece.addBox(-1.5F, 3.0F, -5.0F, 3, 5, 3, 0.0F);
        chain_bottom_toppiece = new ModelRenderer(this, 0, 14);
        chain_bottom_toppiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_bottom_toppiece.addBox(-1.5F, 1.0F, -2.0F, 3, 3, 4, 0.0F);
        fancy_midchain_left_back = new ModelRenderer(this, 5, 32);
        fancy_midchain_left_back.setRotationPoint(5.0F, 16.0F, 1.5F);
        fancy_midchain_left_back.addBox(-1.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F);
        setRotateAngle(fancy_midchain_left_back, 0.0F, -0.091106186954104F, 0.0F);
        fancy_midchain_right_back = new ModelRenderer(this, 15, 32);
        fancy_midchain_right_back.setRotationPoint(-5.0F, 16.0F, 1.5F);
        fancy_midchain_right_back.addBox(0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F);
        setRotateAngle(fancy_midchain_right_back, 0.0F, 0.091106186954104F, 0.0F);
        chain_top_frontpiece = new ModelRenderer(this, 15, 23);
        chain_top_frontpiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_top_frontpiece.addBox(-1.5F, -8.0F, -5.0F, 3, 5, 3, 0.0F);
        fancy_midchain_right_front = new ModelRenderer(this, 10, 32);
        fancy_midchain_right_front.setRotationPoint(-5.0F, 16.0F, -1.5F);
        fancy_midchain_right_front.addBox(0.0F, -2.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(fancy_midchain_right_front, 0.0F, -0.091106186954104F, 0.0F);
        chain_mid_toppiece = new ModelRenderer(this, 26, 0);
        chain_mid_toppiece.setRotationPoint(0.0F, 16.0F, 0.0F);
        chain_mid_toppiece.addBox(-2.0F, -7.0F, -1.5F, 4, 3, 3, 0.0F);
        fancy_topchain_back_left = new ModelRenderer(this, 10, 42);
        fancy_topchain_back_left.setRotationPoint(1.5F, 8.0F, 5.0F);
        fancy_topchain_back_left.addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
        setRotateAngle(fancy_topchain_back_left, 0.0F, 0.091106186954104F, 0.0F);
    }

    public void render(Entity entity, float scale) { 
        fancy_bottomchain_front_left.render(scale);
        fancy_topchain_back_right.render(scale);
        chain_top_cornerpiece_bottomback.render(scale);
        chain_mid_rightpiece.render(scale);
        chain_top_cornerpiece_bottomfront.render(scale);
        fancy_bottomchain_back_left.render(scale);
        chain_top_backpiece.render(scale);
        chain_mid_cornerpiece_topleft.render(scale);
        chain_mid_cornerpiece_topright.render(scale);
        chain_mid_cornerpiece_bottomleft.render(scale);
        chain_top_bottompiece.render(scale);
        fancy_topchain_front_right.render(scale);
        chain_bottom_cornerpiece_topfront.render(scale);
        fancy_midchain_left_front.render(scale);
        fancy_bottomchain_back_right.render(scale);
        chain_mid_cornerpiece_bottomright.render(scale);
        chain_bottom_cornerpiece_topback.render(scale);
        chain_mid_leftpiece.render(scale);
        chain_mid_bottompiece.render(scale);
        fancy_topchain_front_left.render(scale);
        chain_bottom_frontpiece.render(scale);
        fancy_bottomchain_front_right.render(scale);
        chain_bottom_backpiece.render(scale);
        chain_bottom_toppiece.render(scale);
        fancy_midchain_left_back.render(scale);
        fancy_midchain_right_back.render(scale);
        chain_top_frontpiece.render(scale);
        fancy_midchain_right_front.render(scale);
        chain_mid_toppiece.render(scale);
        fancy_topchain_back_left.render(scale);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
