package CarritodeCompra;

import java.time.LocalDateTime;

public class Carrito {
	
	private Producto producto;
	private LocalDateTime fechaCompra;
	
	public Carrito() {
		
	}

	public Carrito( Producto producto, LocalDateTime fechaCompra) {
		this.producto = producto;
		this.fechaCompra = fechaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
}
