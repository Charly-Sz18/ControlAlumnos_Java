import java.util.ArrayList;
import java.util.Scanner;

public class VistaEstudiante {
    private Scanner lectura;
    
    public Integer Menu(){

        
        lectura = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("---------------------------------------------");
        System.out.println("|                 Menu                      |");
        System.out.println("---------------------------------------------");
        System.out.println("[1] Agregar estudiante");
        System.out.println("[2] Despliegue lista");
        System.out.println("[3] Informacion de estudiante");
        System.out.println("[4] Modificar datos del estudiante");
        System.out.println("[5] Eliminar estudiante");
        System.out.println("[6] Salir ");
        System.out.println("Opcion: ");

        return lectura.nextInt();
        
    }

    public void errorOp(){
        System.out.println("Inserte solamente los numeros listados :\n");
    }

  
    public void imprimirListaEstudiantes(ArrayList<EstudianteControlador> listaC){
 
        if (listaC.size()==0){
            System.out.println("\t Base de datos vacia :(");
        }
        else{

            System.out.println("\n\t LISTA:");
            for (int i = 0; i < listaC.size() ; i++) {
                System.out.println(listaC.get(i));         
            }
        }

        
    }


    public Integer PedirMatricula(){
        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese la matricula que desea encontrar:");
        return lectura.nextInt();

        
    }


    public void imprmirinfoEsp(EstudianteControlador info) {
       
        if (info != null ){
            System.out.println("\n LISTADO:");
            System.out.println(" Nombre: " +  info.getNombre() + ", Matricula: "+ info.getMatricula() +", edad: " + info.getEdad() + ", cal: " + info.getCalificacion() + ".");
           
        }
        else{

            System.out.println("\nError\n");
        }

        
    }

    public Integer  decicion(EstudianteControlador alumno){
      System.out.println("¡Esta segur@ de eliminar al alumno "+ alumno.getNombre()+"?\n 1.Si\n 2.No\n Opción: ");
      Integer lecture = lectura.nextInt();
      
      if(lecture == 1){
          return 1;
      }
      else{
        System.out.println("No se elimino el alumno, SALVADO");
        return 0;
      }
    }

    public void InfodelEliminado(EstudianteControlador eliminado){
        if (eliminado != null){
       
            System.out.println("\nEl alumno fue eliminado correctamente\n" + eliminado);
        }
        else{
            System.out.println("La matricula no se encuentra en el listado.");
            System.out.println("\nError. Acción no realizada\n");
        } 

    }

    public Integer MenuModificar(ArrayList<EstudianteControlador> editar, Integer lugar){
        
        lectura = new Scanner(System.in);
        System.out.println("\n\n");
        for (int i = 0; i < editar.size(); i++) {
            if (i==lugar){
                System.out.println(editar.get(i));
            }
        }
        System.out.println("---------------------------------------------");
        System.out.println("|          Editar Datos                     |");
        System.out.println("---------------------------------------------");
        System.out.println("[1] Editar nombre");
        System.out.println("[2] Editar edad");
        System.out.println("[3] Editar calificación");
        System.out.println("[4] Editar todo");
        System.out.println("[5] Salir ");
        System.out.println("Opcion: ");

        return lectura.nextInt();

    }

    public  String nombre(){
        lectura = new Scanner(System.in);
        System.out.println("Inserte nuevo Nombre :");
        return lectura.next();
    }

    public  int edad(){
        lectura = new Scanner(System.in);
        System.out.println("Inserte nueva Edad:");
        return lectura.nextInt(); 
    }

    public  double calificacion (){
        lectura = new Scanner(System.in);
        System.out.println("Inserte nueva Calificación: ");
        return lectura.nextDouble();
    }



    public void msg(){
             System.out.println("\nDato modificadio");
            
    }







    

}
