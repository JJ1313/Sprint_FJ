/* Creamos un Constructor privado de la clase Administrativo con padre en Usuario*/
public class Administrativo extends Usuario{
    private String area;
    private String experienciaprevia;

    /* Creamos un Constructor vacio Administrativo*/
    public Administrativo() {

    }

    /* Creamos un Constructor publico de Administrativo*/
    public Administrativo(String area, String experienciaprevia) {
        this.area = area;
        this.experienciaprevia = experienciaprevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaprevia() {
        return experienciaprevia;
    }

    public void setExperienciaprevia(String experienciaprevia) {
        this.experienciaprevia = experienciaprevia;
    }
}
