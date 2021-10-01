
import java.util.ArrayList;

public class ControladorEstudiante {
    
   private  ArrayList <EstudianteControlador> listcontrol;
   VistaEstudiante vista;

   ControladorEstudiante(){} //construtor

  ControladorEstudiante(VistaEstudiante vista){
       listcontrol = new ArrayList <EstudianteControlador>();
       this.vista =  vista;
   }
   
   public void  addestudiante(){
       listcontrol.add(0, new EstudianteControlador());
       listcontrol.get(0).pedirDatos();
   }
   
   public Integer BuscarEs (Integer matricula){
        
       int lugar = -1;
    for (int i = 0; i < listcontrol.size(); i++) {
        if ( listcontrol.get(i).getMatricula() == matricula){
           
           return i;
        }
        
    }    
    return lugar;
   }

   public EstudianteControlador BusquedaEpecifica(Integer estudiante){
    
    if (estudiante != -1){
        return listcontrol.get(estudiante);
    }

    return null ;        
   }
   
   public EstudianteControlador Eliminar(Integer estEliminar){
    
    if (estEliminar != -1){
        EstudianteControlador aux= listcontrol.get(estEliminar);
        for (int i = 0; i < listcontrol.size(); i++) {
           if (i == estEliminar){
            Integer RES = vista.decicion(listcontrol.get(i));
            if ( RES != 0){
                listcontrol.remove(i);
                RES = 0;
            }else
            {
                return null;
            }            
           }
        }
        if (listcontrol.size()==0){
            vista.imprimirListaEstudiantes(listcontrol);
            return aux;
        }
            return aux;
    }
    
    return null ;        
   }

   public Integer MenuModicando(Integer EsModificar){

    if (EsModificar != -1){

        Integer OP=0;
        while (OP != 5 ){
            
            switch(vista.MenuModificar(listcontrol, EsModificar)){
                case 1: listcontrol.get(EsModificar).setNombre(vista.nombre());  vista.msg(); break;
                case 2: listcontrol.get(EsModificar).setEdad(vista.edad()); break;
                case 3: listcontrol.get(EsModificar).setCalificacion(vista.calificacion());break; 
                case 4: listcontrol.get(EsModificar).setNombre(vista.nombre());
                        listcontrol.get(EsModificar).setEdad(vista.edad());
                        listcontrol.get(EsModificar).setCalificacion(vista.calificacion()); break;
                case 5:  OP=5;break;
            }
            
            
        }

        
        MenuEstudiante();
        
    }

    return null;
   }




   //selecciona el metodo necesario para devolver la info. solicitada

   public void MenuEstudiante(){
       Integer opcion = 0;

       while (opcion != 6){
            Integer R = vista.Menu();
           if ( R >0 && R<=6){
           switch (R) {
               case 1: addestudiante(); break;
               case 2: vista.imprimirListaEstudiantes(listcontrol); break;
               case 3: Integer Mat;  Mat = vista.PedirMatricula();
                //int lugar = BuscarEs(Mat); 
                vista.imprmirinfoEsp(BusquedaEpecifica(BuscarEs(Mat)));
               break;
               case 4: Integer Edit;  Edit = vista.PedirMatricula();
                MenuModicando(BuscarEs(Edit));
               
               break;
               case 5: Integer borrar; borrar=vista.PedirMatricula();
                // Integer lugarbor = BuscarEs(borrar);
                   vista.InfodelEliminado(Eliminar(BuscarEs(borrar)));
               break;
               case 6: opcion = 6; break;
           }
           }
           else{
               vista.errorOp();
           }




       }

   }
   
}
