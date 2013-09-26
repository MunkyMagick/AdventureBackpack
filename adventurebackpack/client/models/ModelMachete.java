// Date: 15.09.2013 01:33:29
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package adventurebackpack.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMachete extends ModelBase {
	// fields
	ModelRenderer blade;
	ModelRenderer handle;

	public ModelMachete() {
		textureWidth = 512;
		textureHeight = 256;

		// field
		blade = new ModelRenderer(this, 0, 0);
		blade.addBox(0F, 0F, 0F, 0, 67, 9);
		blade.setRotationPoint(-1.5F, 2.5F, -46F);
		blade.setTextureSize(512, 256);
		
		setRotation(blade, 1.53589F, 0F, 0F);
		handle = new ModelRenderer(this, 42, 0);
		handle.addBox(0F, 0F, 0F, 10, 32, 16);
		handle.setRotationPoint(-6.5F, 10F, 20F);
		handle.setTextureSize(512, 256);
		
		setRotation(handle, 1.570796F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		blade.render(f5);
		handle.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
