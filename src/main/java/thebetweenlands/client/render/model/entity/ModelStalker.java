package thebetweenlands.client.render.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStalker extends ModelBase {
    private final ModelRenderer root;
    private final ModelRenderer body_base;
    private final ModelRenderer body_main;
    private final ModelRenderer body_chest1;
    private final ModelRenderer body_chest2_main;
    private final ModelRenderer body_chest_right;
    private final ModelRenderer arm_lefta;
    private final ModelRenderer arm_leftb;
    private final ModelRenderer sexy_elbowhair_left1a;
    private final ModelRenderer sexy_elbowhair_left1b;
    private final ModelRenderer sexy_shoulderhair_left1a;
    private final ModelRenderer sexy_shoulderhair_left1b;
    private final ModelRenderer sexy_chesthair_right1a;
    private final ModelRenderer sexy_chesthair_left1b2;
    private final ModelRenderer body_chest_left;
    private final ModelRenderer arm_righta;
    private final ModelRenderer arm_rightb;
    private final ModelRenderer sexy_elbowhair_right1a;
    private final ModelRenderer sexy_elbowhair_right1b;
    private final ModelRenderer sexy_shoulderhair_right1a;
    private final ModelRenderer sexy_shoulderhair_right1b;
    private final ModelRenderer sexy_chesthair_left1a;
    private final ModelRenderer sexy_chesthair_left1b;
    private final ModelRenderer neckJoint;
    private final ModelRenderer neck1a;
    private final ModelRenderer neck1b;
    private final ModelRenderer head_main;
    private final ModelRenderer head_connection;
    private final ModelRenderer jaw_lower_left1a;
    private final ModelRenderer jaw_lower_left1b;
    private final ModelRenderer teeth_lower_left;
    private final ModelRenderer sexy_muttonchops_left1a;
    private final ModelRenderer jaw_lower_right1a;
    private final ModelRenderer jaw_lower_right1b;
    private final ModelRenderer teeth_lower_right;
    private final ModelRenderer sexy_muttonchops_right1a;
    private final ModelRenderer jaw_lower_main;
    private final ModelRenderer teeth_lower_mid;
    private final ModelRenderer ear_left1a;
    private final ModelRenderer ear_left1b;
    private final ModelRenderer ear_right1a;
    private final ModelRenderer ear_right1b;
    private final ModelRenderer teeth_upper;
    private final ModelRenderer sexy_facialhair_left1a;
    private final ModelRenderer sexy_facialhair_right1a;
    private final ModelRenderer bigeye;
    private final ModelRenderer bigEyelidTop;
    private final ModelRenderer bigEyelidBottom;
    private final ModelRenderer medEyelidTopRight;
    private final ModelRenderer medEyelidTopLeft;
    private final ModelRenderer medEyelidBottomRight;
    private final ModelRenderer medEyelidBottomLeft;
    private final ModelRenderer smallEyelidRight;
    private final ModelRenderer smallEyelidLeft;
    private final ModelRenderer arm_right1a;
    private final ModelRenderer arm_right1b;
    private final ModelRenderer sexy_elbowhair_righta;
    private final ModelRenderer sexy_elbowhair_rightb;
    private final ModelRenderer arm_left1a;
    private final ModelRenderer arm_left1b;
    private final ModelRenderer sexy_elbowhair_lefta;
    private final ModelRenderer sexy_elbowhair_leftb;
    private final ModelRenderer leg_right1a;
    private final ModelRenderer leg_right1b;
    private final ModelRenderer leg_left1a;
    private final ModelRenderer leg_left1b;

    public ModelStalker() {
        textureWidth = 128;
        textureHeight = 128;

        root = new ModelRenderer(this);
        root.setRotationPoint(0.0F, 24.0F, 0.0F);


        body_base = new ModelRenderer(this);
        body_base.setRotationPoint(0.0F, -9.0F, 6.0F);
        root.addChild(body_base);
        setRotationAngle(body_base, 1.3659F, 0.0F, 0.0F);
        body_base.cubeList.add(new ModelBox(body_base, 0, 0, -4.5F, -2.5686F, -3.4697F, 9, 5, 6, 0.0F, false));

        body_main = new ModelRenderer(this);
        body_main.setRotationPoint(0.0F, -2.5686F, 0.5303F);
        body_base.addChild(body_main);
        setRotationAngle(body_main, 0.0911F, 0.0F, 0.0F);
        body_main.cubeList.add(new ModelBox(body_main, 0, 12, -4.0F, -7.818F, -4.0083F, 8, 8, 6, 0.0F, false));

        body_chest1 = new ModelRenderer(this);
        body_chest1.setRotationPoint(0.0F, -7.818F, -0.0083F);
        body_main.addChild(body_chest1);
        setRotationAngle(body_chest1, -0.1367F, 0.0F, 0.0F);
        body_chest1.cubeList.add(new ModelBox(body_chest1, 0, 27, -4.5F, -3.4551F, -3.9627F, 9, 4, 6, 0.0F, false));

        body_chest2_main = new ModelRenderer(this);
        body_chest2_main.setRotationPoint(0.0F, -3.4551F, -4.9627F);
        body_chest1.addChild(body_chest2_main);
        setRotationAngle(body_chest2_main, -0.3187F, 0.0F, 0.0F);
        body_chest2_main.cubeList.add(new ModelBox(body_chest2_main, 0, 38, 0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F, false));

        body_chest_right = new ModelRenderer(this);
        body_chest_right.setRotationPoint(2.0F, -3.0F, 6.0F);
        body_chest2_main.addChild(body_chest_right);
        setRotationAngle(body_chest_right, 0.0F, -0.1367F, 0.0F);
        body_chest_right.cubeList.add(new ModelBox(body_chest_right, 0, 38, -2.7988F, -2.0F, -5.6716F, 6, 6, 7, 0.0F, false));

        arm_lefta = new ModelRenderer(this);
        arm_lefta.setRotationPoint(3.2012F, -1.0F, -0.6716F);
        body_chest_right.addChild(arm_lefta);
        setRotationAngle(arm_lefta, -0.5463F, 0.0F, -0.6374F);
        arm_lefta.cubeList.add(new ModelBox(arm_lefta, 40, 0, -1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F, false));

        arm_leftb = new ModelRenderer(this);
        arm_leftb.setRotationPoint(0.0F, 10.0F, 1.0F);
        arm_lefta.addChild(arm_leftb);
        setRotationAngle(arm_leftb, -1.2748F, 0.0F, 0.0F);
        arm_leftb.cubeList.add(new ModelBox(arm_leftb, 40, 13, -1.01F, 0.0F, -2.0F, 2, 10, 2, 0.0F, false));

        sexy_elbowhair_left1a = new ModelRenderer(this);
        sexy_elbowhair_left1a.setRotationPoint(0.0F, 0.0F, 0.0F);
        arm_leftb.addChild(sexy_elbowhair_left1a);
        setRotationAngle(sexy_elbowhair_left1a, -0.8652F, 0.0F, 0.0F);
        sexy_elbowhair_left1a.cubeList.add(new ModelBox(sexy_elbowhair_left1a, 105, 0, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        sexy_elbowhair_left1b = new ModelRenderer(this);
        sexy_elbowhair_left1b.setRotationPoint(0.0F, 0.0F, 1.0F);
        sexy_elbowhair_left1a.addChild(sexy_elbowhair_left1b);
        setRotationAngle(sexy_elbowhair_left1b, 0.3187F, 0.0F, 0.0F);
        sexy_elbowhair_left1b.cubeList.add(new ModelBox(sexy_elbowhair_left1b, 105, 2, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        sexy_shoulderhair_left1a = new ModelRenderer(this);
        sexy_shoulderhair_left1a.setRotationPoint(1.0F, 0.0F, 0.0F);
        arm_lefta.addChild(sexy_shoulderhair_left1a);
        setRotationAngle(sexy_shoulderhair_left1a, 0.0F, 0.0F, -0.3187F);
        sexy_shoulderhair_left1a.cubeList.add(new ModelBox(sexy_shoulderhair_left1a, 95, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        sexy_shoulderhair_left1b = new ModelRenderer(this);
        sexy_shoulderhair_left1b.setRotationPoint(0.0F, 2.0F, 0.0F);
        sexy_shoulderhair_left1a.addChild(sexy_shoulderhair_left1b);
        setRotationAngle(sexy_shoulderhair_left1b, 0.0F, 0.0F, -0.3187F);
        sexy_shoulderhair_left1b.cubeList.add(new ModelBox(sexy_shoulderhair_left1b, 95, 3, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        sexy_chesthair_right1a = new ModelRenderer(this);
        sexy_chesthair_right1a.setRotationPoint(-2.7988F, -1.0F, -5.6716F);
        body_chest_right.addChild(sexy_chesthair_right1a);
        setRotationAngle(sexy_chesthair_right1a, -0.3643F, 0.0F, 0.0F);
        sexy_chesthair_right1a.cubeList.add(new ModelBox(sexy_chesthair_right1a, 0, 52, 0.0F, 0.0F, 0.0F, 6, 2, 0, 0.0F, false));

        sexy_chesthair_left1b2 = new ModelRenderer(this);
        sexy_chesthair_left1b2.setRotationPoint(0.0F, 2.0F, 0.0F);
        sexy_chesthair_right1a.addChild(sexy_chesthair_left1b2);
        setRotationAngle(sexy_chesthair_left1b2, -0.3643F, 0.0F, 0.0F);
        sexy_chesthair_left1b2.cubeList.add(new ModelBox(sexy_chesthair_left1b2, 0, 55, 0.0F, 0.0F, 0.0F, 6, 3, 0, 0.0F, false));

        body_chest_left = new ModelRenderer(this);
        body_chest_left.setRotationPoint(-2.0F, -3.0F, 6.0F);
        body_chest2_main.addChild(body_chest_left);
        setRotationAngle(body_chest_left, 0.0F, 0.1367F, 0.0F);
        body_chest_left.cubeList.add(new ModelBox(body_chest_left, 27, 38, -3.2012F, -1.99F, -5.6716F, 6, 6, 7, 0.0F, false));

        arm_righta = new ModelRenderer(this);
        arm_righta.setRotationPoint(-3.2012F, -1.0F, -0.6716F);
        body_chest_left.addChild(arm_righta);
        setRotationAngle(arm_righta, -0.5463F, 0.0F, 0.6374F);
        arm_righta.cubeList.add(new ModelBox(arm_righta, 49, 0, -1.0F, 0.0F, -1.0F, 2, 10, 2, 0.0F, false));

        arm_rightb = new ModelRenderer(this);
        arm_rightb.setRotationPoint(0.0F, 10.0F, 1.0F);
        arm_righta.addChild(arm_rightb);
        setRotationAngle(arm_rightb, -1.2748F, 0.0F, 0.0F);
        arm_rightb.cubeList.add(new ModelBox(arm_rightb, 49, 13, -0.99F, 0.0F, -2.0F, 2, 10, 2, 0.0F, false));

        sexy_elbowhair_right1a = new ModelRenderer(this);
        sexy_elbowhair_right1a.setRotationPoint(0.0F, 0.0F, 0.0F);
        arm_rightb.addChild(sexy_elbowhair_right1a);
        setRotationAngle(sexy_elbowhair_right1a, -0.8652F, 0.0F, 0.0F);
        sexy_elbowhair_right1a.cubeList.add(new ModelBox(sexy_elbowhair_right1a, 110, 0, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        sexy_elbowhair_right1b = new ModelRenderer(this);
        sexy_elbowhair_right1b.setRotationPoint(0.0F, 0.0F, 1.0F);
        sexy_elbowhair_right1a.addChild(sexy_elbowhair_right1b);
        setRotationAngle(sexy_elbowhair_right1b, 0.3187F, 0.0F, 0.0F);
        sexy_elbowhair_right1b.cubeList.add(new ModelBox(sexy_elbowhair_right1b, 110, 2, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        sexy_shoulderhair_right1a = new ModelRenderer(this);
        sexy_shoulderhair_right1a.setRotationPoint(-1.0F, 0.0F, 0.0F);
        arm_righta.addChild(sexy_shoulderhair_right1a);
        setRotationAngle(sexy_shoulderhair_right1a, 0.0F, 0.0F, 0.3187F);
        sexy_shoulderhair_right1a.cubeList.add(new ModelBox(sexy_shoulderhair_right1a, 100, 0, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        sexy_shoulderhair_right1b = new ModelRenderer(this);
        sexy_shoulderhair_right1b.setRotationPoint(0.0F, 2.0F, 0.0F);
        sexy_shoulderhair_right1a.addChild(sexy_shoulderhair_right1b);
        setRotationAngle(sexy_shoulderhair_right1b, 0.0F, 0.0F, 0.3187F);
        sexy_shoulderhair_right1b.cubeList.add(new ModelBox(sexy_shoulderhair_right1b, 100, 3, 0.0F, 0.0F, -1.0F, 0, 2, 2, 0.0F, false));

        sexy_chesthair_left1a = new ModelRenderer(this);
        sexy_chesthair_left1a.setRotationPoint(2.7988F, -1.0F, -5.6716F);
        body_chest_left.addChild(sexy_chesthair_left1a);
        setRotationAngle(sexy_chesthair_left1a, -0.3643F, 0.0F, 0.0F);
        sexy_chesthair_left1a.cubeList.add(new ModelBox(sexy_chesthair_left1a, 27, 52, -6.0F, 0.0F, 0.0F, 6, 2, 0, 0.0F, false));

        sexy_chesthair_left1b = new ModelRenderer(this);
        sexy_chesthair_left1b.setRotationPoint(0.0F, 2.0F, 0.0F);
        sexy_chesthair_left1a.addChild(sexy_chesthair_left1b);
        setRotationAngle(sexy_chesthair_left1b, -0.3643F, 0.0F, 0.0F);
        sexy_chesthair_left1b.cubeList.add(new ModelBox(sexy_chesthair_left1b, 27, 55, -6.0F, 0.0F, 0.0F, 6, 3, 0, 0.0F, false));

        neckJoint = new ModelRenderer(this);
        neckJoint.setRotationPoint(0.0F, -4.0F, 6.0F);
        body_chest2_main.addChild(neckJoint);
        setRotationAngle(neckJoint, 0.6829F, 0.0F, 0.0F);


        neck1a = new ModelRenderer(this);
        neck1a.setRotationPoint(0.0F, 0.0F, 0.0F);
        neckJoint.addChild(neck1a);
        neck1a.cubeList.add(new ModelBox(neck1a, 0, 59, -2.0F, -3.1446F, -2.5932F, 4, 3, 4, 0.0F, false));

        neck1b = new ModelRenderer(this);
        neck1b.setRotationPoint(0.0F, -3.1446F, -0.5932F);
        neck1a.addChild(neck1b);
        setRotationAngle(neck1b, -0.182F, 0.0F, 0.0F);
        neck1b.cubeList.add(new ModelBox(neck1b, 17, 59, -2.0F, -2.6379F, -1.967F, 4, 3, 4, 0.0F, false));

        head_main = new ModelRenderer(this);
        head_main.setRotationPoint(0.0F, -2.6379F, 0.533F);
        neck1b.addChild(head_main);
        setRotationAngle(head_main, -1.5026F, 0.0F, 0.0F);
        head_main.cubeList.add(new ModelBox(head_main, 0, 67, -4.0F, -4.9977F, -6.9318F, 8, 6, 8, 0.0F, false));

        head_connection = new ModelRenderer(this);
        head_connection.setRotationPoint(0.0F, 1.0023F, 1.0682F);
        head_main.addChild(head_connection);
        head_connection.cubeList.add(new ModelBox(head_connection, 0, 82, -4.0F, 0.0F, -2.0F, 8, 2, 2, 0.0F, false));

        jaw_lower_left1a = new ModelRenderer(this);
        jaw_lower_left1a.setRotationPoint(-1.5F, 0.0F, -2.0F);
        head_connection.addChild(jaw_lower_left1a);
        setRotationAngle(jaw_lower_left1a, 0.3643F, 0.2276F, -0.0911F);
        jaw_lower_left1a.cubeList.add(new ModelBox(jaw_lower_left1a, 0, 87, -3.0F, 0.0F, -5.0F, 3, 2, 5, 0.0F, true));

        jaw_lower_left1b = new ModelRenderer(this);
        jaw_lower_left1b.setRotationPoint(0.0F, 2.0F, -5.0F);
        jaw_lower_left1a.addChild(jaw_lower_left1b);
        setRotationAngle(jaw_lower_left1b, -0.3187F, 0.0F, 0.0F);
        jaw_lower_left1b.cubeList.add(new ModelBox(jaw_lower_left1b, 17, 87, -3.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, true));

        teeth_lower_left = new ModelRenderer(this);
        teeth_lower_left.setRotationPoint(0.0F, -2.0F, -3.0F);
        jaw_lower_left1b.addChild(teeth_lower_left);
        teeth_lower_left.cubeList.add(new ModelBox(teeth_lower_left, 30, 87, -3.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        sexy_muttonchops_left1a = new ModelRenderer(this);
        sexy_muttonchops_left1a.setRotationPoint(-3.0F, 2.0F, 0.0F);
        jaw_lower_left1a.addChild(sexy_muttonchops_left1a);
        setRotationAngle(sexy_muttonchops_left1a, 0.0F, 0.0F, 0.2276F);
        sexy_muttonchops_left1a.cubeList.add(new ModelBox(sexy_muttonchops_left1a, 44, 72, 0.0F, 0.0F, -5.0F, 0, 2, 5, 0.0F, false));

        jaw_lower_right1a = new ModelRenderer(this);
        jaw_lower_right1a.setRotationPoint(1.5F, 0.0F, -2.0F);
        head_connection.addChild(jaw_lower_right1a);
        setRotationAngle(jaw_lower_right1a, 0.3643F, -0.2276F, 0.0911F);
        jaw_lower_right1a.cubeList.add(new ModelBox(jaw_lower_right1a, 0, 95, 0.0F, 0.0F, -5.0F, 3, 2, 5, 0.0F, true));

        jaw_lower_right1b = new ModelRenderer(this);
        jaw_lower_right1b.setRotationPoint(0.0F, 2.0F, -5.0F);
        jaw_lower_right1a.addChild(jaw_lower_right1b);
        setRotationAngle(jaw_lower_right1b, -0.3187F, 0.0F, 0.0F);
        jaw_lower_right1b.cubeList.add(new ModelBox(jaw_lower_right1b, 17, 95, 0.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F, true));

        teeth_lower_right = new ModelRenderer(this);
        teeth_lower_right.setRotationPoint(0.0F, -2.0F, -3.0F);
        jaw_lower_right1b.addChild(teeth_lower_right);
        teeth_lower_right.cubeList.add(new ModelBox(teeth_lower_right, 30, 95, 0.0F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

        sexy_muttonchops_right1a = new ModelRenderer(this);
        sexy_muttonchops_right1a.setRotationPoint(3.0F, 2.0F, 0.0F);
        jaw_lower_right1a.addChild(sexy_muttonchops_right1a);
        setRotationAngle(sexy_muttonchops_right1a, 0.0F, 0.0F, -0.2276F);
        sexy_muttonchops_right1a.cubeList.add(new ModelBox(sexy_muttonchops_right1a, 33, 72, 0.0F, 0.0F, -5.0F, 0, 2, 5, 0.0F, false));

        jaw_lower_main = new ModelRenderer(this);
        jaw_lower_main.setRotationPoint(0.0F, 0.5F, -2.0F);
        head_connection.addChild(jaw_lower_main);
        setRotationAngle(jaw_lower_main, 0.5463F, 0.0F, 0.0F);
        jaw_lower_main.cubeList.add(new ModelBox(jaw_lower_main, 0, 103, -2.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F, false));

        teeth_lower_mid = new ModelRenderer(this);
        teeth_lower_mid.setRotationPoint(0.0F, 0.0F, -6.0F);
        jaw_lower_main.addChild(teeth_lower_mid);
        teeth_lower_mid.cubeList.add(new ModelBox(teeth_lower_mid, 21, 103, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        ear_left1a = new ModelRenderer(this);
        ear_left1a.setRotationPoint(-4.0F, -3.9977F, -0.9318F);
        head_main.addChild(ear_left1a);
        setRotationAngle(ear_left1a, 0.0F, -0.4098F, 0.0F);
        ear_left1a.cubeList.add(new ModelBox(ear_left1a, 33, 64, 0.0F, -1.0F, 0.0F, 0, 4, 3, 0.0F, false));

        ear_left1b = new ModelRenderer(this);
        ear_left1b.setRotationPoint(0.0F, -1.0F, 3.0F);
        ear_left1a.addChild(ear_left1b);
        setRotationAngle(ear_left1b, 0.0F, 0.2276F, 0.0F);
        ear_left1b.cubeList.add(new ModelBox(ear_left1b, 40, 63, 0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F, false));

        ear_right1a = new ModelRenderer(this);
        ear_right1a.setRotationPoint(4.0F, -3.9977F, -0.9318F);
        head_main.addChild(ear_right1a);
        setRotationAngle(ear_right1a, 0.0F, 0.4098F, 0.0F);
        ear_right1a.cubeList.add(new ModelBox(ear_right1a, 33, 69, 0.0F, -1.0F, 0.0F, 0, 4, 3, 0.0F, false));

        ear_right1b = new ModelRenderer(this);
        ear_right1b.setRotationPoint(0.0F, -1.0F, 3.0F);
        ear_right1a.addChild(ear_right1b);
        setRotationAngle(ear_right1b, 0.0F, -0.2276F, 0.0F);
        ear_right1b.cubeList.add(new ModelBox(ear_right1b, 40, 68, 0.0F, 0.0F, 0.0F, 0, 4, 4, 0.0F, false));

        teeth_upper = new ModelRenderer(this);
        teeth_upper.setRotationPoint(0.0F, 1.0023F, -6.9318F);
        head_main.addChild(teeth_upper);
        teeth_upper.cubeList.add(new ModelBox(teeth_upper, 0, 112, -4.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F, false));

        sexy_facialhair_left1a = new ModelRenderer(this);
        sexy_facialhair_left1a.setRotationPoint(-4.0F, -2.4977F, -1.9318F);
        head_main.addChild(sexy_facialhair_left1a);
        setRotationAngle(sexy_facialhair_left1a, -0.4098F, -0.4098F, 0.0F);
        sexy_facialhair_left1a.cubeList.add(new ModelBox(sexy_facialhair_left1a, 49, 65, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        sexy_facialhair_right1a = new ModelRenderer(this);
        sexy_facialhair_right1a.setRotationPoint(4.0F, -2.4977F, -1.9318F);
        head_main.addChild(sexy_facialhair_right1a);
        setRotationAngle(sexy_facialhair_right1a, -0.4098F, 0.4098F, 0.0F);
        sexy_facialhair_right1a.cubeList.add(new ModelBox(sexy_facialhair_right1a, 49, 70, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        bigeye = new ModelRenderer(this);
        bigeye.setRotationPoint(0.0F, -2.9977F, -5.9318F);
        head_main.addChild(bigeye);
        setRotationAngle(bigeye, -0.0911F, 0.0F, 0.0F);
        bigeye.cubeList.add(new ModelBox(bigeye, 54, 67, -2.0F, -2.1737F, -2.1903F, 4, 4, 4, 0.0F, false));

        bigEyelidTop = new ModelRenderer(this);
        bigEyelidTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        bigeye.addChild(bigEyelidTop);
        bigEyelidTop.cubeList.add(new ModelBox(bigEyelidTop, 34, 58, -2.0F, -2.1737F, -2.1902F, 4, 2, 5, 0.0F, false));

        bigEyelidBottom = new ModelRenderer(this);
        bigEyelidBottom.setRotationPoint(0.0F, 0.0F, 0.0F);
        bigeye.addChild(bigEyelidBottom);
        bigEyelidBottom.cubeList.add(new ModelBox(bigEyelidBottom, 58, 58, -2.0F, -0.1737F, -2.1902F, 4, 2, 5, 0.0F, false));

        medEyelidTopRight = new ModelRenderer(this);
        medEyelidTopRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        head_main.addChild(medEyelidTopRight);
        medEyelidTopRight.cubeList.add(new ModelBox(medEyelidTopRight, 0, 4, -4.0F, -3.9977F, -6.9318F, 1, 1, 1, 0.0F, false));

        medEyelidTopLeft = new ModelRenderer(this);
        medEyelidTopLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        head_main.addChild(medEyelidTopLeft);
        medEyelidTopLeft.cubeList.add(new ModelBox(medEyelidTopLeft, 0, 4, 3.0F, -3.9977F, -6.9318F, 1, 1, 1, 0.0F, true));

        medEyelidBottomRight = new ModelRenderer(this);
        medEyelidBottomRight.setRotationPoint(-1.0F, 1.0F, -1.0F);
        head_main.addChild(medEyelidBottomRight);
        medEyelidBottomRight.cubeList.add(new ModelBox(medEyelidBottomRight, 0, 2, -3.0F, -3.9977F, -5.9318F, 1, 1, 1, 0.0F, false));

        medEyelidBottomLeft = new ModelRenderer(this);
        medEyelidBottomLeft.setRotationPoint(0.0F, 1.0F, 0.0F);
        head_main.addChild(medEyelidBottomLeft);
        medEyelidBottomLeft.cubeList.add(new ModelBox(medEyelidBottomLeft, 0, 2, 3.0F, -3.9977F, -6.9318F, 1, 1, 1, 0.0F, true));

        smallEyelidRight = new ModelRenderer(this);
        smallEyelidRight.setRotationPoint(0.0F, 0.0F, 2.0F);
        head_main.addChild(smallEyelidRight);
        smallEyelidRight.cubeList.add(new ModelBox(smallEyelidRight, 0, 11, -4.0F, -3.9977F, -6.9318F, 1, 1, 1, 0.0F, false));

        smallEyelidLeft = new ModelRenderer(this);
        smallEyelidLeft.setRotationPoint(0.0F, 0.0F, 2.0F);
        head_main.addChild(smallEyelidLeft);
        smallEyelidLeft.cubeList.add(new ModelBox(smallEyelidLeft, 0, 11, 3.0F, -3.9977F, -6.9318F, 1, 1, 1, 0.0F, true));

        arm_right1a = new ModelRenderer(this);
        arm_right1a.setRotationPoint(4.5F, -1.4551F, -1.9627F);
        body_chest1.addChild(arm_right1a);
        setRotationAngle(arm_right1a, -0.0456F, -0.2731F, -0.4098F);
        arm_right1a.cubeList.add(new ModelBox(arm_right1a, 58, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

        arm_right1b = new ModelRenderer(this);
        arm_right1b.setRotationPoint(0.0F, 8.0F, 1.0F);
        arm_right1a.addChild(arm_right1b);
        setRotationAngle(arm_right1b, -1.0472F, 0.0F, 0.0F);
        arm_right1b.cubeList.add(new ModelBox(arm_right1b, 58, 11, -0.99F, 0.0F, -2.0F, 2, 9, 2, 0.0F, false));

        sexy_elbowhair_righta = new ModelRenderer(this);
        sexy_elbowhair_righta.setRotationPoint(0.0F, 0.0F, 0.0F);
        arm_right1b.addChild(sexy_elbowhair_righta);
        setRotationAngle(sexy_elbowhair_righta, -1.1383F, 0.0F, 0.0F);
        sexy_elbowhair_righta.cubeList.add(new ModelBox(sexy_elbowhair_righta, 105, 5, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        sexy_elbowhair_rightb = new ModelRenderer(this);
        sexy_elbowhair_rightb.setRotationPoint(0.0F, 0.0F, 1.0F);
        sexy_elbowhair_righta.addChild(sexy_elbowhair_rightb);
        setRotationAngle(sexy_elbowhair_rightb, 0.3187F, 0.0F, 0.0F);
        sexy_elbowhair_rightb.cubeList.add(new ModelBox(sexy_elbowhair_rightb, 105, 7, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        arm_left1a = new ModelRenderer(this);
        arm_left1a.setRotationPoint(-4.5F, -1.4551F, -1.9627F);
        body_chest1.addChild(arm_left1a);
        setRotationAngle(arm_left1a, -0.0456F, 0.2731F, 0.4098F);
        arm_left1a.cubeList.add(new ModelBox(arm_left1a, 67, 0, -1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F, false));

        arm_left1b = new ModelRenderer(this);
        arm_left1b.setRotationPoint(0.0F, 8.0F, 1.0F);
        arm_left1a.addChild(arm_left1b);
        setRotationAngle(arm_left1b, -1.0472F, 0.0F, 0.0F);
        arm_left1b.cubeList.add(new ModelBox(arm_left1b, 67, 11, -1.01F, 0.0F, -2.0F, 2, 9, 2, 0.0F, false));

        sexy_elbowhair_lefta = new ModelRenderer(this);
        sexy_elbowhair_lefta.setRotationPoint(0.0F, 0.0F, 0.0F);
        arm_left1b.addChild(sexy_elbowhair_lefta);
        setRotationAngle(sexy_elbowhair_lefta, -1.1383F, 0.0F, 0.0F);
        sexy_elbowhair_lefta.cubeList.add(new ModelBox(sexy_elbowhair_lefta, 110, 5, -1.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        sexy_elbowhair_leftb = new ModelRenderer(this);
        sexy_elbowhair_leftb.setRotationPoint(0.0F, 0.0F, 1.0F);
        sexy_elbowhair_lefta.addChild(sexy_elbowhair_leftb);
        setRotationAngle(sexy_elbowhair_leftb, 0.3187F, 0.0F, 0.0F);
        sexy_elbowhair_leftb.cubeList.add(new ModelBox(sexy_elbowhair_leftb, 110, 7, -1.0F, 0.0F, 0.0F, 2, 0, 2, 0.0F, false));

        leg_right1a = new ModelRenderer(this);
        leg_right1a.setRotationPoint(3.5F, 1.9314F, 0.5303F);
        body_base.addChild(leg_right1a);
        setRotationAngle(leg_right1a, -0.6829F, 0.2731F, -1.0472F);
        leg_right1a.cubeList.add(new ModelBox(leg_right1a, 76, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, false));

        leg_right1b = new ModelRenderer(this);
        leg_right1b.setRotationPoint(1.0F, 8.0F, 0.0F);
        leg_right1a.addChild(leg_right1b);
        setRotationAngle(leg_right1b, 0.0F, 0.0F, 0.8652F);
        leg_right1b.cubeList.add(new ModelBox(leg_right1b, 76, 12, -2.0F, 0.0F, -0.99F, 2, 9, 2, 0.0F, false));

        leg_left1a = new ModelRenderer(this);
        leg_left1a.setRotationPoint(-3.5F, 1.9314F, 0.5303F);
        body_base.addChild(leg_left1a);
        setRotationAngle(leg_left1a, -0.6829F, -0.2731F, 1.0472F);
        leg_left1a.cubeList.add(new ModelBox(leg_left1a, 85, 0, -1.0F, -1.0F, -1.0F, 2, 9, 2, 0.0F, true));

        leg_left1b = new ModelRenderer(this);
        leg_left1b.setRotationPoint(-1.0F, 8.0F, 0.0F);
        leg_left1a.addChild(leg_left1b);
        setRotationAngle(leg_left1b, 0.0F, 0.0F, -0.8652F);
        leg_left1b.cubeList.add(new ModelBox(leg_left1b, 85, 12, 0.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        root.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
