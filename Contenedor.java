import java.util.ArrayList;

public class Contenedor {
    ArrayList<Usuario> listaAsesoria;
    ArrayList<Capacitacion> listaCapacitacion;

    public Contenedor() {
        this.listaAsesoria = new ArrayList<Usuario>();

        this.listaCapacitacion = new ArrayList<Capacitacion>();
    }

    public void almacenarCliente(Cliente _cliente) {
        listaAsesoria.add(_cliente);
    }

    public void almacenarProfesional(Profesional _profesional) {
        listaAsesoria.add(_profesional);
    }
    public void almacenarCapacitacion(Capacitacion _capacitacion) {
        listaCapacitacion.add(_capacitacion);

    }
    public void eliminarUsuario(int rut) {
        for (int i = 0; i < listaAsesoria.size(); i++) {
            if (rut == listaAsesoria.get(i).getRun()) {
                listaAsesoria.remove(i);
                return;
            }
        }
    }

}
