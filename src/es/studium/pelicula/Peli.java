package es.studium.pelicula;


public class Peli
{
	
		private String titulo;
		private int ano;
		private String duracion;
		
		public Peli() {
			titulo="";
			ano=0;
			duracion="";
			
		}
			//constructor vacio
			public Peli (String tit, int an, String dur) {
				titulo= tit;
				ano= an;
			    duracion= dur;
			}

			public String getTitulo()
			{
				return titulo;
			}

			public void setTitulo(String titulo)
			{
				this.titulo = titulo;
			}

			public int getAno()
			{
				return ano;
			}

			public void setAno(int ano)
			{
				this.ano = ano;
			}

			public String getDuracion()
			{
				return duracion;
			}

			public void setDuracion(String duracion)
			{
				this.duracion = duracion;
			}

}
