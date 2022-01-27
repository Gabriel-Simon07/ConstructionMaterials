package Entities;
import Enums.TypeProduct;

public class Material {
	
	private int idMaterial;
	private TypeProduct productType;
	
	public Material() {
		
	}

	public int getIdMaterial() {
		return idMaterial;
	}

	public void setIdMaterial(int idMaterial) {
		this.idMaterial = idMaterial;
	}

	public TypeProduct getProductType() {
		return productType;
	}

	public void setProductType(TypeProduct productType) {
		this.productType = productType;
	}
}
