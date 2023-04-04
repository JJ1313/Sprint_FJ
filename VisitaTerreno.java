/* Creamos un Constructor privado de Visitaterreno*/
public class VisitaTerreno {
    private int id;
    private int run;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    /* Creamos un Constructor vacio de VisitaTerreno*/
    public VisitaTerreno() {

    }

    /* Creamos un Constructor publico de VisitaTerreno*/
    public VisitaTerreno(int id, int run, String dia, String hora, String lugar, String comentarios) {
        this.id = id;
        this.run = run;
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

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
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

    public void agregarRevision(Revision revision) {
    }
}

