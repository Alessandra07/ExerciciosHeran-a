package Animais09;

public class Cachorro01 implements Animais009 {

	@Override
	public void Nome() {
		System.out.println("Nome: Meg");
		
	}

	@Override
	public void Idade() {
		System.out.println("Idade: 3 anos");
		
	}

	@Override
	public void DeveEmitirSom() {
		System.out.println("Som: AUAUAU");
		
	}
	
	public void DeveCorrer() {
		System.out.println("Corre: Sim ");
	
	}

}
