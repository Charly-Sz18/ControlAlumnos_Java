public class Pfrescos extends Tproductos{
    
    private int anio;

    public Pfrescos(String lote, String pais, int anioE){
        super(lote, pais);
        this.año = anioE;
    }

    public void setAño(int anioE){
        this.anio = anioE;
    }

    public int getAño(){
        return anio;
    }
    

}
