public class Circulo {

    private double radio;
    private Punto centro;

public Circulo(double radio, Punto centro){
    this.radio =radio;
    this.centro = centro;
}

public void setRadio(Double radio) {
    this.radio = radio;
}

public void setCentro(Punto centro) {
    this.centro = centro;
}

public double getRadio() {
    return radio;
}

public Punto getCentro() {
    return centro;
}

public boolean equals(Circulo c){
    return centro == c.centro && radio == c.radio;
}

public double perimetro(){

    return Math.round((2 * Math.PI * radio)*100)/100d;

}

public double area(){
    return Math.round((Math.PI * radio * radio)*100)/100d;
}

@Override
public String toString() {
    return "Radio: "+ radio + " y "+" Centro: " + "("+centro.getX()+"," + centro.getY()+")";
}


}
