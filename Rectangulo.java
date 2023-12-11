package FigurasAbsctracto;

import java.util.Scanner;

public class Rectangulo extends Punto2D {
        private double mAncho;
        private double mLargo;


        public double getmAncho() {
            return mAncho;
        }

        public void setmAncho(double mAncho) {
            this.mAncho = mAncho;
        }

        public double getmLargo() {
            return mLargo;
        }

        public void setmLargo(double mLargo) {
            this.mLargo = mLargo;
        }
        public double calcularPerimetro(){
            return 2*mAncho+2*mLargo;
        }
        public double calcularArea(){
            return mAncho*mLargo;
        }
    @Override
    public String getTipo(){
        return "Rectangulo";
    }
    @Override
    public void leerDatos(){
            super.leerDatos();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el largo:");
        mLargo= sc.nextInt();
        System.out.println("Ingrese el ancho:");
        mAncho= sc.nextInt();
    }
    @Override
    public void imprimirDatos(){
            super.imprimirDatos();
        System.out.println("Centro figura ("+mLargo+","+mAncho+")");
    }



}
