package be.techni;

public class Triangle {


    public String validerTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return "équilatéral";
        } else if (a == b || a == c || b == c) {
            return "isocèle";
        } else {
            return "quelconque";
        }
    }

}
