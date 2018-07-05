//FASE 1:
//Volem fer un software de carreres de coets. 
//Un coet està identificat per un codi de 8 caràcters i un número de propulsors. 
//Realitza els següents passos:
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. 
//El primer coet tindrà tres propulsors i el segon sis propulsors.
//Mostrar a pantalla el codi dels coets i el número de propulsors que té.

public class Main {
	public static void main(String[] args) {
		Coet coet1 = new Coet("32WESSDS",3);
		Coet coet2 = new Coet("LDSFJA32",6);
		
		System.out.println("Coet1: "+coet1.getCodi()+" , propulsors: "+coet1.getPropulsors());
		System.out.println("Coet2: "+coet2.getCodi()+" , propulsors: "+coet2.getPropulsors());
	}
}
