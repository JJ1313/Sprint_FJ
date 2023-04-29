import java.text.SimpleDateFormat;
import java.util.Date;

public class Validacion{
    // ------ Validaciones Generales ------
    public static boolean validarRut(String rut){
        try{
            int rutInt = Integer.parseInt(rut);
            if(rutInt < 0  || rutInt > 99999999){
                System.out.println("Valores entre 0 y 99999999");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
    }
    public static boolean validarFecha(String fecha){
        try{
            Date fechaDate = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
        }
        catch (Exception e){
            System.out.println("La fecha debe tener el formato dd/MM/yyyy");
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
    public static boolean validarId(String id){
        try{
            int idInt = Integer.parseInt(id);
            if(idInt == 0 ){
                System.out.println("Dato Obligatorio");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
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
    public static boolean validarTelefonoCliente(String telefono){
        try{
            int telefonoInt = Integer.parseInt(telefono);
            if(telefonoInt == 0 ){
                System.out.println("Dato Obligatorio");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
    }
    public static boolean validarAfpCliente(String afp){
        if(afp.length() < 4 || afp.length() >30){return false;}
        return true;
    }
    public static boolean validarSistemaSalud(String sistema){
        try{
            int sistemaInt = Byte.parseByte(sistema);
            if(sistemaInt != 1 && sistemaInt != 2){
                System.out.println("Solo 1 o 2");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
    }
    public static boolean validarDireccionCliente(String dir){
        if(dir.length() > 70){return false;}
        return true;
    }
    public static boolean validarComunaCliente(String comuna){
        if(comuna.length() > 50){return false;}
        return true;
    }
    public static boolean validarEdadCliente(String edad){
        try{
            int edadInt = Integer.parseInt(edad);
            if(edadInt < 0  || edadInt > 150){
                System.out.println("Valores entre 0 y 150");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
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

    public static boolean validarDuracion(String duracion){
        try{
            int duracionInt = Integer.parseInt(duracion);
            if(duracionInt > 70){
                System.out.println("Valores menor a 70");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
    }
    public static boolean validarCantAsistentes(String cantidad){
        try{
            int cantidadInt = Integer.parseInt(cantidad);
            if(cantidadInt > 1000){
                System.out.println("Valores menor a 1000");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
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
    public static boolean validarEstadoRevision(String estado){
        try{
            int estadoInt = Integer.parseInt(estado);
            if(estadoInt != 1 || estadoInt != 2 || estadoInt != 3){
                System.out.println("Valores 1, 2 o 3");
                return false;
            }
            return true;
        }
        catch(Exception e){
            System.out.println("Solo numeros");
            return false;
        }
    }
}
