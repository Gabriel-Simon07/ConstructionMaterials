import Entities.Material;
import Enums.TypeProduct;

public class MainConstruction {

	public static void main(String[] args) {
		
		Material material = new Material();
		
		material.setProductType(TypeProduct.NAIL);
		material.setIdMaterial(1);
		
		System.out.println("Product type :" +  material.getProductType());
		System.out.println("Product id :" +  material.getIdMaterial());
	}

}
