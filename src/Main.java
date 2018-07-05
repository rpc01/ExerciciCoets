//FASE 2:
//
//Volem millorar el software perquè el propulsor tingui una potència màxima.
//
//Modifiquem en el main anterior: 
//
//Creem dos coets amb els codis “32WESSDS” I “LDSFJA32”. 
//El primer coet tindrà tres propulsors (potència: 10,30,80) 
// i el segon sis propulsors (potència: 30,40,50,50,30,10). 
//
//Mostrar a pantalla el codi dels coets, el número de propulsors que té 
//i la potència màxima de cada propulsor. 
//
//		Output:
//32WESSDS: 10,30,80
//LDSFJA32: 30,40,50,50,30,10

public class Main {
        public static void main(String[] args) {
       Coet coet1 = new Coet("32WESSDS");
       coet1.addPropulsor(10);
       coet1.addPropulsor(30);
       coet1.addPropulsor(80);

       Coet coet2 = new Coet("LDSFJA32");
       coet2.addPropulsor(30);
       coet2.addPropulsor(40);
       coet2.addPropulsor(50);
       coet2.addPropulsor(50);
       coet2.addPropulsor(30);
       coet2.addPropulsor(10);
       
       

       System.out.println("Coet1: "+coet1.getCodi()+", "+coet1.getPropulsors());
       System.out.println("Coet2: "+coet2.getCodi()+", "+coet2.getPropulsors());
        }

}
