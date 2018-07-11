
public class Propulsor {
        private int potencia;
        private int potenciaMax;
        public Propulsor(int potenciaMax) throws Exception {
        	if (potenciaMax<=0) throw new Exception("Potencia not valid");
                this.potenciaMax=potenciaMax;
        }

        public int getPotencia() {
			return potencia;		}
        
        public int getPotenciamax() {
			return potenciaMax;
		}

		public void canvipotencia(int canvi) {
        	potencia+=canvi;
        	if (potencia >potenciaMax) {potencia=potenciaMax;}
        	else if (potencia <0) {potencia=0;}		
        }
        	
}
