package ejercicio1;

import CarritodeCompra.Producto;

public class itemCarrito {

	private Producto producto;
	private int cantidad;
	
	public itemCarrito() {
		
	}

    public itemCarrito(Producto producto, int cantidad) {
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

	public String calcularTotal() {
	   double total = this.getCantidad() * this.getProducto().getPrecio();
	   return String.valueOf(total);
		
	}
	
}
