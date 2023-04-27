import java.util.ArrayList;

public class Contenedor {
    private ArrayList<Usuario> asesorias = new ArrayList<Usuario>();
    private ArrayList<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();

    Contenedor(){}

    // ------ METHODS ------
    public void almacenarCliente(Cliente c){
        asesorias.add(c);
    }
    public void almacenarProfesional(Profesional p){
        asesorias.add(p);
    }
    public void almacenarAdministrativo(Administrativo a){
        asesorias.add(a);
    }
    public void almacenarCapacitacion(Capacitacion c){
        capacitaciones.add(c);
    }
    public void eliminarUsuario(int run){
        for(int i = 0; i < asesorias.size(); i++){
            if(asesorias.get(i).getRun() == run){
                asesorias.remove(i);
                return;
            }
        }
    }
    public void listarUsuarios(){
        for(Usuario u: asesorias){
            u.analizarUsuario();
        }
    }
    public void listarUsuarios(String tipo){
        for(Usuario usuario : asesorias){
            if(tipo.toUpperCase().equals("CLIENTE") && usuario instanceof Cliente){
                ((Cliente) usuario).analizarUsuario();
            }
            else if(tipo.toUpperCase().equals("ADMINISTRATIVO") && usuario instanceof Administrativo){
                ((Administrativo) usuario).analizarUsuario();
            }
            else if(tipo.toUpperCase().equals("PROFESIONAL") && usuario instanceof Profesional){
                ((Profesional) usuario).analizarUsuario();
            }
        }
    }
    public void listarCapacitaciones(){
        for(Capacitacion c: capacitaciones){
            System.out.println(c.mostrarDetalle());
            System.out.println("Cliente asociado:");
            for(Usuario u: asesorias){
                if(u instanceof Cliente && ((Cliente) u).getRut() == c.getRutCliente()){
                    ((Cliente) u).analizarUsuario();
                }
            }
        }
    }
}
