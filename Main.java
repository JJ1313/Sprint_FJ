import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Profesional profesional1 = new Profesional("Many", "12/04/63", 754234302, "Jefe", "14/04/2014");
//        Profesional profesional2 = new Profesional("Chica", "14/09/2021", 222222, "Awelita", "15/09/2022");
//
//        Administrativo administrativo1 = new Administrativo("Luna", "02/01/70", 754122, "Matematica", "si");
//        Administrativo administrativo2 = new Administrativo("lizzy", "01/01/1991",4444, "Todas", "En todo");

//        Cliente cliente1 = new Cliente("10/12/98", 11111, "Alma", "Cenba Rato", "+12313", "af1", (byte) 1, "casa", "Antofapasta", (byte) 25);

        Contenedor contenedor = new Contenedor();

        Scanner in = new Scanner(System.in);
        String opcion;
        while(true){
            System.out.println("1 : Almacenar Cliente");
            System.out.println("2 : Almacenar Profesional");
            System.out.println("3 : Almacenar Administrativo");
            System.out.println("4 : Almacenar Capacitacion");
            System.out.println("5 : Eliminar Usuario");
            System.out.println("6 : Mostrar Usuarios");
            System.out.println("7 : Mostrar Usuarios de un tipo");
            System.out.println("8 : Mostrar capacitaciones");
            System.out.println("0 : Finalizar programa");
            System.out.println("Ingrese opcion: ");
            opcion = in.nextLine();
            // --- Salir Programa ---
            if(opcion.equals("0")){
                System.out.println("Finalizando programa...");
                break;
            }

            // --- Almacenar Cliente ---
            else if(opcion.equals("1")){
                Cliente cliente = new Cliente();
                String input;
                do{ // --- NOMBRE
                    System.out.println("Ingresa nombre: ");
                    input = in.nextLine();
                } while (!Validacion.validarNombreUsuario(input));
                cliente.setNombre(input);

                do{ // --- APELLIDO
                    System.out.println("Ingrese apellido: ");
                    input = in.nextLine();
                }while(!Validacion.validarApellidoCliente(input));
                cliente.setApellidos(input);

                do{ // --- FECHA NACIMIENTO
                    System.out.println("Ingrese fecha nacimiento: ");
                    input = in.nextLine();
                }while(!Validacion.validarFecha(input));
                cliente.setFechaNacimiento(input);

                do{ // --- RUT
                    System.out.println("Ingrese rut: ");
                    input = in.nextLine();
                }while(!Validacion.validarRut(Integer.parseInt(input)));
                cliente.setRut(Integer.parseInt(input));
                cliente.setRun(Integer.parseInt(input));

                do{ // --- TELEFONO
                    System.out.println("Ingrese telefono: ");
                    input = in.nextLine();
                }while(!Validacion.validarTelefonoCliente(Integer.parseInt(input)));
                cliente.setTelefono(input);

                do{ // --- AFP
                    System.out.println("Ingrese afp: ");
                    input = in.nextLine();
                }while(!Validacion.validarAfpCliente(input));
                cliente.setAfp(input);

                do{ // --- SISTEMA SALUD
                    System.out.println("Ingrese sistema salud: ");
                    input = in.nextLine();
                }while(!Validacion.validarSistemaSalud(Byte.parseByte(input)));
                cliente.setSistemaSalud(Byte.parseByte(input));

                do{ // --- DIRECCION
                    System.out.println("Ingrese direccion: ");
                    input = in.nextLine();
                }while(!Validacion.validarDireccionCliente(input));
                cliente.setDireccion(input);

                do{ // --- COMUNA
                    System.out.println("Ingrese comuna: ");
                    input = in.nextLine();
                }while(!Validacion.validarComunaCliente(input));
                cliente.setComuna(input);

                do{ // --- EDAD
                    System.out.println("Ingrese edad: ");
                    input = in.nextLine();
                } while(!Validacion.validarEdadCliente(Byte.parseByte(input)));
                cliente.setEdad(Byte.parseByte(input));

                contenedor.almacenarCliente(cliente);
            }
            // --- Almacenar Profesional ---
            else if(opcion.equals("2")){
                Profesional profesional = new Profesional();
                String input;
                do{ // --- NOMBRE
                    System.out.println("Ingresa nombre: ");
                    input = in.nextLine();
                } while (!Validacion.validarNombreUsuario(input));
                profesional.setNombre(input);

                do{ // --- FECHA NACIMIENTO
                    System.out.println("Ingrese fecha nacimiento: ");
                    input = in.nextLine();
                }while(!Validacion.validarFecha(input));
                profesional.setFechaNacimiento(input);

                do{ // --- RUT
                    System.out.println("Ingrese rut: ");
                    input = in.nextLine();
                }while(!Validacion.validarRut(Integer.parseInt(input)));
                profesional.setRun(Integer.parseInt(input));

                do{ // --- TITULO
                    System.out.println("Ingrese titulo: ");
                    input = in.nextLine();
                }while(!Validacion.validarTituloProfesional(input));
                profesional.setTitulo(input);

                do{ // --- FECHA INGRESO
                    System.out.println("Ingrese fecha ingreso: ");
                    input = in.nextLine();
                }while(!Validacion.validarFecha(input));
                profesional.setFechaIngreso(input);

                contenedor.almacenarProfesional(profesional);
            }
            // --- Almacenar Administrativo ---
            else if(opcion.equals("3")){
                Administrativo administrativo = new Administrativo();
                String input;
                do{ // --- NOMBRE
                    System.out.println("Ingresa nombre: ");
                    input = in.nextLine();
                } while (!Validacion.validarNombreUsuario(input));
                administrativo.setNombre(input);

                do{ // --- FECHA NACIMIENTO
                    System.out.println("Ingrese fecha nacimiento: ");
                    input = in.nextLine();
                }while(!Validacion.validarFecha(input));
                administrativo.setFechaNacimiento(input);

                do{ // --- RUT
                    System.out.println("Ingrese rut: ");
                    input = in.nextLine();
                }while(!Validacion.validarRut(Integer.parseInt(input)));
                administrativo.setRun(Integer.parseInt(input));

                do{ // --- AREA
                    System.out.println("Ingrese area: ");
                    input = in.nextLine();
                }while(!Validacion.validarAreaAdministrativo(input));
                administrativo.setArea(input);

                do{ // --- EXPERIENCIA PREVIA
                    System.out.println("Ingrese experiencia previa: ");
                    input = in.nextLine();
                }while(!Validacion.validarExperienciaAdministrativo(input));
                administrativo.setExperienciaPrevia(input);

                contenedor.almacenarAdministrativo(administrativo);

            }
            // --- Almacenar Capacitacion ---
            else if(opcion.equals("4")){
                Capacitacion capacitacion = new Capacitacion();
                String input;
                do{ // --- ID
                    System.out.println("Ingrese id: ");
                    input = in.nextLine();
                }while(!Validacion.validarId(Integer.parseInt(input)));
                capacitacion.setId(Integer.parseInt(input));

                do{ // --- RUT CLIENTE
                    System.out.println("Ingrese rut cliente: ");
                    input = in.nextLine();
                }while(!Validacion.validarRut(Integer.parseInt(input)));
                capacitacion.setRutCliente(Integer.parseInt(input));

                do{ // --- DIA
                    System.out.println("Ingrese dia: ");
                    input = in.nextLine();
                }while(!Validacion.validarDia(input));
                capacitacion.setDia(input);

                do{ // --- HORA
                    System.out.println("Ingrese hora: ");
                    input = in.nextLine();
                }while(!Validacion.validarHora(input));
                capacitacion.setHora(input);

                do{ // --- LUGAR
                    System.out.println("Ingrese lugar: ");
                    input = in.nextLine();
                }while(!Validacion.validarLugar(input));
                capacitacion.setLugar(input);

                do{ // --- DURACION
                    System.out.println("Ingrese duracion: ");
                    input = in.nextLine();
                }while(!Validacion.validarDuracion(Integer.parseInt(input)));
                capacitacion.setDuracion(Integer.parseInt(input));

                do{ // --- CANTIDAD ASISTENTE
                    System.out.println("Ingrese cantidad asistente: ");
                    input = in.nextLine();
                }while(!Validacion.validarCantAsistentes(Integer.parseInt(input)));
                capacitacion.setCantAsistentes(Integer.parseInt(input));

                contenedor.almacenarCapacitacion(capacitacion);
            }

            // --- Eliminar Usuario ---
            else if(opcion.equals("5")){
                System.out.println("Ingrese rut usuario a eliminar: ");
                int rutEliminar = Integer.parseInt(in.nextLine());
                contenedor.eliminarUsuario(rutEliminar);
            }

            // --- Listar Usuario ---
            else if(opcion.equals("6")){
                contenedor.listarUsuarios();
            }

            // --- Listar Usuario x tipo ---
            else if(opcion.equals("7")){
                System.out.println("Ingresa tipo usuario a buscar (Cliente/Administrativo/Profesional)");
                String tipoUsuario = in.nextLine();
                contenedor.listarUsuarios(tipoUsuario);
            }

            // --- Listar Capacitaciones ---
            else if(opcion.equals("8")){
                contenedor.listarCapacitaciones();
            }

            // --- Opcion no valida ---
            else{
                System.out.println("Opcion ingresada no valida");
            }
        }

    }
}