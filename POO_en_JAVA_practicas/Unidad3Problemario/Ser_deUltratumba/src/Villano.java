public class Villano{
    private int edad;
    private String nombre;

    public Villano( String n, int e){
        edad = e;
        nombre = n;
    }

    public int getEdad(){
        return edad;

    }

    public String getNombre(){
        return nombre;
    }
    
    public void asustar(){
        System.out.println("Buuuuuuuuuuu!");
    }

    public void gritar(){
        System.out.println("Uaaaaaaaaay!!!!");
    }
     
    
}