import java.util.ArrayList;
import java.util.List;

public class Propulsor {
        private int potencia;
        private int potenciamax;
        public Propulsor(int potenciamax) throws Exception {
        	if (potenciamax<=0) throw new Exception("Potencia not valid");
                this.potenciamax=potenciamax;
        }

        public int getPotencia() {
			return potencia;
		}
        
        public int getPotenciamax() {
			return potenciamax;
		}

		public void canvipotencia(int canvi) {
        	potencia+=canvi;
        	if (potencia >potenciamax) {potencia=potenciamax;}
        	else if (potencia <0) {potencia=0;}		
        			}
        	
}
