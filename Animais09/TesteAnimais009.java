package Animais09;

public class TesteAnimais009 {

	public static void main(String[] args) {
		
		System.out.println("Cachorro");
		Cachorro01 cachorro = new Cachorro01();
		cachorro.Nome();
		cachorro.Idade();
		cachorro.DeveEmitirSom();
		cachorro.DeveCorrer();
		
		System.out.println();
		
		System.out.println("Cavalo");
		Cavalo01 cavalo = new Cavalo01();
		cavalo.Nome();
		cavalo.Idade();
		cavalo.DeveEmitirSom();
		cavalo.DeveCorrer();
		
		
		System.out.println();
		
		System.out.println("Pregui�a");
		Pregui�a01 pregui�a = new Pregui�a01();
		pregui�a.Nome();
		pregui�a.Idade();
		pregui�a.DeveEmitirSom();
		pregui�a.DeveSubirenArvores();
		

	}

}
