import java.util.ArrayList;
public class ControladorBanco {
    
    private  ArrayList <VistaAdmin> listcontrol;
    VistaAdmin vista ;
    ControladorBanco mismo;
    Cliente datos;

    ControladorBanco(){} //construtor

    ControladorBanco(VistaAdmin vista){
        listcontrol = new ArrayList <VistaAdmin>();
        this.vista =  vista;
    }
    
    public void  addeCliente(){

       listcontrol.add(0, new VistaAdmin());
       listcontrol.get(0).pedirDatos();
       }

    public Integer BuscarEs (String NCuenta){
        
        int lugar = -1;

        for (int i = 0; i < listcontrol.size(); i++) {
                //Equals realiza una comparacion entre dos cadenas(variables);
            if ( listcontrol.get(i).datos.getCuenta().equals(NCuenta)){
            
                return i;
            }
            
        }    
     return lugar;
    }

    public VistaAdmin BusquedaEpecifica(Integer posicion){
       // System.out.println("posicion" + posicion);
        if (posicion != -1){
            return listcontrol.get(posicion);
        }
    
        return null ;        
       }

    public boolean Deposito(Integer lugar){

        
        if (lugar != -1){

            listcontrol.get(lugar).datos.setSaldo(listcontrol.get(lugar).datos.getSaldo() + vista.pedirDeposito());
           
            return true;

        }
        
        return false;
        
    }


    public boolean retiro( Integer posicion){
        
        if (posicion != -1){
            double efectivo =vista.pedirCRetiro();
            if (listcontrol.get(posicion).datos.getSaldo() >= efectivo){
            listcontrol.get(posicion).datos.setSaldo(listcontrol.get(posicion).datos.getSaldo() - efectivo);
            System.out.println("\n\t\t Retiro: " + "$"+ efectivo);
            System.out.println("\n\t\t Saldo en cuenta: "+"$"+listcontrol.get(posicion).datos.getSaldo());
            return true;
            }
            else{
            System.out.println("\n\t\t¡¡¡Sin saldo suficiente !!!");
            }
        }
        return false;
    }

    public boolean transferencia(Integer estancia){
        if (estancia != -1){
            
            double efectivo = vista.PedirCtransferencia();
            String  quien = vista.pedirCuentatransferencia();
            if (listcontrol.get(estancia).datos.getSaldo() >= efectivo){
                for (int index = 0; index < listcontrol.size(); index++) {
                    if(listcontrol.get(index).datos.getCuenta().equals(quien)){
                        listcontrol.get(index).datos.setSaldo(listcontrol.get(index).datos.getSaldo()+ efectivo);
                        listcontrol.get(estancia).datos.setSaldo(listcontrol.get(estancia).datos.getSaldo() - efectivo);
                        System.out.println("\n\t\t Monto transferido: " + "$"+ efectivo);
                        System.out.println("\n\t\t Saldo en cuenta: "+"$"+ listcontrol.get(estancia).datos.getSaldo());
                        return true;
                    }
                    
                }
            }
            }
            else{
            System.out.println("\n\t\t¡¡¡Sin saldo suficiente !!!");
            }
        
        return false;
    }




   public void MenuBanco(){
    Integer opcion = 0;

    while (opcion != 6){
         Integer R = vista.Menu();
        if ( R >0 && R<=6){
        switch (R) {
            case 1: addeCliente(); break;
            case 2: String Deposito; Deposito=vista.PedirNCuenta();
                    vista.NotificarDeposito(Deposito(BuscarEs(Deposito)));
                    break;
            case 3: String Ret; Ret=vista.PedirNCuenta();
                    vista.NotificarRET(retiro(BuscarEs(Ret))); 
                    break;
            case 4: String trans; trans=vista.PedirNCuenta();
                    vista.NotificarTRans(transferencia(BuscarEs(trans)));
                    vista.imprimirdatostotal(listcontrol); 
                    break;
            case 5: String borrar; borrar=vista.PedirNCuenta();
                    vista.imprmirinfoCliente(BusquedaEpecifica(BuscarEs(borrar)));
                    break;
            case 6: opcion = 6; 
                    break;
        }
        }
        else{
            
        }

    }

}















   
}
