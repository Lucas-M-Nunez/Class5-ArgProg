package Clases;

import Clases.Item;

public class Compra {
	
	private double total;
	private Item[] items;
	
	
	public String carritoPrecio() {
		for ( int i = 0; i<6; i++) {
			Item it = this.getItems()[i];
			if (it != null) {
				total += it.carritoPrecioDouble();
			}
			
		}
		return String.valueOf(total);
	}
	
	public Compra() {
		items = new Item[6];
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	
}
