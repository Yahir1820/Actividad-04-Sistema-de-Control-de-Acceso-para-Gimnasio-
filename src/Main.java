import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Membresia> membresias = new ArrayList<Membresia>();
        membresias.add(new MembresiaPremium("001", "Raora", 10));
        membresias.add(new MembresiaPremium("002", "Elizabeth", 0 ));
        membresias.add(new MembresiaBasica("003", "Cece", 4 ));
        membresias.add(new MembresiaBasica("004", "Gigi", 0));

        for (Membresia m : membresias) {
            m.mostrarDatos();
            m.verificarAcceso();
            if (m instanceof MembresiaPremium) {
                MembresiaPremium premium = (MembresiaPremium) m;
                premium.ingresarConInvitado();
            }
        }

    }
}