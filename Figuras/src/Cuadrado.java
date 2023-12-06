public class Cuadrado extends Regulares{
    public Cuadrado(String tipo, String clasificación_figuras2d, double lado1, double lado2) {
        super(tipo, clasificación_figuras2d, lado1, lado2);
    }
    public void resultado(){
        System.out.println("El área es:"+getLado1()*getLado1());
        System.out.println("El perímetro es:"+getLado1()*4);
    }
}
