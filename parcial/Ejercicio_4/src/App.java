public class App {
    public static void main(String[] args) throws Exception {
       //System.out.println("Hello, World!");

       Dominio d1= new Dominio("www.google.com");
       Dominio d2= new Dominio("www.yahoo.com");
       Dominio d3= new Dominio("Educalibros.edu");
       Dominio d4= new Dominio("www.google.com");
       Dominio d5= new Dominio("www.uadyEstudios");
       Dominio d6= new Dominio("EstoNotienepintadeDominio");

        System.out.println("Evaluando Dominios:"+ d4.toString()+" = "+d1.toString()+"\n"+ d4.equals(d1));
        System.out.println("\n\n"+ d1.toString()+"\nInicio del Dominio: "+d1.indicarinicioDominio()+"\nNombre Dominio: "+d1.DarNombreIntermedio()+"\nExtensión "+d1.DARExtensionDominio());
        System.out.println("\n\n"+ d2.toString()+"\nInicio del Dominio: "+d2.indicarinicioDominio()+"\nNombre Dominio: "+d2.DarNombreIntermedio()+"\nExtensión "+d2.DARExtensionDominio());
        System.out.println("\n\n"+ d3.toString()+"\nInicio del Dominio: "+d3.indicarinicioDominio()+"\nNombre Dominio: "+d3.DarNombreIntermedio()+"\nExtensión "+d3.DARExtensionDominio());
        System.out.println("\n\n"+ d5.toString()+"\nInicio del Dominio: "+d5.indicarinicioDominio()+"\nNombre Dominio: "+d5.DarNombreIntermedio()+"\nExtensión "+d5.DARExtensionDominio());
        System.out.println("\n\n"+ d6.toString()+"\nInicio del Dominio: "+d6.indicarinicioDominio()+"\nNombre Dominio: "+d6.DarNombreIntermedio()+"\nExtensión "+d6.DARExtensionDominio()+"\n");
    }
}
