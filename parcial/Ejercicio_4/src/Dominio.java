public class Dominio {
    private String nombre;

    public Dominio(String nombre){
        this.nombre= nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean equals(Dominio dom){
        return nombre == dom.getNombre();
    }
 
    public  String indicarinicioDominio(){
        //por cada punto  se divide el nombre de dominio.
        String [] parte = nombre.split("\\.");
       //el dominio se divide en 3 = 0,1,2  evaluo la prinmeraparte[0]
        if (parte[0].equals("www")){
            return parte[0];
        }
        else{
            return "NO contiene www.xxx";
        }
    }

    public String DARExtensionDominio(){

        int totalCharacters = 0;
        int lejos = 0;
        char temp;
        for (int i = 0; i < nombre.length(); i++) {
            
            temp = nombre.charAt(i);
            if (temp == '.'){
                totalCharacters++;
                lejos = i;
            }
               
        }
        //Indica cantidad de puntos
        if (totalCharacters <2){

            if (lejos > 4){
                //Divido el nombre de dominio, debido a que solo hubo un punto eso quiere decir que se divide en 2 = 0,1
                String [] parte = nombre.split("\\.");
                  return parte[1];
            }
            else{
                return "Desconocido";
            }
        }
        else{
            String [] parte = nombre.split("\\.");
            return parte[2];


        }

       
    }

    public String DarNombreIntermedio(){

        int totalCharacters = 0;
        int lejos = 0;
        char temp;
        for (int i = 0; i < nombre.length(); i++) {
            
            temp = nombre.charAt(i);
            if (temp == '.'){
                totalCharacters++;
                lejos = i;
            }
               
        }
        if (totalCharacters == 0){
            return "Desconocido";

        }
        else{
        
            if (totalCharacters <2){

                if (lejos >3){
                    
                    String [] parte = nombre.split("\\.");
                    return parte[0];
                }
                else{
                    String [] parte = nombre.split("\\.");
                    return parte[1];
                }
            }
            else{

                String [] parte = nombre.split("\\.");
                return parte[1];


            }
            
        }
              

    }

    @Override
    public String toString() {
        return "Nombre del Dominio: "+ nombre;
    }
    
}
