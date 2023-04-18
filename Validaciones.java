import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


//Validacion clase Usuario//
public class Validaciones {


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

    public static boolean validaUsuarioRut(int run) {
        boolean valido = false;
        if (run < 0 || run > 99999999) {
            valido = false;
            System.out.println("El RUN debe ser un número entre 0 y 99.999.999");
        } else {
            valido = true;
        }
        return valido;
    }

    //Validacion clase Cliente//
//rut
    public static boolean validaClienteRut(int rut) {
        boolean valido = false;
        if (rut < 0 || rut > 99999999) {
            valido = false;
            System.out.println("El RUT debe ser un número entre 0 y 99.999.999");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaClienteNombres(String nombres) {
        boolean valido = false;
        if (nombres == null || nombres.length() < 5 || nombres.length() > 30) {
            valido = false;
            System.out.println("El nombre debe tener entre 5 y 30 caracteres");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaClienteApellidos(String apellidos) {
        boolean valido = false;
        if (apellidos == null || apellidos.length() < 5 || apellidos.length() > 30) {
            valido = false;
            System.out.println("El apellido debe tener entre 5 y 30 caracteres");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaClienteTeléfono(String telefono) {
        boolean valido = false;
        if (telefono == null) {
            valido = false;
            System.out.println("El telefono es obligatorio");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaClienteAFP(String afp) {
        boolean valido = false;
        if (afp.length() < 4 || afp.length() > 30) {
            valido = false;
            System.out.println("La AFP debe tener entre 4 y 30 caracteres");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaClienteSistemaSalud(int sistemaSalud) {
        boolean valido = false;
        if (sistemaSalud == 1 || sistemaSalud == 2) {
            valido = false;
            System.out.println("Ingrese 1 para Fonasa o 2 para Isapre");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaClienteDirección(String direccion) {
        boolean valido = false;
        if (direccion.length() <= 70) {
            valido = false;
            System.out.println("Ingrese Direccion");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaClienteComuna(String comuna) {
        boolean valido = false;
        if (comuna.length() <= 50) {
            valido = false;
            System.out.println("Ingrese Comuna");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaClienteEdad(int edad) {
        boolean valido = false;
        if (edad >= 0 || edad < 150) {

        } else {
            valido = true;
        }

        return valido;
    }

    //Validacion clase profesional

    public static boolean validaProfesionalTitulo(String titulo) {
        boolean valido = false;
        if (titulo == null || titulo.length() < 10 || titulo.length() > 50) {
            valido = false;
            System.out.println("Titulo debe tener entre 10 y 50 caracteres");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaProFechaIn(String validaProfesionalFechaIngreso) {
        boolean valido = false;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;

        try {

            fecha = dateFormat.parse(validaProfesionalFechaIngreso);
            valido = true;

        } catch (Exception e) {
            valido = false;
            System.out.println("La fecha debe tener el formato dd/MM/yyyy");
        }
        return valido;
    }
//Validacion clase Administrativo

    public static boolean validaProfesionalArea(String Area) {
        boolean valido = false;
        if (Area == null || Area.length() < 5 || Area.length() > 20) {
            valido = false;
            System.out.println("Tipo de Area debe tener entre 5 y 20 caracteres");
        } else {
            valido = true;
        }

        return valido;

    }
    public static boolean validaProfesionalExperienciaPrevia(String Experiencia) {
        boolean valido = false;
        if ( Experiencia.length() > 100 ) {
            valido = false;
            System.out.println("Complete experiencia con un maximo de 100 caracteres");
        } else {
            valido = true;
        }

        return valido;

    }
 /*
	Capacitación
	- Identificador: obligatorio, número interno de la capacitación manejado Por la empresa
	- RUT cliente: obligatorio
	- Día: texto, día de la semana. Debe ser un valor permitido entre “lunes” y
	“Domingo” (en ese formato)
	- Hora: debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	- Lugar: obligatorio, mínimo 10 caracteres, máximo 50
	- Duración: máximo 70 caracteres
	- Cantidad de asistentes: obligatorio, número entero menor que 1000

    */

    public static boolean validaCapacitacionIdentificador(String identificador) {
        boolean valido = false;
        if (identificador == null) {
            valido = false;
            System.out.println("El identificador es obligatorio");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaCapacitacionRut(String rut) {
        boolean valido = false;
        if (rut == null) {
            valido = false;
            System.out.println("El Rut Capacitacion es obligatorio");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaCapacitacionDia(String dia) {
        boolean valido = false;
        List<String> diasSemana = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

        if (dia == null) {
            valido = false;
            System.out.println("El Dia Capacitacion es obligatorio");
            return valido;
        }

        if (!diasSemana.contains(dia)) {
            valido = false;
            System.out.println("El dato Dia Capacitacion debe corresponder a: \"Lunes\" \"Martes\" \"Miercoles\" \"Jueves\" \"Viernes\" \"Sabado\" \"Domingo\"");
        } else {
            valido = true;
        }
        return valido;
    }

    public static boolean validaCapacitacionHora(String hora) {
        boolean valido = false;
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        try {
            Date horaAux = horaFormat.parse(hora);
            valido = true;

        } catch (Exception e) {
            valido = false;
            System.out.println("La hora capacitacion debe tener el formato HH:mm");
        }
        return valido;
    }


    public static boolean validaCapacitacionLugar(String lugar) {
        boolean valido = false;

        if (lugar==null) {
            lugar = "";
        }

        if (lugar.length() < 10 || lugar.length() > 50) {
            valido = false;
            System.out.println("El lugar de la capacitacion debe tener entre 10 y 50 caracteres");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaCapacitacionDuracion(String duracion) {
        boolean valido = false;

        if (duracion==null) {
            duracion = "";
        }

        if (duracion.length() > 70) {
            valido = false;
            System.out.println("La duracion de la capacitacion debe tener un maximo de 70 caracteres");
        } else {
            valido = true;
        }

        return valido;
    }

    public static boolean validaCapacitacionCantidadAsistentes(String cantidad) {
        boolean valido = false;

        if (cantidad == null) {
            valido = false;
            System.out.println("La cantidad de asistentes de la Capacitacion es obligatorio");
            return valido;
        }

        int cantidadNumero = Integer.parseInt(cantidad);
        if (cantidadNumero > 1000) {
            valido = false;
            System.out.println("La cantidad de asistentes de la Capacitacion debe tener un maximo de 1000 personas.");
        } else {
            valido = true;
        }
        return valido;
    }


}
