import java.util.Scanner;

public class Triangulo extends Figura{
    Scanner lectura ;
    private float base;
    private float altura;

    public Triangulo (String nombre ){
        super(nombre);
    }

    public Triangulo (String nombre, float base, float altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public void setAltura(float alt){
        this.altura = alt;
    }

    public void SetBase(float bas){
        this.base = bas;
    }

    public float getAltura(){
        return altura;
    }

    public float getBase(){
        return base;
    }
    

    public  void pide_Datos(){
        lectura= new Scanner(System.in);
        System.out.println("Ingrese la Base; ");
        SetBase(lectura.nextFloat());
        System.out.println("Ingrese la Altura; ");
        setAltura(lectura.nextFloat());
    }

    public  void imprime_Area(){
        System.out.println("El area del Triangulo es: "+ (base*altura)/2);
    }

    
}
