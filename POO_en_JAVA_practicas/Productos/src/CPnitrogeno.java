public class CPnitrogeno extends Pcongelado{

    private String metodo;

    public  CPnitrogeno(String lote, String pais , int tem, String Tmetodo){
        super(lote, pais, tem);
        this.metodo = Tmetodo;
    }

    public void setMetodo(String Tmetodo){
        this.metodo = Tmetodo;
    }

    public String  getMetodo(){
        return metodo;
    }
    



}
