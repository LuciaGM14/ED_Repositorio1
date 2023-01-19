package es.studium.futbol;

public class Equipo_Futb
{

	public static void main(String[] args)
	{
		Equipo equipo1=new Equipo("juventud",1996, 426000);
		Futbolista futbolista1=new Futbolista("Cristiano","Ronaldo",false, equipo1);
		System.out.println(equipo1.getNombre()+" "+equipo1.getAnyo()+" "+equipo1.getNumeroDeSocios());
		System.out.println(futbolista1.getNombre()+" "+futbolista1.getApellido()+" "+futbolista1.isComunitario()+" "+futbolista1.getEquipo().getNombre()+""+futbolista1.getEquipo().getAnyo()+" "+futbolista1.getEquipo().getNumeroDeSocios());
		Equipo equipo2=new Equipo("Real Betis",1907,50000);
		Futbolista futbolista2=new Futbolista("Borja","Iglesias",false, equipo2);
		System.out.println(equipo2.getNombre()+" "+equipo2.getAnyo()+" "+equipo2.getNumeroDeSocios());
		System.out.println(futbolista2.getNombre()+" "+futbolista2.getApellido()+" "+futbolista2.isComunitario()+" "+futbolista2.getEquipo().getNombre()+""+futbolista2.getEquipo().getAnyo()+" "+futbolista2.getEquipo().getNumeroDeSocios());
	}

}
