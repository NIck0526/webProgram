package pattern.controller;

public class ProductFactory implements Factory {
	
	private static ProductFactory factory = new ProductFactory();
	private ProductFactory() {}
	public static ProductFactory getFactory() {
		return factory;
	}
	@Override
	public Product createProduct(String command) {
		Product product = null;
		if(command.equals("findModel")) {
			product = new NoteBookProduct();
		}else if(command.equals("findITV")) {
			product = new ITVProduct();
		}
		return product;
	}

}











