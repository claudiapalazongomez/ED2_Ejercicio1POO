package es.studium.ejercicio1poo;

public class Perro
{
	private Raza raza;
	private float tamanio;
	private int edad;
	private String color;
	
	public Perro() {
		raza = new Raza();
		tamanio = 0.0f;
		edad = 0;
		color = "";
	}

	public Perro(Raza raza, float tamanio, int edad, String color)
	{
		this.raza = raza;
		this.tamanio = tamanio;
		this.edad = edad;
		this.color = color;
	}

	public Raza getRaza()
	{
		return raza;
	}

	public void setRaza(Raza raza)
	{
		this.raza = raza;
	}

	public float getTamanio()
	{
		return tamanio;
	}

	public void setTamanio(float tamanio)
	{
		this.tamanio = tamanio;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public String toString()
	{
		return "Perro [raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
	
	
	
}
