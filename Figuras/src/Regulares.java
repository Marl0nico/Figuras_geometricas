public class Regulares extends Dimensiones_2{
    public Regulares(String tipo, String clasificación_figuras2d, double lado1, double lado2) {
        super(tipo, clasificación_figuras2d, lado1, lado2);
    }
    String figura;
    public Regulares(String figura) {
        super(figura);
        this.figura = figura;
    }
    public String getFigura() {
        return figura;
    }
    public void setFigura(String figura) {
        this.figura = figura;
    }
    public void figuraRegular(){
        System.out.println("Figura: "+getFigura());
    }

}
