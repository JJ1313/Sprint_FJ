/* Creamos un Constructor privado de Capacitacion*/
public class Capacitacion {
    private int id;
    private int rut;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadasistentes;

    /* Creamos un Constructor vacio de Capacitacion*/
    public Capacitacion(int i, String s, String lunes, String s1, String salaDeReuniones, String introducciónALaSeguridadLaboral) {

    }
    /* Creamos un Constructor publico de Capacitacion*/
    public Capacitacion(int id, int rut, String dia, String hora, String lugar, String duracion, int cantidadasistentes) {
        this.id = id;
        this.rut= rut;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadasistentes = cantidadasistentes;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadasistentes() {
        return cantidadasistentes;
    }

    public void setCantidadasistentes(int cantidadasistentes) {
        this.cantidadasistentes = cantidadasistentes;
    }
}
