import java.text.ParseException;
import java.util.Scanner;

public class main {
    public static void Main(String[] args) throws ParseException {
        // Crear un cliente
        Cliente cliente = new Cliente(12345678, "Juan","Perez","12/02/1988","Modelo",1, 2, "calle larga", "Santiago", 34);
        /*
        System.out.println(cliente.getNombre());
        System.out.println(cliente);
        System.out.println(cliente.getApellido());
        System.out.println(cliente.getRun());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getAFP());
        System.out.println(cliente.getSistemadesalud());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getComuna());
*/

        // Agregar una capacitación al cliente
        Capacitacion capacitacion = new Capacitacion(1, "123456789", "lunes", "09:00", "Sala de reuniones", "Introducción a la seguridad laboral");
        cliente.agregarCapacitacion(capacitacion);

        // Registrar un accidente del cliente
        Accidente accidente = new Accidente(1, 123456789, "01/01/2022", "08:30", "Planta de producción", "Caída desde altura", "Lesiones graves");
        cliente.registrarAccidente(accidente);

        // Registrar una visita en terreno del cliente
        VisitaTerreno visitaTerreno = new VisitaTerreno(1, 123456789, "01/02/2022", "10:00", "Rancagua", "Planta de producción");
        cliente.registrarVisitaTerreno(visitaTerreno);

        // Agregar una revisión a la visita en terreno del cliente
        Revision revision = new Revision(1, 11222334, "14/03/2023", "10:30", "Santiago", "Visita a terreno");
        visitaTerreno.agregarRevision(revision);

        // Crear un profesional
        Profesional profesional = new Profesional("Ingeniero ", "14/02/2020", "Lidia", "07/03/1954", 112223334);

        // Obtener la edad del profesional
        long edad = profesional.mostrarEdad();
        System.out.println("El profesional tiene " + edad + " años.");

        // Imprimir el nombre y RUN del profesional utilizando el método analizarUsuario()
        //profesional.analizarUsuario();

        /*añadir menu*/

        Usuario usuario1 = new Usuario();
        usuario1.setRun(111222333);
        usuario1.setNombre("Carlos");
        usuario1.setFechanacimiento("04/06/2010");

        usuario1.analizarUsuario();

        // cuando quiero instanciar una clase o crear un objeto de la clase
        //usamos el siguiente ejemplo, para ello siempre es lo mismo

        Contenedor contenedor = new Contenedor();
        contenedor.almacenarCliente(cliente);
        contenedor.almacenarCliente(new Cliente());
    }
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor(); // Crear instancia de Contenedor

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) { // Mientras no se elija salir
            System.out.println("Menú Principal");
            System.out.println("1. Almacenar cliente");
            System.out.println("2. Almacenar profesional");
            System.out.println("3. Almacenar administrativo");
            System.out.println("4. Almacenar capacitación");
            System.out.println("5. Eliminar usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Listar usuarios por tipo");
            System.out.println("8. Listar capacitaciones");
            System.out.println("9. Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Almacenar cliente
                    // Código para solicitar datos del cliente y almacenarlo en el contenedor
                    break;
                case 2: // Almacenar profesional
                    // Código para solicitar datos del profesional y almacenarlo en el contenedor
                    break;
                case 3: // Almacenar administrativo
                    // Código para solicitar datos del administrativo y almacenarlo en el contenedor
                    break;
                case 4: // Almacenar capacitación
                    // Código para solicitar datos de la capacitación y almacenarla en el contenedor
                    break;
                case 5: // Eliminar usuario
                    // Código para solicitar el RUN del usuario a eliminar y eliminarlo del contenedor
                    break;
                case 6: // Listar usuarios
                    // Código para listar todos los usuarios almacenados en el contenedor
                    break;
                case 7: // Listar usuarios por tipo
                    // Código para solicitar el tipo de usuario y listar los usuarios de ese tipo almacenados en el contenedor
                    break;
                case 8: // Listar capacitaciones
                    // Código para listar todas las capacitaciones almacenadas en el contenedor
                    break;
                case 9: // Salir
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        }
    }

}




