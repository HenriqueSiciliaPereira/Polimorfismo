package polimorfismo1;

public abstract class Animal {
	
	//Atributos de Animal
	protected float peso;
	protected int idade;
	protected String membros;
	
	//Métodos de Animal
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getMembros() {
		return membros;
	}
	public void setMembros(String membros) {
		this.membros = membros;
	}
	
	

}
