package Clases;

import Clases.Producto;

public class Item {
	
	private Producto producto;
	private int cantidad;
	
	public Item() {
		
	}
	public Item(Producto prod, int cantidad, Producto producto) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String carritoPrecio() {
		return String.valueOf(this.carritoPrecioDouble());
	}
	public double carritoPrecioDouble(){
		double total = this.getCantidad() * this.getProducto().getPrecio();
		return total;
	}
	
}
