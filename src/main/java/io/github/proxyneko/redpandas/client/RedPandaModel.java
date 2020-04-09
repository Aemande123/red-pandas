package io.github.proxyneko.redpandas.client;

import io.github.proxyneko.redpandas.common.entities.RedPandaEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.util.math.MathHelper;

public class RedPandaModel extends EntityModel<RedPandaEntity> {

    private final RendererModel right_ear;
    private final RendererModel left_ear;
    private final RendererModel mouth_upper;
    private final RendererModel mouth_lower;
    private final RendererModel head;
    private final RendererModel torso;
    private final RendererModel leftFrontLeg01;
    private final RendererModel leftFrontLeg02;
    private final RendererModel leftBackLeg01;
    private final RendererModel leftBackLeg02;
    private final RendererModel rightFrontLeg01;
    private final RendererModel rightFrontLeg02;
    private final RendererModel rightBackLeg01;
    private final RendererModel rightBackLeg02;
    private final RendererModel tail_butt;
    private final RendererModel tail_tip;

    public RedPandaModel() {
        textureWidth = 64;
        textureHeight = 64;

        right_ear = new RendererModel(this, 8, 9);
        right_ear.setRotationPoint(-3.5F, -1.5F, -9.0F);
        right_ear.addBox(-0.75F, -1.5F, -0.5F, 3, 3, 1, 0.0F, false);
        setRotationAngle(right_ear, 0.0F, 0.0F, 0.5236F);

        left_ear = new RendererModel(this, 0, 9);
        left_ear.setRotationPoint(3.5F, -1.5F, -9.0F);
        left_ear.addBox(-2.25F, -1.5F, -0.5F, 3, 3, 1, 0.0F, false);
        setRotationAngle(left_ear, 0.0F, 0.0F, -0.5236F);

        mouth_upper = new RendererModel(this, 0, 23);
        mouth_upper.setRotationPoint(-7.0F, -6.0F, -4.0F);
        mouth_upper.addBox(6.0F, -2.0F, -9.5F, 2, 2, 2, 0.0F, false);

        mouth_lower = new RendererModel(this, 9, 0);
        mouth_lower.setRotationPoint(-7.0F, -6F, -5.0F);
        mouth_lower.addBox(6.0F, -1.3892F, -8.8785F, 2, 1, 1, 0.0F, false);
        setRotationAngle(mouth_lower, 0.1745F, 0.0F, 0.0F);

        head = new RendererModel(this, 28, 28);
        head.setRotationPoint(0.0F, 24.0F, -1.0F);
        head.addBox(-3.0F, -11.0F, -13.0F, 6, 6, 6, 0.0F, false);

        head.addChild(mouth_lower);
        head.addChild(mouth_upper);
        head.addChild(left_ear);
        head.addChild(right_ear);

        torso = new RendererModel(this, 0, 0);
        torso.setRotationPoint(-8.0F, 18.0F, 8.0F);
        torso.addBox(4.0F, -5.75F, -16.0F, 8, 7, 16, 0.0F, false);
        setRotationAngle(torso, 0.0873F, 0.0F, 0.0F);

        leftFrontLeg01 = new RendererModel(this, 0, 37);
        leftFrontLeg01.setRotationPoint(-7.5F, 18.0F, -7.0F);
        leftFrontLeg01.addBox(9.0F, 1.0F, 0.0F, 3, 5, 3, 0.0F, false);

        leftFrontLeg02 = new RendererModel(this, 0, 27);
        leftFrontLeg02.setRotationPoint(0, 0, 0);
        leftFrontLeg02.addBox(9F, 5.0F, -1.0F, 3, 1, 1, 0.0F, false);

        leftBackLeg01 = new RendererModel(this, 0, 0);
        leftBackLeg01.setRotationPoint(-7.5F, 18.0F, 6.0F);
        leftBackLeg01.addBox(9.0F, 0.0F, 0F, 3, 6, 3, 0.0F, false);

        leftBackLeg02 = new RendererModel(this, 0, 13);
        leftBackLeg02.setRotationPoint(0, 0, 0);
        leftBackLeg02.addBox(9F, 5.0F, -1.0F, 3, 1, 1, 0.0F, false);

        rightFrontLeg01 = new RendererModel(this, 12, 37);
        rightFrontLeg01.setRotationPoint(-13.5F, 18.0F, -7.0F);
        rightFrontLeg01.addBox(9.0F, 1.0F, 0F, 3, 5, 3, 0.0F, false);

        rightFrontLeg02 = new RendererModel(this, 26, 23);
        rightFrontLeg02.setRotationPoint(0, 0, 0);
        rightFrontLeg02.addBox(9F, 5.0F, -1.0F, 3, 1, 1, 0.0F, false);

        rightBackLeg01 = new RendererModel(this, 17, 23);
        rightBackLeg01.setRotationPoint(-13.5F, 18.0F, 6.0F);
        rightBackLeg01.addBox(9.0F, 0.0F, 0F, 3, 6, 3, 0.0F, false);

        rightBackLeg02 = new RendererModel(this, 8, 13);
        rightBackLeg02.setRotationPoint(0, 0, 0);
        rightBackLeg02.addBox(9F, 5.0F, -1.0F, 3, 1, 1, 0.0F, false);

        rightBackLeg01.addChild(rightBackLeg02);
        rightFrontLeg01.addChild(rightFrontLeg02);
        leftBackLeg01.addChild(leftBackLeg02);
        leftFrontLeg01.addChild(leftFrontLeg02);

        tail_butt = new RendererModel(this, 32, 0);
        tail_butt.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(tail_butt, -0.0873F, 0.0F, 0.0F);
        tail_butt.addBox(-2.0F, 12.0F, 7.5F, 4, 4, 7, 0.0F, false);

        tail_tip = new RendererModel(this, 0, 23);
        tail_tip.setRotationPoint(0.0F, 0.0F, 0.0F);
        setRotationAngle(tail_tip, -0.1745F, 0.0F, 0.0F);
        tail_tip.addBox(-1.5F, 10.0F, 14.5F, 3, 3, 11, 0.0F, false);

        tail_butt.addChild(tail_tip);
    }

    @Override
    public void render(RedPandaEntity entity, float packedLightIn, float packedOverlayIn, float red, float green, float blue, float alpha) {
        right_ear.setRotationPoint(-3.5F, -10.5F, -9.0F);
        left_ear.setRotationPoint(3.5F, -10.5F, -9.0F);
        mouth_upper.setRotationPoint(-7.0F, -6.0F, -5.0F);
        head.render(alpha);
        torso.render(alpha);
        leftBackLeg01.render(alpha);
        leftFrontLeg01.render(alpha);
        rightFrontLeg01.render(alpha);
        rightBackLeg01.render(alpha);
        tail_butt.render(alpha);
    }

    @Override
    public void setRotationAngles(RedPandaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.head.rotateAngleX = headPitch * 0.0047F;
        this.head.rotateAngleY = netHeadYaw * 0.0047F;
        this.leftFrontLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        this.rightFrontLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
        this.rightBackLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        this.leftBackLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
        this.tail_butt.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;

    }

    private static void setRotationAngle(RendererModel RendererModel, float x, float y, float z) {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
}