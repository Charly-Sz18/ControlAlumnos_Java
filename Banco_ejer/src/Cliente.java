public class Cliente {
    

    //atributos
    private String nombre;
    private String Apellido;
    private String Numero_cuenta;
    private double saldo;
    Integer vuelta = 0 ;
    
     
    // metodos

    Cliente(){} //construtor

    Cliente(String Nombre, String Apellido, String Numero_cuenta){
        this.nombre=Nombre;
        this.Apellido=Apellido;
        this.Numero_cuenta=Numero_cuenta;
    }
        

    Cliente(String Nombre, String Apellido, String Numero_cuenta, double Saldo){
        this.nombre=Nombre;
        this.Apellido=Apellido;
        this.Numero_cuenta=Numero_cuenta;
        this.saldo = Saldo;
    }




    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setApellido(String apellido){
        this.Apellido = apellido;
    }

    public String getApellido(){
        return this.Apellido;
    }


    public void setCuenta (String cuenta){
        this.Numero_cuenta = cuenta;
    } 
    public String getCuenta(){
        return this.Numero_cuenta;
    }
    public void setSaldo (Double saldo){
        this.saldo = saldo;
    } 
    public double getSaldo(){
        return this.saldo;
    }

    

    

    
}
