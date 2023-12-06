public class Figuras {
    String tipo;
    public Figuras(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void mostrarDatos(){
        System.out.println("Tipo de figura: "+getTipo());
    }
}
