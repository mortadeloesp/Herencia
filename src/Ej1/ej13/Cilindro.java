package Ej1.ej13;

public class Cilindro extends Circulo{
double altura;

    public Cilindro(double radio, double altura) {
        super(radio);

        if (altura <= 0) {
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    public double getAltura () {
        return this.altura;
    }

    public double getVolume () {
        return getArea() * this.altura;
    }
}
