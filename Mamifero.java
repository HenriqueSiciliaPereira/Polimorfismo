package polimorfismo1;

public class Mamifero extends Animal{
	
	private String nome;
	private String corPelo;


	@Override
	public void locomover() {
		
		System.out.println("Correndo");
		
	}

	@Override
	public void alimentar() {
		
		System.out.println("Mamando");
		
	}

	@Override
	public void emitirSom() {
		
		System.out.println("Som de Mamifero");
		
	}
	
	
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	

}
