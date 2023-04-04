import java.text.ParseException;

/* Creamos un constructor privado de la clase Cliente con padre Usuario */
public class Cliente  extends Usuario{
    private int run;
    private String nombre;
    private String apellido;
    private String telefono;
    private int AFP;
    private int sistemadesalud;
    private String direccion;
    private String comuna;
    private int edad;

    /* Creamos un Constructor vacio de la Clase Cliente*/
    public Cliente() {

    }
    /* Creamos un Constructor publico de Cliente*/
    public Cliente(int run, String nombre, String apellido, String fechanacimiento, String telefono, int AFP, int sistemadesalud,String direccion, String comuna, int edad) throws ParseException {
    super(nombre, fechanacimiento, run);

        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.AFP = AFP;
        this.sistemadesalud = sistemadesalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;

    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getAFP() {
        return AFP;
    }

    public void setAFP(int AFP) {
        this.AFP = AFP;
    }

    public int getSistemadesalud() {
        return sistemadesalud;
    }

    public void setSistemadesalud(int sistemadesalud) {
        this.sistemadesalud = sistemadesalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void agregarCapacitacion(Capacitacion capacitacion) {
    }

    public void registrarAccidente(Accidente accidente) {
    }

    public void registrarVisitaTerreno(VisitaTerreno visitaTerreno) {
    }
}
