
import  java.util.Scanner;

public class EstudianteControlador {
    

    //atributos
    private String nombre;
    private Double calificacion;
    private Integer edad;
    private Integer matricula;
     
    // metodos

    EstudianteControlador(){} //construtor

    EstudianteControlador(String nombre, Double calificacion, Integer edad, Integer matricula){
        this.nombre =nombre;
        this.calificacion = calificacion;
        this.edad = edad;
        this.matricula= matricula;

        /*setNombre(nombre);
        setCalificacion(calificacion);
        setEdad(edad);*/
    }

    //seting y get 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }


    public void setCalificacion (Double calificacion){
        this.calificacion = calificacion;
    } 
    public Double getCalificacion(){
        return this.calificacion;
    }

    public void setEdad (Integer edad){
        this.edad = edad;
    } 
    public Integer getEdad(){
        return this.edad;
    }

    public void setMatricula(Integer matricula){
        this.matricula = matricula;
    }
    public Integer getMatricula(){
        return this.matricula;
    }

    /*public void imprimirDatos(){
       System.out.println("Nombre: " + this.nombre + ", Matricula: "+ this.matricula +", edad: " + this.edad + ", cal: " + this.calificacion + ".");
    }*/
    
    @Override
    public  String toString(){
        return " Nombre: " + getNombre() + ", Matricula: "+ getMatricula() +", edad: " + getEdad() + ", cal: " + getCalificacion() + ".";
     }

    
    

    public void pedirDatos(){

        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Nombre del estudiante:");
        setNombre(lectura.next());

        System.out.println("Calificacion: ");
        setCalificacion(lectura.nextDouble());

        System.out.println("edad: ");
        setEdad(lectura.nextInt());

        System.out.println("Matricula: ");
        setMatricula(lectura.nextInt());
    }
}
