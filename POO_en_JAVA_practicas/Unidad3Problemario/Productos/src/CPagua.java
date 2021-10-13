public class CPagua extends Pcongelado{
  
    private int salinidad;

    public CPagua(String lote, String pais,int temp, int sal){
        super(lote, pais, temp);
        this.salinidad = sal;
    }


    public void setSal(int sal){
        this.salinidad = sal;
    }

    public int getSal(){
        return salinidad;
    }

    
}
