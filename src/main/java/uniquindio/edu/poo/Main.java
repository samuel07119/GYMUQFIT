package uniquindio.edu.poo;
import uniquindio.edu.poo.model.*;
import uniquindio.edu.poo.model.TipoDeMaquinas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import static uniquindio.edu.poo.model.TipoMembresia.*;
import static uniquindio.edu.poo.model.EstadoMembresia.ACTIVO;
import static uniquindio.edu.poo.model.EstadoMembresia.INACTIVO;
import static uniquindio.edu.poo.model.NombreMembresia.*;

public class Main {
    private static final Scanner scanner=new Scanner(System.in);

     static Gymuqfit gymuqfit = new Gymuqfit( "GYMUQFIT", "CLL 15 CRA 18 CENTRO", 318862555, 5556, LocalTime.of(5,0),LocalTime.of(12,0),LocalTime.of(15,0),LocalTime.of(22,0),TipoDeEstado.ABIERTO);


    public static void main(String[] args) {


    int opcion=-1;

    while(opcion!=0) {
        System.out.print("\n - - - Bienvenido al Gym UQ FIT - - - ");
        System.out.print("\n ingrese al menu y seleccione la opcion requerida: ");
        System.out.print("1. registrar Usuario");
        System.out.print("2 registrar Entrenador");
        System.out.print("3. registrar Membresia");
        System.out.print("4. registrar Clases");
        System.out.print("5. registrar ActividadDeportiva");
        System.out.print("6. verificar Informacion Usuario");
        System.out.print("7. verificar Membresia");
        System.out.print("8. verificar Clases");
        System.out.print("9. agendar Clases");
        System.out.print("10 agendar Usuarios");
        System.out.print("11. agendar Entrenadores");
        System.out.print("12. agendar ActividadDeportiva");
        System.out.print("13. generar informacion");
        System.out.print("0. Salir");

        System.out.print("\n Ingrese la opcion que desea registrar");
        opcion = scanner.nextInt();
        scanner.nextLine().trim();
        if (opcion == 1) {
            registrarEstudiante(gymuqfit);
        } else if (opcion == 2 ) {
            registrarTrabajadoresuq(gymuqfit);
        } else if (opcion == 3 ) {
            registrarExternos(gymuqfit);
        } else if (opcion==4 ){
            registrarEntrenadores(gymuqfit);
        } else  if(opcion==5 ){
            registrarMembresia(gymuqfit);
        } else if (opcion==6 ){
//            registrarClases(gymuqfit);
        } else if (opcion==7 ) {
            registrarActividadDeportiva(gymuqfit);
        } else if (opcion==8 ){
 //           verificarInformacionUsuario(gymuqfit);
        } else if (opcion==9 ) {
  //          verificarMembresia(gymuqfit);
        } else if (opcion==10 ) {
  //          verificarClases(gymuqfit);
        } else if (opcion==11 ) {
  //          agendarClases(gymuqfit);
        } else if (opcion==12 ) {
   //         agendarUsuario(gymuqfit);
        } else if (opcion==13 ) {
   //         agendarEntrenadores(gymuqfit);
        } else if (opcion==14 ) {
   //         agendarActividadDeportiva(gymuqfit);
        } else if (opcion==15 ) {
   //         generarInformacion(gymuqfit);
        } else if (opcion==0 ) {
            System.exit(0);
        } else {
            System.out.println("Opcion Incorrecta");
        }
    }
        scanner.close();
    }

    public static void registrarEstudiante(Gymuqfit gymuqfit) {

        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese la direccion del usuario");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese la correo del usuario");
        String correo = scanner.nextLine();

        System.out.println("Ingrese la telefono del usuario");
        int telefono = scanner.nextInt();

        System.out.println("Ingrese la edad del usuario");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la peso del usuario");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura del usuario");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el Año de nacimiento del usuario");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el Mes de nacimiento del usuario");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el Dia de nacimiento del usuario");
        int dia = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        System.out.println("La fecha de Nacimiento del usuario" + fechaNacimiento);

        System.out.println("ingrese el curso Academico que cursa");
        String cursoAcademico = scanner.nextLine();

        System.out.println("Ingrese el Programa Academico en el que se encuentra");
        String programa = scanner.nextLine();

        System.out.println("Ingrese el semestre en el que se encuentra");
        int semestre = scanner.nextInt();

        System.out.println("Ingrese el Tipo de Membresia");
        String tipoMembresiaString = scanner.nextLine();
        TipoMembresia tipoMembresia;
        if(tipoMembresiaString == "TRIMESTARL") {
            tipoMembresia =TRIMESTRAL;
        } else if (tipoMembresiaString=="MENSUAL") {
            tipoMembresia =MENSUAL;
        }else {
            tipoMembresia = ANUAL;
        }


        Estudiante estudiante = new Estudiante(nombre, apellido, identificacion, direccion, correo, telefono, edad, peso, altura, fechaNacimiento, cursoAcademico, programa, semestre, tipoMembresia);



        gymuqfit.registarEstudiante(estudiante);
        System.out.println(" El usuario ha sido registrado con exito");

    }
        public static void registrarTrabajadoresuq(Gymuqfit gymuqfit) {
            System.out.println("Ingrese el nombre del usuario");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la apellido del usuario");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la identificacion del usuario");
            int identificacion = scanner.nextInt();

            System.out.println("Ingrese la direccion del usuario");
            String direccion = scanner.nextLine();

            System.out.println("Ingrese la correo del usuario");
            String correo = scanner.nextLine();

            System.out.println("Ingrese la telefono del usuario");
            int telefono = scanner.nextInt();

            System.out.println("Ingrese la edad del usuario");
            int edad = scanner.nextInt();

            System.out.println("Ingrese la peso del usuario");
            double peso = scanner.nextDouble();

            System.out.println("Ingrese la altura del usuario");
            double altura = scanner.nextDouble();

            System.out.println("Ingrese el Año de nacimiento del usuario");
            int anio = scanner.nextInt();

            System.out.println("Ingrese el Mes de nacimiento del usuario");
            int mes = scanner.nextInt();

            System.out.println("Ingrese el Dia de nacimiento del usuario");
            int dia = scanner.nextInt();

            LocalDate fechaNacimiento= LocalDate.of(anio,mes,dia);
            System.out.println("La fecha de Nacimiento del usuario"+fechaNacimiento);

            System.out.println("Ingrese el lugar donde labora");
            String lugarDondeLabora = scanner.nextLine();

            System.out.println("Ingrese el codigo de servicio asignado");
            int codigoServicio = scanner.nextInt();

            System.out.println("Ingrese el Cargo ");
            String cargo = scanner.nextLine();

            System.out.println("Ingrese el Tipo de Membresia");
            String tipoMembresiaString = scanner.nextLine();
            TipoMembresia tipoMembresia;
            if(tipoMembresiaString == "TRIMESTARL") {
                tipoMembresia =TRIMESTRAL;
            } else if (tipoMembresiaString=="MENSUAL") {
                tipoMembresia =MENSUAL;
            }else {
                tipoMembresia = ANUAL;
            }

            Trabajadoresuq trabajadoresuq = new Trabajadoresuq(nombre,apellido,identificacion,direccion,correo,telefono,edad,fechaNacimiento,lugarDondeLabora,codigoServicio,cargo,peso,altura, tipoMembresia);

            gymuqfit.registarTrabajadoresuq(trabajadoresuq);
            System.out.println(" El usuario ha sido registrado con exito");

        }

    public static void registrarExternos(Gymuqfit gymuqfit) {

        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese la direccion del usuario");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese la correo del usuario");
        String correo = scanner.nextLine();

        System.out.println("Ingrese la telefono del usuario");
        int telefono = scanner.nextInt();

        System.out.println("Ingrese la edad del usuario");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la peso del usuario");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura del usuario");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el Año de nacimiento del usuario");
        int anio = scanner.nextInt();

        System.out.println("Ingrese el Mes de nacimiento del usuario");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el Dia de nacimiento del usuario");
        int dia = scanner.nextInt();

        LocalDate fechaNacimiento= LocalDate.of(anio,mes,dia);
        System.out.println("La fecha de Nacimiento del usuario"+fechaNacimiento);

        System.out.println("Ingrese el cargo del usuario");
        String cargo = scanner.nextLine();

        System.out.println("Ingrese la ocupacion del usuario");
        String ocupacion = scanner.nextLine();

        System.out.println("Ingrese la Empresa donde labora el usuario");
        String empresaDondeLabora = scanner.nextLine();

        System.out.println("Ingrese el Tipo de Membresia");
        String tipoMembresiaString = scanner.nextLine();
        TipoMembresia tipoMembresia;
        if(tipoMembresiaString == "TRIMESTARL") {
            tipoMembresia =TRIMESTRAL;
        } else if (tipoMembresiaString=="MENSUAL") {
            tipoMembresia =MENSUAL;
        }else {
            tipoMembresia = ANUAL;
        }

        Externos externos =new Externos(nombre,apellido,identificacion,direccion,correo,telefono,edad,peso,altura,fechaNacimiento,cargo, ocupacion, empresaDondeLabora, tipoMembresia);

        gymuqfit.registrarExternos(externos);
        System.out.println(" El usuario ha sido registrado con exito");

    }


    public static void registrarEntrenadores(Gymuqfit gymuqfit) {
        System.out.println("Ingrese la nombre del Entrenador");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del Entrenador");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del Entrenador");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese la telefono del Entrenador");
        int telefono = scanner.nextInt();

        System.out.println("Ingrese la direccion del Entrenador");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el cargo del Entrenador ");
        String cargo = scanner.nextLine();

        System.out.println("Ingrese el estado del Entrenador");
        String estado = scanner.nextLine();

        System.out.println("Ingrese la Especialidad del Entrenador");
        String especialidad = scanner.nextLine();


        Entrenadores entrenadores = new Entrenadores(nombre, apellido, identificacion, telefono, direccion, cargo, estado,
                especialidad, EstadoDeEntrenadores.LABORANDO);

        gymuqfit.registrarEntrenadores(entrenadores);
        System.out.println("El Entrenador ha sido registrado con exito");

    }


    public  static void registrarMembresia(Gymuqfit  gymuqfit) {

        System.out.println("Ingrese el nombre de la membresia");
        String nombreMembresiaString = scanner.nextLine();
        NombreMembresia nombreMembresia;
        if(nombreMembresiaString == "PREMIUM") {
            nombreMembresia = PREMIUM;
        }else if(nombreMembresiaString == "VIP") {
            nombreMembresia =VIP;
        }else {
            nombreMembresia =BASICO;
        }


        System.out.println("Ingrese el estado de membresia");
        String estadoDeMembresiaUsuario = scanner.nextLine();
        EstadoMembresia estadoMembresia;
        if(estadoDeMembresiaUsuario == "ACTIVO") {
            estadoMembresia=ACTIVO;
        } else {
            estadoMembresia= INACTIVO;
        }


        System.out.println("Ingrese el costo de membresia");
        String tipoMembresiaString = scanner.nextLine();
        TipoMembresia tipoMembresia;
        if(tipoMembresiaString == "TRIMESTARL") {
            tipoMembresia =TRIMESTRAL;
        } else if (tipoMembresiaString=="MENSUAL") {
            tipoMembresia =MENSUAL;
        }else {
            tipoMembresia = ANUAL;
        }


        System.out.println("Ingrese el dia de vinculacion a la membresia");
        int diaVinculacion = scanner.nextInt();

        System.out.println("Ingrese el mes de vinculacion a la membresia");
        int mesVinculacion = scanner.nextInt();

        System.out.println("Ingrese el año de la vinculacion a la membresia");
        int anioVinculacion = scanner.nextInt();

        LocalDate fechaInicioMembresia = LocalDate.of(diaVinculacion,mesVinculacion,anioVinculacion);
        System.out.println("Ingrese fecha de inicio de la membresia"+fechaInicioMembresia);


        LocalDate fechaVencimiento = fechaInicioMembresia;
        if(tipoMembresiaString=="MENSUAL") {
            fechaVencimiento=fechaVencimiento.plusMonths(1);
        }else if(tipoMembresiaString=="TRIMESTARL") {
            fechaVencimiento=fechaVencimiento.plusMonths(3);
        }else {
            fechaVencimiento=fechaVencimiento.plusYears(1);
        }


        Membresia membresia = new Membresia(fechaInicioMembresia,fechaVencimiento,estadoMembresia, tipoMembresia,nombreMembresia);

        gymuqfit.registrarMembresia(membresia);
        System.out.println(" Se Registro el Usuario a la Correspondiente Membresia");
    }


    public static void registrarActividadDeportiva(Gymuqfit gymuqfit) {
        System.out.println("Ingrese el nombre de la actividad deportiva");
        String nombreActividadDeportiva = scanner.nextLine();

       ActividadDeportiva actividadDeportiva = new ActividadDeportiva(nombreActividadDeportiva);

       System.out.println("el usuario Utilizara los Diferentes tipos de Maquinas asi: ");

       for(TipoDeMaquinas tipo : TipoDeMaquinas.values()) {

           System.out.println(tipo.name());
       }

       gymuqfit.registrarActividadDeportiva(actividadDeportiva);
       System.out.println("se registro actividad deportiva");
    }



    public  static void registrarClases(Gymuqfit gymuqfit) {
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();


        System.out.println("Ingrese el usuario para separar el Cupo");
        int cupoMaximo = scanner.nextInt();

        System.out.println("Ingrese la fecha de ingreso del usuario (YYYY-MM-DD HH:mm:ss)");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese la fecha de salida del usuario");
        String fechaFinalizacion = scanner.nextLine();

        LocalDateTime fechaInicioClases = LocalDateTime.parse(fechaInicio);
        System.out.println("Ingrese la fecha de inicio de las clases"+fechaInicioClases);

        LocalDateTime fechaFinalizacionClases = LocalDateTime.parse(fechaFinalizacion);
        System.out.println("Ingrese la fecha de finalizacion de las clases"+fechaFinalizacionClases);

        System.out.println("Ingrese el Enttrenador de la clase");
        int identificacion = scanner.nextInt();

        Entrenadores entrenadores =gymuqfit.buscarEntrenadorPorIdentificacion(identificacion);

        System.out.println("Ingrese el Tipo de Clase");
        String tipoDeClasesUsuario = scanner.nextLine();
        Tipo_Clases tipo_clases;
        try{
        tipo_clases=Tipo_Clases.valueOf(tipoDeClasesUsuario);
        }catch(IllegalArgumentException e){
            tipo_clases = Tipo_Clases.OTROS;
        }


       Clases clases = new Clases(nombre, cupoMaximo,fechaInicioClases,fechaFinalizacionClases,entrenadores,tipo_clases);

        gymuqfit.registrarClases(clases);
        System.out.println("La clase a sido registrada");

    }
    public  static void verificarInformacionUsuario(Usuario usuario){
        System.out.println("Ingrese el nombre del usuario");
        String verificarNombreDeUsuario=scanner.nextLine();

        System.out.println("Ingrese el apellido del usuario");
        String verificarCedulaUsuario=scanner.nextLine();

        System.out.println("Ingrese el numero de identificacion del usuario");
        int verificarIdentificacionDeUsuario=scanner.nextInt();

    }

    public  static void verificarClases(Clases clases){
        System.out.println("Ingrese el numero de identificacion del usuario");
        String verificarIdentificacionDeUsuario=scanner.nextLine();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio=scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinal=scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio=scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaFinal=scanner.nextLine();

    }

    public  static void  asignarMembresia(Gymuqfit gymuqfit) {
        System.out.println("Ingrese el numero de Identidicacion del usuario");
        int identidicacion = scanner.nextInt();
        System.out.println("Ingrese la membresia a Actualizar del usuario");
        String tipoMembresiaString = scanner.nextLine();
        TipoMembresia tipoMembresia;
        if(tipoMembresiaString == "TRIMESTARL") {
            tipoMembresia =TRIMESTRAL;
        } else if (tipoMembresiaString=="MENSUAL") {
            tipoMembresia =MENSUAL;
        }else {
            tipoMembresia = ANUAL;
        }
        Usuario usuario=gymuqfit.buscarUsuarioPorIdentificacion(identidicacion);

        boolean asignarUsuarioaMembresia= gymuqfit.asignarMembresia(usuario,tipoMembresia);
        if(asignarUsuarioaMembresia==true) {
            System.out.println("Seactualizo correctamente a :"+tipoMembresia.name());

        }else {
          System.out.println("El usuario no se encontro");

        }
        }




    public  static void agendarClases(Clases clases) {
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();
    }

    public  static void agendarUsuario(Usuario usuario){
        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicio = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicio = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();

    }

    public  static void agendarEntrenadores(Entrenadores entrenadores){
        System.out.println("Ingrese el nombre del Entrenador");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese la apellido del Entrenador");
        String apellidoEntrenador = scanner.nextLine();

        System.out.println("Ingrese la identificacion del Entrenador");
        int identificacionEntrenador = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaInicioClases = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaFinalizacionClase = scanner.nextLine();

        System.out.println("Ingrese la hora de inicio de las clases");
        String horaInicioClase = scanner.nextLine();

        System.out.println("Ingrese la hora de finaliza de las clases");
        String horaDeFinalizacionClase = scanner.nextLine();

    }

    public  static void agendarActividadDeportiva(ActividadDeportiva actividadDeportiva){
        System.out.println("Ingrese el nombre del usuario para la actividad deportiva");
        String nombreActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario para la actividad de portiva");
        int identificacionActividadDeportiva = scanner.nextInt();

        System.out.println("Ingrese el fecha de ingreso a la actividad deportiva");
        String fechaIngresoActividadDeportiva = scanner.nextLine();

        System.out.println("Ingrese la fecha de terminacion de la actividad deportiva");
        String fechaTerminacionActividadDeportiva = scanner.nextLine();


    }

    public  static void generarInformacion(Gymuqfit gymuqfit,Usuario usuario,Membresia membresia,Clases clases,ActividadDeportiva actividadDeportiva,Entrenadores entrenadores,Estudiante estudiante,Externos externos,Trabajadoresuq trabajadoresuq,RutinasDeFuerza rutinasDeFuerza,TipoDeEstado tipoDeEstado){


        System.out.println("Ingrese el nombre del usuario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la apellido del usuario");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la identificacion del usuario");
        int identificacion = scanner.nextInt();

        System.out.println("Ingrese el fecha de inicio de las clases");
        String fechaIngreso = scanner.nextLine();

        System.out.println("Ingrese el fecha de finaliza de las clases");
        String fechaDeVencimiento = scanner.nextLine();

        System.out.println("Ingrese el tipo de membresia");
        String tipoMembresia = scanner.nextLine();

        System.out.println("Ingrese el estado de membresia");
        String estadoMembresia = scanner.nextLine();

        System.out.println("Ingrese el costo de membresia");
        double costoMembresia = scanner.nextDouble();

        System.out.println("Ingrese el nombre del entrebnador");
        String nombreEntrenador = scanner.nextLine();


    }

    //INVOCACIONES ENUM



    public void estadoDelGymuqfit() {
        TipoDeEstado horaActual=TipoDeEstado.ABIERTO;
        System.out.println("Estado del GymUqFit es: "+horaActual);
        System.out.println(horaActual.toString());
        System.out.println(horaActual.equals(TipoDeEstado.ABIERTO)+"el GymUqFit esta disponible"+ horaActual.isDisponible());
    }

    public void estadoDeMembresiaUsuarios(){
        EstadoMembresia vinculado= ACTIVO;
        System.out.println("Estado del GymUqFit es: "+vinculado);
        System.out.println("Mensaje"+vinculado.getDescripcionUsuario());

    }


    public void TipoEstadoDeMaquina(String Mensaje) {
        TipoDeMaquinas maquinas=TipoDeMaquinas.CAMINADORA;
        System.out.println("Tipo de Maquina:" + maquinas);
        System.out.println("Mensaje:" + maquinas.getMensaje());
        System.out.println("disponible"+ maquinas.isDisponible());
    }
    public void estadoDeEntrenadores(String Mensaje) {
        EstadoDeEntrenadores laborando=EstadoDeEntrenadores.LABORANDO;
        System.out.println("El Estado del Entrenador es:" + laborando);
        System.out.println("Mensaje:" + laborando.getMensaje());
        System.out.println("disponible"+laborando.isDisponible());
    }
    public void rutinasDeFuerza(String Mensaje) {
        RutinasDeFuerza rutina = RutinasDeFuerza.BICEPS;
        System.out.println("El entrenamiento es:" + rutina);
        System.out.println("Mensaje:" +rutina.getRutina());
    }

    public void costoMembresia(Membresia membresia) {
        TipoMembresia registrado = TipoMembresia.MENSUAL;
        System.out.println("El costo de membresia es: "+registrado);
        System.out.println("registro:"+registrado.getRegistro());

    }

}

  public void TipoMembresia (String mensaje){
    
  }