package ejercicio1;

import CarritodeCompra.Descuento;
import CarritodeCompra.Producto;
import ejercicio1.itemCarrito;

public class CrearProductos {

	public static void main(String[] args) {

		String Nombre = "";
		float precio1 = 250.00f;
		float precio2 = 400.00f;
		float precio3 = 135.00f;
		int cantidad = 5;

		Producto producto1 = new Producto(Nombre, precio1);
		itemCarrito item = new itemCarrito(producto1, cantidad);
		Descuento descuento1 = new Descuento(precio1, cantidad);

		Producto producto2 = new Producto(Nombre, precio2);
		itemCarrito item2 = new itemCarrito(producto2, cantidad);
		Descuento descuento2 = new Descuento(precio2, cantidad);

		Producto producto3 = new Producto(Nombre, precio3);
		itemCarrito item3 = new itemCarrito(producto3, cantidad);
		Descuento descuento3 = new Descuento(precio3, cantidad);

		System.out.println("El precio del queso es: " + item.calcularTotal());
		System.out.println("El precio de la gaseosa es: " + item2.calcularTotal());
		System.out.println("El precio del atun es: " + item3.calcularTotal());

		System.out.println("El descuento de el primer producto es: " + descuento1.calcularDescuento());
		System.out.println("El descuento de el segundo producto es: " + descuento2.calcularDescuento());
		System.out.println("El descuento de el tercer producto es: " + descuento3.calcularDescuento());

	}

}
