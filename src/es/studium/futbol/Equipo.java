package es.studium.futbol;

public class Equipo
{
private String nombre;
private int anyo;
private int numeroDeSocios;

public Equipo() {
	nombre="";
	anyo=0;
	numeroDeSocios=0;
	
}

public Equipo(String nombre, int anyo, int numeroDeSocios)
{
	this.nombre = nombre;
	this.anyo = anyo;
	this.numeroDeSocios = numeroDeSocios;
}

public String getNombre()
{
	return nombre;
}

public void setNombre(String nombre)
{
	this.nombre = nombre;
}

public int getAnyo()
{
	return anyo;
}

public void setAnyo(int anyo)
{
	this.anyo = anyo;
}

public int getNumeroDeSocios()
{
	return numeroDeSocios;
}

public void setNumeroDeSocios(int numeroDeSocios)
{
	this.numeroDeSocios = numeroDeSocios;
}

}
