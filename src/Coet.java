
import java.util.*;

public class Coet{
    private String codi;
    
	List<Propulsor> propulsors=new ArrayList<>();

    public Coet(String codi)throws Exception{
    	if(codi == null) throw new Exception("Codi coet no pot ser null"); 
        this.codi=codi;
                }

    public String getCodi() {
        return codi;
    }
           
    public void accelerar(int num) {
    	int acceleracio = 10;
    	int canvi = acceleracio*num;
    	for(Propulsor p : propulsors) {
    		p.canvipotencia(canvi);
    		
    	}   	
    }
        
    public void frenar(int num) {
    	int acceleracio = -10;
    	int canvi = acceleracio*num;
    	for(Propulsor p : propulsors) {
    		p.canvipotencia(canvi);
    		
    	}   	
    }
    
    public int getVelocitat() {
    	int velocitat=0;
    	for (Propulsor p : propulsors) {
    		velocitat +=p.getPotencia();
 		    	}   	
    	return velocitat;
    }
    
    public int getNumpropulsors() {
        return propulsors.size();
    }

    public void addPropulsor(int potencia) throws Exception  {
        
		Propulsor propulsor=new Propulsor(potencia);
		propulsors.add(propulsor);		
    }

    public String getPropulsors() {
    	String res="";
    	for(Propulsor p : propulsors) {
    		res+=p.getPotenciamax() + " ";
    	}
    	return res;
    }
}
