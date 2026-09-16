public class MembresiaPremium extends Membresia{
    private int pasesInvitado;

    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado) {
        super(idMiembro, nombreUsuario);
        setPasesInvitado(pasesInvitado);
    }

    public boolean verificarAcceso() {
        System.out.println("Acceso Premium verificado");
        return true;
    }

    public boolean ingresarConInvitado() {
        if (pasesInvitado > 0) {
            pasesInvitado--;
            System.out.println("El usuario "+ getNombreUsuario() + " puede pasar con su invitado\n");
            return true;
        } else {
            System.out.println("El invitado no puede pasar\n");
            return false;
        }
    }

    public int getPasesInvitado() {
        return pasesInvitado;
    }

    public void setPasesInvitado(int pasesInvitado) {
        if (pasesInvitado < 0) {
            this.pasesInvitado = 0;
        } else  {
            this.pasesInvitado = pasesInvitado;
        }
    }




}
