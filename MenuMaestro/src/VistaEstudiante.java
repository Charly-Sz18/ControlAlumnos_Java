import java.util.ArrayList;
import java.util.Scanner;

public class VistaEstudiante {
    private Scanner lectura;
    
    public Integer Menu(){

        
        lectura = new Scanner(System.in);

        System.out.println("****Menu**");
        System.out.println("1-agregar estudiante");
        System.out.println("2-Despliegue lista");
        System.out.println("3-Informacion de estudiante");
        System.out.println("4-Modificar datos del estudiante");
        System.out.println("5-Eliminar estudiante");
        System.out.println("6-salir ");
        System.out.println("Opcion: ");

        return lectura.nextInt();
        
    }

    public Integer PedirMatricula(){
        lectura = new Scanner(System.in);
        System.out.println("Ingrese la matricula que desea encontrar:");
        return lectura.nextInt();

        
    }

    public void imprimirdatostotal (ArrayList<EstudianteControlador> estudiantes){
        estudiantes.forEach(System.out::println);
        
    }
    
    public void imprmirinfo(EstudianteControlador lugar) {
     //ControladorEstudiante lista = new ControladorEstudiante();
       
        if (lugar != null ){
       
            System.out.println(" Nombre: " +  lugar.getNombre() + ", Matricula: "+ lugar.getMatricula() +", edad: " + lugar.getEdad() + ", cal: " + lugar.getCalificacion() + ".");
            //System.out.println("\nsi esta en la lista\n");
        }
        else{

            System.out.println("\nError en el lisatado\n");
        }  
    }

    public void imprimireliminado(EstudianteControlador borrando){

        if (borrando != null ){
       
            System.out.println("\nEl alumno fue eliminado correctamente\n");
        }
        else{

            System.out.println("\nError. Acción no realizada\n");
        }  
    }
}
