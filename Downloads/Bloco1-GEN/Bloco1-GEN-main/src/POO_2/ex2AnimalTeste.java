package POO_2;

public class ex2AnimalTeste {

	public static void main(String[] args) {

		ex2Cachorro cachorro = new ex2Cachorro("Meggy", 11, true);
		cachorro.setSom("Au au");
		
		ex2Cavalo cavalo = new ex2Cavalo("Pluma", 23, true);
		cavalo.setSom("IHIHIHIHI");
		
		ex2Preguica preguica = new ex2Preguica("Soneca", 35, true);
		preguica.setSom("zZZzzzzZZz");
	
		/*cachorro.imprimirInfo();
		cachorro.imprimirMovimento();
		
		cavalo.imprimirInfo();
		cavalo.imprimirMovimento();
		
		preguica.imprimirInfo();
		preguica.imprimirMovimento();
		System.out.println(" ");*/
		
		ex2AnimalBase[] animais = new ex2AnimalBase[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(ex2AnimalBase animal:animais) {
			System.out.println(animal.getSom());
		}
	}
}