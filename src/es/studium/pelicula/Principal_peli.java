package es.studium.pelicula;

public class Principal_peli
{

	public static void main(String[] args)
	{
		Peli pelicula1=new Peli();
		pelicula1.setTitulo("La momia");
		pelicula1.setAno(27);
		pelicula1.setDuracion("dos horas");
		
		
		
		Peli pelicula2=new Peli("Piratas del caribe", 10,"Dos horas y cuarenta y cinco minutos");
		System.out.println(pelicula2.getTitulo());
		
		Peli pelicula3=new Peli("Tiempo", 6,"una hora y media");
		
		
		Peli pelicula4=new Peli("Bruja", 3,"una hora y 10 minutos");
		
		
		Peli pelicula5=new Peli("Anabbel", 2,"dos horas");
		System.out.println(pelicula5.getTitulo());
		
}
}