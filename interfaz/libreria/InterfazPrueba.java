package libreria;
import java.util.Scanner;

import libreria.ItemLibreria;
import libreria.Libreria;
public class InterfazPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Libreria nueva = new Libreria();
		ItemLibreria libro1= new ItemLibreria("Diario de Ana Frank", "Ana Frank", "1947", "Contact", 1001, false, 1000);
		ItemLibreria libro2= new ItemLibreria("Diario de Adan y Eva", "Mark Twain","1906", "The Apple Tree", 1002, true, 1500);
		ItemLibreria libro3= new ItemLibreria("Las aventuras de Tom Sawyer", "Mark Twain", "1876", "American Publishing Company", 1003, true, 2400);
		ItemLibreria libro4= new ItemLibreria("El fantasma de Canterville", "Oscar Wilde", "1887", "The Court and Society Review", 1004, false, 4000);

		ItemLibreria revista1= new ItemLibreria ("Caras","16/08/2022","Perfil S.A.", 2001, true, 1345);
		ItemLibreria revista2= new ItemLibreria ("Billiken", "24/04/2023","Atlantida S.A.", 2002, true, 3000);
		ItemLibreria revista3= new ItemLibreria ("Genios","23/09/2021","Argentino S.A",  2003, false, 3421);
		ItemLibreria revista4= new ItemLibreria ("Rolling Stone","17/04/2020","Unite State.", 2004, false, 4000);
		ItemLibreria carrito[] = new ItemLibreria [100];
		nueva.agregarALibreria(revista1);
		nueva.agregarALibreria(revista2);
		nueva.agregarALibreria(revista3);
		nueva.agregarALibreria(revista4);
		nueva.agregarALibreria(libro1);
		nueva.agregarALibreria(libro2);
		nueva.agregarALibreria(libro3);
		nueva.agregarALibreria(libro4);
		System.out.println("Bienvenido a la libreria");
		int dato = 0;
		do {
			System.out.println("Menu: \n1. Ver listado de libros y revistas de la libreria\n2. Agregar item al carrito\n3. Eliminar item del carrito\n4. Ver carrito\n5. Total a abonar\n0. Salir");
			dato = entrada.nextInt();
			switch(dato) {
			case 1:
				System.out.println("1. Ver listado de libros y revistas");
				for(int i = 0; i < nueva.getLista().length-1; i++) {
					if(nueva.getLista()[i] != null) {
						System.out.println(nueva.getLista()[i]);
					}
				}
				break;
			case 2:
				System.out.println("2. Agregar item al carrito");
				//seleccionar por codigo
				System.out.println("Ingrese el codigo del libro/revista que quiera agregar al carrito");
				int codigo = entrada.nextInt();
				int indice = 0;
				for(int i = 0; i < nueva.getLista().length-1; i++) {
					if(nueva.getLista()[i] != null & nueva.getLista()[i].getCodigo() == codigo) {
						carrito[indice] = nueva.getLista()[i];
						break;
					}
					indice++;
				}
				break;
			case 3:
				System.out.println("3. Eliminar item del carrito");
				System.out.println("Ingrese el codigo del libro/revista que quiera eliminar del carrito");
				int codigo2 = entrada.nextInt();
				for(int i = 0; i < carrito.length-1; i++) {
					if(carrito[i] != null && carrito[i].getCodigo() == codigo2) {
						carrito[i] = null;
						break;
					}
				}
				break;
			case 4:
				System.out.println("4. Ver carrito:");
				for(int i = 0; i < carrito.length-1; i++) {
					if(carrito[i] != null) {
						System.out.println(carrito[i].toString());
					}
				}
				System.out.println(carrito[1]);
				break;
			case 5:
				System.out.println("5. Total a abonar");
				double precio = 0.0;
				for(int i = 0; i < carrito.length-1; i++) {
					if(carrito[i] != null) {
						precio += carrito[i].getPrecioDeVenta();
					}
				}
				System.out.println("El total a abonar es: $" + precio);
				break;
			case 0:
				System.out.println("Gracias por usar el sistema");
				break;
			default:
				System.out.println("Ingrese un valor válido");
				break;
			}
			
		}while(dato != 0);
	}

}
