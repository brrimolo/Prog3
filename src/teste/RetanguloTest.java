package teste;

import model.Reta;
import model.Retangulo;

/**
 *
 * @author brrimolo
 */
public class RetanguloTest {
    
        public static void main(String args[]) {
                
                Reta reta1 = new Reta(0.0,0.0,5.0,0.0);
                Reta reta2 = new Reta(0.0,0.0,0.0,8.0);
                Retangulo r1 = new Retangulo(0.0,0.0,5.0,0.0,0.0,0.0,0.0,8.0);
                Retangulo r2 = new Retangulo(reta1, reta2);
                System.out.println("Perimetro R1...: " + r1.getPerimetro());
                System.out.println("Area R1........: " + r1.getArea());
                System.out.println("Perimetro R2...: " + r2.getPerimetro());
                System.out.println("Area R2........: " + r2.getArea());

        }
        
}

