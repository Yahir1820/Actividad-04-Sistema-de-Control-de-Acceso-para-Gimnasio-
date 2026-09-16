public abstract class Membresia {
    protected String idMiembro;
    protected String nombreUsuario;

    public Membresia () {
        this.idMiembro = "";
        this.nombreUsuario = "";
    }

    public Membresia(String idMiembro, String nombreUsuario) {
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    public abstract boolean verificarAcceso();

    public void mostrarDatos() {
        System.out.printf("ID: %s Nombre: %s\n", idMiembro, nombreUsuario);
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
