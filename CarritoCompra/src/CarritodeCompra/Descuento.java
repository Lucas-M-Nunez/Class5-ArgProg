package CarritodeCompra;

public class Descuento {
	private int cantidad;
	private float precio;
	private int total;
	
	public Descuento(float precio, int total) {
		this.precio = precio;
		this.total = total;
	}

	public int getCantidad() {
		return cantidad;
	}
    
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    public float getPrecio() {
		return precio;
	}

    public void setPrecio(float precio) {
		this.precio = precio;
	}
    
    public int getTotal() {
		return total;
	}
    
    public void setTotal(int total) {
		this.total = total;
	}
    
    public String calcularDescuento() {
 	   if (this.getCantidad() > 2) {
 		  precio = precio - (precio*10/100);
 	   }
 	   return String.valueOf(precio);
 		
 	}
    
 }
