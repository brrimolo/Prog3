package teste;

import model.Ponto;
import model.Reta;

/**
 *
 * @author brrimolo
 */
public class PontoTest {
    
        public static void main(String args[]) {
            
                    Ponto p1 = new Ponto(2.0,10.0);
                    System.out.println(p1.getLocalizacao());
                    Ponto p2 = new Ponto(3.0,-10.0);
                    System.out.println(p2.getLocalizacao());
                    System.out.println(p1.getDistancia(p2));
                    
        }
}
