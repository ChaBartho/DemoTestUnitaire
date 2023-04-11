package be.techni;

public class Calcul {
    public int somme(int a, int b){
        return a + b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par 0 impossible");
        }
        return a/b;
    }
}