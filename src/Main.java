//FASE 3:
//
//Tots els propulsors tindran una potència actual que començarà amb 0. 
//El coet tindrà dos mètodes, accelerar o frenar i  
// augmentarà o es reduirà de 10 en 10 la potencia del propulsor.  
//El coet tindrà una velocitat actual que és la suma de totes les potències dels seus propulsors.

//Modifiquem en el main anterior: 
//
// Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. 
// El primer coet tindrà tres propulsors (potència: 10,30,80) 
// i el segon sis propulsors (potència: 30,40,50,50,30,10). 
// Mostrar a pantalla el codi dels coets, 
// el número de propulsors que té i la potència màxima de cada propulsor.
//
// Mostrar a pantalla la velocitat actual dels coets
//
// Accelerar amb els coets tres cops
//
// Mostrar a pantalla la velocitat actual
//
// Frenar cinc cops amb el primer coet (“32WESSDS”) i accelerar set amb el segon coet.
//
// Mostrar a pantalla la velocitat actual
//
// Accelerar 15 cops amb els dos coets.
//       System.out.println("Coet2: "+coet2.getCodi()+", "+coet2.getPropulsors());
// Mostrar a pantalla la velocitat actual




public class Main {
        public static void main(String[] args) {
       Coet coet1;
       try {
		coet1 = new Coet("32WESSDS");
		   coet1.addPropulsor(10);
		       coet1.addPropulsor(30);
		       coet1.addPropulsor(80);
		       coet1.accelerar(3);
		       print(coet1);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       Coet coet2;
       try {
   		coet2 = new Coet("LDSFJA32");
   		   coet2.addPropulsor(10);
   		   coet2.addPropulsor(40);
   		   coet2.addPropulsor(50);
   		   coet2.addPropulsor(50);
   		   coet2.addPropulsor(30);
   		   coet2.addPropulsor(10);
   	       print(coet2);
   	       print(coet2); 
   	} catch (Exception e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}
	       
       try {
		coet1.accelerar(3);
		   coet2.accelerar(3);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	       
	       
	       
	       coet1.frenar(5);
	       print(coet1);
	       coet1.accelerar(15);
	       print(coet1);
	                   
       
       
	
	}
        
        

        public static void print(Coet coet) {System.out.println("coet: "+coet.getCodi()+", "
         		+ "Nombre Prop.: "+coet.getNumpropulsors()+
         		" Potencies "+coet.getPropulsors()+
         		" Velocitat actual "+coet.getVelocitat()       		
      		   );}
}
