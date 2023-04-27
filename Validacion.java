import java.text.SimpleDateFormat;
import java.util.Date;

public class Validacion{
    // ------ Validaciones Generales ------
    public static boolean validarRut(int rut){
        if(rut < 0  || rut > 99999999){return false;}
        return true;
    }
    public static boolean validarFecha(String fecha){
        try{
            Date fechaDate = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
    public static boolean validarHora(String hora){
        SimpleDateFormat horaFormat = new SimpleDateFormat("HH:mm");
        try {
            Date horaAux = horaFormat.parse(hora);
            return true;
        } catch (Exception e) {
            System.out.println("La hora capacitacion debe tener el formato HH:mm");
            return false;
        }
    }
    public static boolean validarId(int id){
        if(id == 0){return false;}
        return true;
    }
    public static boolean validarLugar(String lugar){
        if(lugar.length()<10 || lugar.length()>50){return false;}
        return true;
    }
    // ------ Validaciones Usuario ------
    public static boolean validarNombreUsuario(String nombre){
        if(nombre.length() < 10 || nombre.length() > 50){
            System.out.println("El nombre debe tener entre 10 y 50 caracteres");
            return false;
        }
        return true;
    }

    // ------ Validaciones Cliente ------
    public static boolean validarNombreCliente(String nombre){
        if(nombre.length() < 5 || nombre.length() >30){return false;}
        return true;
    }
    public static boolean validarApellidoCliente(String apellido){
        if(apellido.length() < 5 || apellido.length() >30){
            System.out.println("El apellido debe tener entre 5 y 30 caracteres");
            return false;
        }
        return true;
    }
    public static boolean validarTelefonoCliente(int telefono){
        if(telefono == 0){return false;}
        return true;
    }
    public static boolean validarAfpCliente(String afp){
        if(afp.length() < 4 || afp.length() >30){return false;}
        return true;
    }
    public static boolean validarSistemaSalud(byte sistema){
        if(sistema != 1 && sistema != 2){return false;}
        return true;
    }
    public static boolean validarDireccionCliente(String dir){
        if(dir.length() > 70){return false;}
        return true;
    }
    public static boolean validarComunaCliente(String comuna){
        if(comuna.length() > 50){return false;}
        return true;
    }
    public static boolean validarEdadCliente(int edad){
        if(edad < 0 || edad >= 150){return false;}
        return true;
    }

    // ------ Validaciones Profesional ------
    public static boolean validarTituloProfesional(String titulo){
        if(titulo.length() < 10 || titulo.length() > 50){return false;}
        return true;
    }

    // ------ Validaciones Administrativo ------
    public static boolean validarAreaAdministrativo(String area){
        if(area.length() < 5 || area.length() > 20){return false;}
        return true;
    }
    public static boolean validarExperienciaAdministrativo(String txt){
        if(txt.length() > 100){return false;}
        return true;
    }

    // ------ Validaciones Capacitacion ------
    public static boolean validarDia(String dia){
        String[] diasSemana = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        for(String d : diasSemana){
            if(d.equals(dia.toUpperCase())){return true;}
        }
        return false;
    }

    public static boolean validarDuracion(int duracion){
        if(duracion > 70){return false;}
        return true;
    }
    public static boolean validarCantAsistentes(int cantidad){
        if(cantidad >1000){return false;}
        return true;
    }

    // ------ Validaciones Accidentes ------
    public static boolean validarOrigenAccidente(String origen){
        if(origen.length() > 100){return false;}
        return true;
    }
    public static boolean validarConsecuenciasAccidente(String consecuencia){
        if(consecuencia.length() > 100){return false;}
        return true;
    }

    // ------ Validaciones Visita a Terreno ------
    public static boolean validarComentarioAccidente(String comentario){
        if(comentario.length() > 100){return false;}
        return true;
    }

    // ------ Validaciones Revision ------
    public static boolean validarNombreRevision(String nombre){
        if(nombre.length() > 50 || nombre.length() < 10){return false;}
        return true;
    }
    public static boolean validarDetalleRevision(String detalle){
        if(detalle.length() >100){return false;}
        return  true;
    }
    public static boolean validarEstadoRevision(int estado){
        if(estado != 1 || estado != 2 || estado != 3){return false;}
        return true;
    }
}
