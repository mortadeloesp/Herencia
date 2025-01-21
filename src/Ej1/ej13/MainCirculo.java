package Ej1.ej13;

public class MainCirculo {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro(5.0,5.0);

        cilindro.getVolume();
        System.out.println();
        System.out.println("Volumen del 'cilindro'");
        System.out.println(cilindro.getVolume());


        cilindro.getAltura();
        System.out.println();
        System.out.println("altura del 'cilindro'");
        System.out.println(cilindro.altura);


        Circulo circulo = new Circulo(10.0);

        circulo.getArea();
        System.out.println();
        System.out.println("Area del 'circulo'");
        System.out.println(circulo.getArea());


        circulo.getRadio();
        System.out.println();
        System.out.println("Radio del 'circulo'");
        System.out.println(circulo.getRadio());
    }
}
