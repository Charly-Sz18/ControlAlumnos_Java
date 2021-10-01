/*import java.util.ArrayList;
import java.util.Scanner;*/

public class PrincipalControlador {
    public static void main(String[] args){
       
        VistaEstudiante vista = new VistaEstudiante();
        ControladorEstudiante Estudiantes = new ControladorEstudiante(vista);
        /*Estudiantes.addestudiante();
        Estudiantes.imprimirListaEstudiantes();*/
        Estudiantes.MenuEstudiante();
    }
}