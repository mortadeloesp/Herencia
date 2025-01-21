package Ej1.ej13;

public class Circulo {
    // Campo de instancia para el radio
    private double radio;

    // Constructor que recibe el radio
    public Circulo(double radio) {
        // Si el radio es menor que 0, se establece el valor a 0
        if (radio <= 0) {
            this.radio = 0;
        } else {
            this.radio = radio;
        }
    }

    // Método para obtener el valor del radio
    public double getRadio() {
        return this.radio;
    }

    // Método para obtener el área del círculo
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }
}
