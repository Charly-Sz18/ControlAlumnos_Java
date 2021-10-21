import java.util.Scanner;

public class Cuadrado extends Figura {
    Scanner lectura;
    private float lado;

    public Cuadrado(String nombre){
        super(nombre);
       
    }
     
    public Cuadrado(String nombre, float lado){
        super(nombre);
        this.lado = lado;
    }

    public void setLado(float lado){
        this.lado = lado;
    }

    public float getLado(){
        return lado;
    }

    public  void pide_Datos(){
        System.out.println("Ingrese el lado: ");
        setLado(lectura.nextFloat());


    }

    public  float imprime_Area(){
        return lado * lado ;
    }


    
}