/* Creamos un Constructor privado de la clase Revision*/
public class Revision {
    private int id;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    /* Creamos un Constructor vacio de la clase Revision*/
    public Revision() {

    }

    /* Creamos un Constructor publico de la clase Revision*/
    public Revision(int id, int rut, String dia, String hora, String lugar, String comentarios) {
        this.id = id;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;

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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
