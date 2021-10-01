/*import java.util.ArrayList;
import java.util.Scanner;*/

public class BancoMexicano {
    public static void main(String[] args){
       
        VistaAdmin vista = new VistaAdmin();
        ControladorBanco acciones = new ControladorBanco(vista);
        /*Estudiantes.addestudiante();
        Estudiantes.imprimirListaEstudiantes();*/
        acciones.MenuBanco();
    }
}