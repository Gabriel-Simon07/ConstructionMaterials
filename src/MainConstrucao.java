
public class MainConstrucao {

	public static void main(String[] args) {
		
		Material material = new Material();
		
		material.setNomeProduto("Casa Forte");
		material.setTipoProduto(TipoProduto.PREGO);
		material.setIdMaterial(1);
		
		System.out.println("Nome do produto :" + material.getNomeProduto());
		System.out.println("Tipo do produto :" +  material.getTipoProduto());
		System.out.println("Id do produto :" +  material.getIdMaterial());
	}

}
