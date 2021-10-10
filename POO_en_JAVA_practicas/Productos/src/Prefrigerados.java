public class Prefrigerados extends Tproductos {

    private int codOSA;

    public Prefrigerados(String lote, String pais, int codigoO){
        super(lote,pais);
        this.codOSA = codigoO;
    }

    public void setCodigoOrga(int codigoO){
        this.codOSA = codigoO;
    }

    public int getCodigoOrga(){
        return codOSA;
    }
    
}
