
import java.util.*;

public class Coet{
    private String codi;
    List<Propulsor> propulsors=new ArrayList<>();

    public Coet(String codi){
        this.codi=codi;
                }

    public String getCodi() {
        return codi;
    }

    public void addPropulsor(int potencia) {
        Propulsor propulsor=new Propulsor(potencia);
        propulsors.add(propulsor);
    }

    public String getPropulsors() {
    	String res="";
    	for(Propulsor p : propulsors) {
    		res+=p + " ";
    	}
    	return res;
    }
}
