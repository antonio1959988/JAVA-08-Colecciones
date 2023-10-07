package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
	
	public static void main(String[] args) {
		/*
		//Array
		//Tipo de dato del array, nombre, instanciadel objeto arreglo, los datos
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Esta impresion solo muestra el espacio de memoria
		System.out.println(listaDeCompras);
		
		//imprimir info de lista de compras con un foreach
		//para el dato de tipo String llamado productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		} //forEach
		
		*/
		//Implementacion de un ArrayList
		//Clase general (interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
		
		List<String> listaDeContactos = new ArrayList<>();
		
		//Agrego elementos del tipo String a mi arrayList llamado lista de contactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fatima");
		
		//Obtener un elemento de la lista - asignarlo a una variable
		String datoFelipe = listaDeContactos.get(0);
		
		System.out.println(datoFelipe);
		
		//Borrar elemento de la lista
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		//Implementacion de un conjunto(SET)
		//Sintaxis
		// Interface de donde implemento + tipo de dato que usare + nombre que le doy al conjunto + instancia de la clase especifica
		
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de treboles");
		
		//No puedo saber posiciones, solo saber si lo contiene
		if(cartasDeJuego.contains("Reina de treboles")) {
			System.out.println("La reina de tréboles si esta en el conjunto");
		} else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		//Implementacion de un mapa (hashMap) - Se define un encabezado primero, con el put se agregan elementos
		//Ejemplo tabla que almacene nombres y direcciones
		Map<String, String> libretaDeDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones, donde mi K=nombre y mi V=direccion
		libretaDeDirecciones.put("Felipe", "Tlalnepantla");
		libretaDeDirecciones.put("Dr. Simi", "CDMX");
		libretaDeDirecciones.put("Konoha", "Naruto");
		
		//Metodo para sacar informacion de la libreta
		String direccionDeFelipe = libretaDeDirecciones.get("Felipe");
		String direccionDeDrSimi = libretaDeDirecciones.get("Dr. Simi");
		String direccionDeNaruto = libretaDeDirecciones.get("Naruto"); //null
		
		//Impresion
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeDrSimi);
		System.out.println(direccionDeNaruto);
		
		
		
		
	} //metodo main
}//colecciones
/*
 * Colecciones
 * 
 *  - Arrays (arreglos)
 * Es una estrucctura de datos lineal que contiene elementos del mismo tipo
 * Los elementos estan almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a traves de un indice. Las principales caracteristicas del array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 * 		- La longitud de mi array se establece al momento de crearlo, y no cambia.
 * 		- Podemos acceder a elementos por medio de un indice.
 * 		- Los arrays pueden contener datos primitivos y objetos.
 * 		- No proporciona metodos adicionales para agregar o eliminar elementos
 * 	
 * 		Un ejemplo de array es una lista de compras del supermercado
 * 
 * 
- ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 * 
 * 
 *  Set (conjunto)
 *  
 *  Estructura de datos qu ealmacena datos unicos sin orden especifico. Las principales caracteristicas de un set son:
 *  
 *  	- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operacion se ignora.
 *  	- No hay un orden especifico, los elementos se almacenan sin orden especifico.
 *  	- La busqueda es mas sencilla, ya que al no tener elementos duplicados se usa una funcion hash para encontrar el elementos deseado.
 *  
 *  
 *  Map (mapas)
 *  Un mapa es una estructura de datos que almacena pares de clave-valor.
 *  	- Almacenamiento con pares K-V
 *  	- Sin orden especifico (similar a un set)
 *  	- Busqueda rapida, la busqueda se hace por medio de un valor (key), y usa un afunción interna hash para buscar elementos.
 *  
 *  Agenda telefonica (agregar, modificar, eliminar)
 *  
 * */
