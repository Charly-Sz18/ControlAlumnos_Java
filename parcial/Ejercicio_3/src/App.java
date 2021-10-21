public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Punto p1 = new Punto(1,5);
        Punto p2 = new Punto(3,4);
        Circulo c1 = new Circulo(6.5,p1);
        Circulo c2 = new Circulo(4,p2);
        Circulo c3 = new Circulo(4,p2);


        System.out.println("\nEvaluando: "+ c2.toString()+" = "+c3.toString() +" es:\n " + c2.equals(c3));
        System.out.println("\nEl perímetro del circulo con  "+ c1.toString() +" es:\n " + c1.perimetro());
        System.out.println("\nEl área del circulo con  "+ c1.toString() +" es:\n " +c1.area());
        System.out.println("\nEl perímetro del circulo con  "+ c3.toString() +" es:\n " +c3.perimetro());
        System.out.println("\nEl área del circulo con  "+ c3.toString() +" es:\n " +c3.area()+"\n");


    }
}
