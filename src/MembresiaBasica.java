public class MembresiaBasica extends Membresia {
    private int visitasRestantes;

    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasRestantes) {
        super(idMiembro, nombreUsuario);
        setVisitasRestantes(visitasRestantes);
    }

    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            this.visitasRestantes--;
            System.out.printf("Visitas restantes: %d\n\n", getVisitasRestantes());
            return true;
        } else {
            System.out.println("No quedan visitas disponibles");
            return false;
        }
    }

    public int getVisitasRestantes() {
        return visitasRestantes;
    }

    public void setVisitasRestantes(int visitasRestantes) {
        if (visitasRestantes < 0) {
            this.visitasRestantes = 0;
        } else  {
            this.visitasRestantes = visitasRestantes;
        }
    }


}
