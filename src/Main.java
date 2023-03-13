public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10, 30, 20);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 0;

    public void SumarPuerta() {
        this.puertas += 1;
    }
}