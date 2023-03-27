package Ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Clases.Compra;
import Clases.Item;
import Clases.Producto;

public class CargarArchivos {

	public static void main(String[] args) {
		try {
			Compra compra = new Compra();
			int i = 0;
			for (String linea : Files.readAllLines(Paths.get("src\\Archivos\\items.txt"))) {
				
				
				String nombre = (linea.split("	")[0]);
				int cantidad = Integer.parseInt(linea.split("	")[1]);
				double precio = Double.parseDouble(linea.split("	")[2]);
				
				Producto prod = new Producto(nombre, precio);
				Item item = new Item(prod, cantidad, prod);  
				compra.getItems()[i]=item;
				i++;
				System.out.println("El total de los productos es "+item.carritoPrecio());
				
			}
			System.out.println("El total de la compra es "+compra.carritoPrecio());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
