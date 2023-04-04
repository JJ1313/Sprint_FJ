import java.text.ParseException;

/* Creamos un Constructor privado de la clase Profesional con padre en Usuario*/
public class Profesional extends Usuario{
    private String titulo;
    private String fecha;

    /* Creamos un Constructor vacio de la clase Profesional*/
    public Profesional() {

    }

    /* Creamos un Constructor publico de la clase Profesional*/
    public Profesional(String titulo, String fecha, String nombre, String fechanacimiento,int rut) throws ParseException {
        super(nombre, fechanacimiento, rut);
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
