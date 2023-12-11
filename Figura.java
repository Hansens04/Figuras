package FigurasAbsctracto;

public abstract class Figura {
    public double calcularArea() {
        return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }
    public void mostrarCalcular(){
        System.out.println("Area:"+calcularArea());
        System.out.println("Perimetro:"+calcularPerimetro());
    }
    public abstract String getTipo();

    public abstract void leerDatos();
    public abstract void imprimirDatos();


}
