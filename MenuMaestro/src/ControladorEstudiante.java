
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
 
   public void imprimirListaEstudiantes(){

       for (int i = 0; i < listcontrol.size(); i++) {
           System.out.println(listcontrol.get(i));         
       }
   }
 
   public EstudianteControlador BuscarEs (Integer matricula){
       for (int i = 0; i < listcontrol.size() ; i++) {
           if (matricula == listcontrol.get(i).getMatricula()){
               return listcontrol.get(i);
           }
       }

       return null;
   }

   public EstudianteControlador eliminando(Integer borrard){
          
        for (int i = 0; i < listcontrol.size() ; i++) {
            if (borrard == listcontrol.get(i).getMatricula()){
                listcontrol.remove(i);
                return listcontrol.get(i);
            }
        }
        return null;
   }


   public void MenuEstudiante(){
       Integer opcion = 0;

       while (opcion != 6){
           switch (vista.Menu()) {
               case 1: addestudiante(); break;
               case 2: vista.imprimirdatostotal(listcontrol); break;//imprimirListaEstudiantes(); break; 
               case 3: Integer Mat;  Mat = vista.PedirMatricula();
                vista.imprmirinfo(BuscarEs(Mat));
               break;
               case 4: break;
               case 5:Integer borrar; borrar=vista.PedirMatricula();
                 vista.imprimireliminado(eliminando(borrar));
               break;
               case 6: opcion = 6; break;
           }
       }

   }
   
}
