//FASE 3:
//Tots els propulsors tindran una potència actual que començarà amb 0. 
//El coet tindrà dos mètodes, accelerar o frenar i  
// augmentarà o es reduirà de 10 en 10 la potencia del propulsor.  
//El coet tindrà una velocitat actual que és la suma de totes les 
//potències dels seus propulsors.

//Modifiquem en el main anterior: 
// Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. 
// El primer coet tindrà tres propulsors (potència: 10,30,80) 
// i el segon sis propulsors (potència: 30,40,50,50,30,10). 
// Mostrar a pantalla el codi dels coets, 
// el número de propulsors que té i la potència màxima de cada propulsor.
//
// Mostrar a pantalla la velocitat actual dels coets
// Accelerar amb els coets tres cops
// Mostrar a pantalla la velocitat actual
// Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
// Mostrar a pantalla la velocitat actual
// Accelerar 15 cops amb els dos coets.
// Mostrar a pantalla la velocitat actual




public class Main {
        public static void main(String[] args) {
        Coet coet1;
        Coet coet2;
		try {
			coet1 = new Coet("32WESSDS");
			coet1.addPropulsor(10);
			coet1.addPropulsor(30); 
			coet1.addPropulsor(80);
			
			coet2 = new Coet("LDSFJA32");
			coet2.addPropulsor(10);
			coet2.addPropulsor(40);
			coet2.addPropulsor(50);
			coet2.addPropulsor(50);
			coet2.addPropulsor(30);
			coet2.addPropulsor(10);
			print(coet1, "inici");
			print(coet2, "inici");
			
			coet1.accelerar(3);
			coet2.accelerar(3);
			print(coet1, "accelerat 3");
			print(coet2, "accelerat 3");
			
	 		coet1.frenar(5);
	 		coet2.accelerar(7);
			print(coet1, "frenat 5");
			print(coet2, "accelerat 7");

			coet1.accelerar(15);
			coet2.accelerar(15);
			print(coet1, "accelerat 15");
			print(coet2, "accelerat 15");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {}
       	         
       
       
	
	}
        public static void print(Coet coet, String text) {System.out.println(        		
        		" coet: "+coet.getCodi()+
        		" ,"+text+
        		", Nombre Prop.: "+coet.getNumpropulsors()+
         		" Potencies "+coet.getPropulsors()+
         		" Velocitat actual "+coet.getVelocitat()       		
      		   );}
}
