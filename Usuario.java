import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* Creamos un constructor privado de la clase Usuario */
public class Usuario implements Asesoria {
        private int run;
        private String nombre;
        private Date fechanacimiento;
        private String[] listaFecha;
/* Creamos un Constructor vacio de la Clase Usuario*/
        public Usuario(){
        }
/* Creamos un Constructor publico*/
        public Usuario(String nombre, String fechanacimiento, int run) throws ParseException {
                this.nombre= nombre;

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                this.fechanacimiento= formato.parse(fechanacimiento);
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

        public Date getFechanacimiento() {
                return fechanacimiento;
        }

        public void setFechanacimiento(String fechanacimiento) throws ParseException {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                this.fechanacimiento= formato.parse(fechanacimiento);
        }

        public void analizarUsuario() {
                System.out.println(this.nombre +" "+ this.run);
        }
        public long mostrarEdad() {
                Date fechaActual = new Date();
                return (long) (TimeUnit.MILLISECONDS.toDays(fechaActual.getTime() - this.fechanacimiento.getTime())/365.2425);
        }


}


