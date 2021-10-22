public class Racional {

    private int Num,Den;

    public Racional(int num, int den){
        
        this.Num = num;

        if (den == 0){
            this.Den = 1;
        }
        else{
            this.Den = den;
        }
    }
   

    public void setNumerador(int num){
        this.Num = num;
    }

    public void setDenominador(int den){
        if (den == 0){
            this.Den = 1;
        }
        else{
            this.Den = den;
        }
    }

    public int getNumerador(){
        return Num;
    }
    public int getDenominador(){
        return Den;
    }

    //@Override
    public boolean equals(Racional rac){
        return Num == rac.getNumerador() && Den == rac.getDenominador();
    }
    
    public Racional Multiplicacion (Racional rac){
        int n = Num * rac.getNumerador();
        int d = Den * rac.getDenominador();
        return (new Racional(n,d).simplificar());
    }

    public Racional Division (Racional rac){
        int n = Num * rac.getDenominador();
        int d = Den * rac.getNumerador();
        return (new Racional(n,d).simplificar());

    }

    public Racional Suma(Racional rac){

        int n = Num * rac.getDenominador() + Den* rac.getNumerador();
        int d = Den * rac.getDenominador();
        return (new Racional(n,d).simplificar());

    }

    //simplifica la fracción con el metodo de división entre el MCD
    public Racional simplificar(){

    int MCD = mcd(Math.abs(Num),Math.abs(Den));
    Racional resp = new Racional( Num/MCD , Den/MCD);
    if (Den< 0) {
        resp.Num = - resp.Num; resp.Den = -resp.Den;
    }
    return resp;
    }

    //regresa datos de tipos statico debido a que hacemos uso de los metodos de la  libreria Math. calcula el CMD de los racionales
    public static int mcd(int n, int d){
        if (n<d){
            int aux= n ; n=d; d=aux;
        }
        while (d > 0){
            int aux = n % d;
            n = d; d = aux;
        }
        return n;
    }






    @Override
    public String toString(){
        return(Num + "/" + Den );
    }

    
}
