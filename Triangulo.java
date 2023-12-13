package FigurasAbsctracto;

import java.util.Scanner;

public  class Triangulo extends Punto2D{
    private double mA;
    private double mB;
    private double mC;


    public double getmA() {
        return mA;
    }

    public void setmA(double mA) {
        this.mA = mA;
    }

    public double getmB() {
        return mB;
    }

    public void setmB(double mB) {
        this.mB = mB;
    }

    public double getmC() {
        return mC;
    }

    public void setmC(double mC) {
        this.mC = mC;
    }
    public double calcularPerimetro(){
        return mA+mB+mC;
    }
    public double semiperimetro(){
        return calcularPerimetro()/2;
    }

    public double calcularArea(){
        return Math.sqrt(semiperimetro()*(semiperimetro()-mA)*(semiperimetro()-mB)*(semiperimetro()-mC));
    }
    @Override
    public String getTipo(){
        return "Triangulo";
    }
    @Override
    public void leerDatos(){
        super.leerDatos();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la coordenada x:");
        mA= sc.nextInt();
        System.out.println("Ingrese la coordenada y:");
        mB= sc.nextInt();
        System.out.println("Ingrese la coordenada z:");
        mC= sc.nextInt();
    }

    @Override
    public boolean imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Centro figura ("+mA+","+mB+","+mC+")");
        return false;
    }
}
