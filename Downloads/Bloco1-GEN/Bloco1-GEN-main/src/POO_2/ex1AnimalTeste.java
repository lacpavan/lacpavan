package POO_2;

public class ex1AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1Cachorro cachorro1  = new ex1Cachorro("Meggy","Au,au",11,true);
		ex1Cavalo cavalo1= new ex1Cavalo("Pluma","IHIHIHIH",23,true);
		ex1Preguica preguica1= new ex1Preguica("Soneca","zZzZzZz",35,true);
		
		cachorro1.imprimirInfo();
		cachorro1.imprimirMovimento();
		
		cavalo1.imprimirInfo();
		cavalo1.imprimirMovimento();
		
		preguica1.imprimirInfo();
		preguica1.imprimirMovimento();
	}

}