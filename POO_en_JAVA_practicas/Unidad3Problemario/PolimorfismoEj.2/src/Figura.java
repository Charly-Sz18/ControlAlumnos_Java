public abstract class Figura {

    private String nombreFigura;

    public Figura(String nombre){
        this.nombreFigura = nombre;
    }
    
    public abstract void pide_Datos();
    public abstract void imprime_Area();
    
}
