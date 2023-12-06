public class Dimensiones_2 extends Figuras{
    public Dimensiones_2(String tipo) {
        super(tipo);
    }
    String Clasificación_figuras2d;
    double lado1, lado2;
    public Dimensiones_2(String tipo, String clasificación_figuras2d, double lado1, double lado2) {
        super(clasificación_figuras2d);
        this.Clasificación_figuras2d = clasificación_figuras2d;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public String getClasificación_figuras2d() {
        return Clasificación_figuras2d;
    }
    public void setClasificación_figuras2d(String clasificación_figuras2d) {
        Clasificación_figuras2d = clasificación_figuras2d;
    }
    public double getLado1() {
        return lado1;
    }
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    public void clasificación(){
        System.out.println("Figura geométrica "+getClasificación_figuras2d());
    }
}
