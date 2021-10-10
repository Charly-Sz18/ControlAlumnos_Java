public class Pfrescos extends Tproductos{
    
    private int año;

    public Pfrescos(String lote, String pais, int añoE){
        super(lote, pais);
        this.año = añoE;
    }

    public void setAño(int añoE){
        this.año = añoE;
    }

    public int getAño(){
        return año;
    }
    

}
