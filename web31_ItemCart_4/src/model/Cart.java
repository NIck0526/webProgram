package model;

public class Cart {
	private String url;
	private String name;
	private int price;
	private int quantity;
	public Cart(String url, String name, int price, int quantity) {
		super();
		this.url = url;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Cart [url=" + url + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}
