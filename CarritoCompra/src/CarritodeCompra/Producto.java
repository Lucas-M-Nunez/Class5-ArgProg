package CarritodeCompra;

public class Producto {
	private String nombre;
	private float precio;
	
	
	public Producto (String nom, float pre) {
		this.nombre = nom;
		this.precio = pre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
