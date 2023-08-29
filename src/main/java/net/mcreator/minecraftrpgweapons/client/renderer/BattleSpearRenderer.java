package net.mcreator.minecraftrpgweapons.client.renderer;

public class BattleSpearRenderer extends EntityRenderer<BattleSpearEntity> {

	private static final ResourceLocation texture = new ResourceLocation("minecraft_rpgweapons:textures/entities/spear.png");

	private final ModelSpear model;

	public BattleSpearRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelSpear(context.bakeLayer(ModelSpear.LAYER_LOCATION));
	}

	@Override
	public void render(BattleSpearEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(BattleSpearEntity entity) {
		return texture;
	}

}