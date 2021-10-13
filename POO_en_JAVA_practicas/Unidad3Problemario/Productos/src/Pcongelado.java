public class Pcongelado extends Tproductos{

    private  int Temperatura;

    public  Pcongelado(String lote, String pais, int tem){
        super(lote, pais);

        this.Temperatura = tem;
    }

    public void setTemp(int tem){
        this.Temperatura = tem;
    }

    public int getTemp(){
        return Temperatura;
    }
    
}
