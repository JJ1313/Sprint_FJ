/* Creamos un Constructor privado de la clase Accidente*/
public class Accidente {
    private int id;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    /* Creamos un Constructor vacio de la clase Accidente*/
    public Accidente(){

    }

    /* Creamos un Constructor publico de la clase Accidente*/
    public Accidente(int id, int rut, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.id = id;
        this.rut= rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}
