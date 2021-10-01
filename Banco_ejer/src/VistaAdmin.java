import java.util.ArrayList;
import java.util.Scanner;

public class VistaAdmin {
    Cliente datos = new Cliente();
    Scanner lectura;
    ControladorBanco control = new ControladorBanco();
    VistaAdmin vista;
    

    public Integer Menu(){

        
        lectura = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("---------------------------------------------");
        System.out.println("|            Menu de Banco                  |");
        System.out.println("---------------------------------------------");
        System.out.println("[1] Agregar cliente");
        System.out.println("[2] Realizar deposito");
        System.out.println("[3] Realizar retiro");
        System.out.println("[4] Realizar transferencia");
        System.out.println("[5] Busqueda de cliente por cuenta");
        System.out.println("[6] Salir ");
        System.out.println("Opcion: ");

        return lectura.nextInt();
        
    }

    public void pedirDatos(){
        lectura = new Scanner (System.in);
        System.out.println("Nombre nuevo cliente:");
        datos.setNombre(lectura.nextLine());
        System.out.println("Apellidos nuevo cliente:");
        datos.setApellido(lectura.nextLine());
        System.out.println("Asignar numero de cuenta: ");
        datos.setCuenta(lectura.nextLine());
        double auxSaldo;
        do{
            auxSaldo=0;
            System.out.println("saldo: ");
             auxSaldo=lectura.nextDouble();
            
            if (auxSaldo < 100){
                 System.out.println("El saldo de apertura debe ser mayor o igual a $100");
            }
            else{
                datos.setSaldo(auxSaldo);
            }
        }while( auxSaldo < 100);
        

        System.out.println("\n\tRegistro de cliente Exitoso");
        
    }

    public String PedirNCuenta(){
        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese numero de cuenta:");
        return lectura.next();   
    }
    public String pedirCuentatransferencia(){
        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese numero de cuenta:");
        return lectura.next();   
    }
    
    
    public double pedirDeposito(){

        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese la cantidad a depositar:");
        return lectura.nextDouble(); 

    }
    public double pedirCRetiro(){
        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese la cantidad a retirar:");
        return lectura.nextDouble();

    }
    public double PedirCtransferencia(){
        lectura = new Scanner(System.in);
        System.out.println("\n Ingrese la cantidad a Transferir:");
        return lectura.nextDouble();

    }

    public void NotificarDeposito(boolean cambio){

        if (cambio == true){
             System.out.println("\n\t¡¡Deposito realizado con Exito!!");
        }
        else
        {
            System.out.println("\n\t\tOcurrio un error :( ");
        }

    }

    public void NotificarRET(boolean cambio){

        if (cambio == true){
             System.out.println("\n\t\t¡¡Retiro de efectivo, realizado con Exito!!");
        }
        else
        {
            System.out.println("\n\t\tOcurrio un error :( ");
        }

    }

    public void NotificarTRans(boolean cambio){

        if (cambio == true){
             System.out.println("\n\t\t¡¡transferencia exitosa!!");
        }
        else
        {
            System.out.println("\n\t\tOcurrio un error :( ");
        }

    }

    public void imprmirinfoCliente(VistaAdmin dato) {
        
       
        if (dato != null ){
            System.out.println("\n LISTADO:");
            System.out.println(" N°.Cuenta: " + dato.datos.getCuenta() + "      Nombre: " +  dato.datos.getNombre() +  dato.datos.getApellido() + "     Saldo: " + dato.datos.getSaldo() + ".");
           
        }
        else{

            System.out.println("\nError, verifique el numero de cuenta\n");
        }

        
    }

    public void imprimirdatostotal (ArrayList<VistaAdmin> listaC){
        
        if (listaC.size() == 0){
            System.out.println("\t Base de datos vacia :(");
        }
        else{

            System.out.println("\n\t LISTA:");
            for (int i = 0; i < listaC.size() ; i++) {
                System.out.println(listaC.get(i));         
            }
        }
        
    }

    @Override
    public String toString(){
        return "N°.cuenta: "+ datos.getCuenta() + "     Cliente: "+ datos.getNombre() + datos.getApellido() + "    Saldo acumulado: " + datos.getSaldo()+"." ;

    }
    

}
