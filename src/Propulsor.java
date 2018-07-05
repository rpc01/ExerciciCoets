import java.util.ArrayList;
import java.util.List;

public class Propulsor {
        private int potencia;
        public Propulsor(int potencia) {
                this.potencia=potencia;
        }

        @Override
        public String toString() {
                return "" + potencia;
        }
}
