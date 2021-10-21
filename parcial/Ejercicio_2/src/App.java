public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pronostico_tiempo clima1= new Pronostico_tiempo(40.,"soleado");
        Pronostico_tiempo clima2= new Pronostico_tiempo(10.,"nevando");
        Pronostico_tiempo clima3= new Pronostico_tiempo(40.,"nublado");
        Pronostico_tiempo clima4= new Pronostico_tiempo(31.,"lluvioso");
        Pronostico_tiempo clima5= new Pronostico_tiempo(10.,"nevando");

        System.out.println("\nComparando climas: "+ clima1.toString() + " = "+ clima2.toString());
        System.out.println(clima1.equals(clima2)+"\n");
        System.out.println("Comparando climas: "+ clima2.toString() + " = "+ clima5.toString());
        System.out.println(clima2.equals(clima5)+"\n");
        System.out.println("Convertir Temperatura de Fahrenheit a Celsius: "+ clima3.toString());
        Pronostico_tiempo  clima6 = clima3.convertiraTCelsius();
        System.out.println("Temperatura: "+ clima6.getTemperatura()+"°C "+" Clima: " +clima6.getCondicion()+"\n");
        System.out.println("Verificar consistencia: "+ clima4.toString());
        clima4.verificar_clima();
        System.out.println("Cambiar a Temperatura predeterminada 70°F : "+ clima2.toString());
        System.out.println(clima2.temperaturaPredeterminada()+"\n");





    }
}
