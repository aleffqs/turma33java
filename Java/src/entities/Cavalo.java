package entities;

public class Cavalo extends Animais {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public void correr() {
		System.out.println("Cavalo correndo....");
	}
	@Override 
	public void emitirSom() {
		System.out.println("Irccccc irccccc.");
	}

	@Override
	public void rolarChao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Override
	public void emDuasPatas() {
		System.out.println("Cavalo em duas patas....");
		
	}
	
}