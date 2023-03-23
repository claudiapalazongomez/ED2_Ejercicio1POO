package es.studium.ejercicio1poo;

public class Principal
{

	public static void main(String[] args)
	{
		Raza raza1 = new Raza("Pastor belga");
		Raza raza2 = new Raza("Fox terrier");
		Raza raza3 = new Raza("Braco alemán");
		Raza raza4 = new Raza("Bichón maltés");
		Raza raza5 = new Raza("Dálmata");
		
		Perro perro1 = new Perro(raza1, 1.2f, 10, "marrón");
		Perro perro2 = new Perro(raza2, 0.5f, 2, "blanco");
		Perro perro3 = new Perro(raza2, 0.9f, 5, "marrón oscuro");
		Perro perro4 = new Perro(raza2, 0.5f, 3, "gris");
		Perro perro5 = new Perro(raza2, 1.4f, 8, "blanco y negro");

		System.out.println("La raza del perro es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es: " + perro1.getTamanio() + ", su edad es: " + perro1.getEdad() + " y es de color: " + perro1.getColor() + ".");
		System.out.println("La raza del perro es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es: " + perro2.getTamanio() + ", su edad es: " + perro2.getEdad() + " y es de color: " + perro2.getColor() + ".");
		System.out.println("La raza del perro es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es: " + perro3.getTamanio() + ", su edad es: " + perro3.getEdad() + " y es de color: " + perro3.getColor() + ".");
		System.out.println("La raza del perro es: " + perro4.getRaza().getNombreRaza() + ", su tamaño es: " + perro4.getTamanio() + ", su edad es: " + perro4.getEdad() + " y es de color: " + perro4.getColor() + ".");
		System.out.println("La raza del perro es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es: " + perro5.getTamanio() + ", su edad es: " + perro5.getEdad() + " y es de color: " + perro5.getColor() + ".");
		
		//System.out.println(perro1.toString());
	}

}
