package filme;

public class main {

	public static void main(String[] args) {

		// classe 
		
   class Filme{
			private String titulo;
			private int tempo_Minuto;
			private String genero;
			
		//construtor
			
	    public Filme(String titulo, int tempo_Minuto, String genero) {
			this.titulo = titulo;
			this.tempo_Minuto = tempo_Minuto;
			this.genero = genero;
	    }
			
	     //encapsular atributos
			
			
	    //encapsulamento titulo(set e get)
			
	  public String getTitulo(){
			return titulo;
     
            public void setTitulo(String titulo) {
           
			     if(titulo == null) {
				    throw new IllegalArgumentException("O título não pode estar vazio.");
			     }
           }
      }
	  
   } 
	  
	
		 // encapsulamento tempo minuto(set e get)
	
		 
		 public int getTempo_minuto() {
			 return tempo_Minuto;
		 }
		 
		 public void setTempo_minuto(int tempo_minuto) {
			 if(tempo_minuto <= 0) {
			    throw new IllegalArgumentException("A duração deve ser maior que zero.");
			 }
		 }
		 
		 //encapsulamento gênero(set e get)
		 
		 public String getGenero() {
			 return genero;
		 }
		 
		 public void setGenero(String genero) {
			 if (genero == null);
			 throw new IllegalArgumentException("O gênero de ser: Terror, romance ou comédia.");
		 }
	

		 
		 //exibir informações
		  return "Título:"+ titulo + "/ Tempo duração:" + tempo_Minuto + "/ Gênero:" + genero;
		 
	  
				
    }
}
      

//Não consegui resolver o prolema do public void na linha 30


