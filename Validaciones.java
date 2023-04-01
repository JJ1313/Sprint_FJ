import java.text.SimpleDateFormat;
import java.util.Date;

public class Validaciones{
    public boolean validaUsuario(String nombre, String fechaNac, int run) {
        boolean valido = false;

        if (nombre == null || nombre.length() < 10 || nombre.length() > 50) {
            throw new IllegalArgumentException("El nombre debe tener entre 10 y 50 caracteres");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = dateFormat.parse(fechaNac);
        } catch (Exception e) {
            throw new IllegalArgumentException("La fecha debe tener el formato dd/MM/yyyy");
        }

        if (run < 0 || run > 99999999) {
            throw new IllegalArgumentException("El RUN debe ser un número entre 0 y 99.999.999");
        }

        return valido;
    }

    public static boolean validaUsuarioNombre(String nombre) {
        boolean valido = false;
        if (nombre == null || nombre.length() < 10 || nombre.length() > 50) {
            valido = false;
            System.out.println("El nombre debe tener entre 10 y 50 caracteres");
        } else {
            valido = true;
        }
        return valido;
    }
    public static boolean validaUsuarioFechaNac(String fechaNac) {
        boolean valido = false;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {
            fecha = dateFormat.parse(fechaNac);
            valido = true;

        } catch (Exception e) {
            valido = false;
            System.out.println("La fecha debe tener el formato dd/MM/yyyy");
        }
        return valido;
    }

    public static boolean validaUsuarioRun(int run) {
        boolean valido = false;


        return valido;
    }



}
