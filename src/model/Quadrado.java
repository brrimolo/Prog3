package model;

public class Quadrado {
        // Atributos
        private Reta lado;
        
        // Métodos construtores
        public Quadrado(Reta lado) {
                this.lado = lado;
        }
        /* sobrecarga: metodos iguais tipos diferentes de parâmetros */
        public Quadrado(Ponto p1, Ponto p2, Ponto p3) {
            
                if(!(p2.getX().equals(p1.getX()))) {
                    throw new IllegalArgumentException("Os valores X de p1 e p2 tem que ser iguais !");
                }
                if(!(p2.getY().equals(p3.getY()))) {
                    throw new IllegalArgumentException("Os valores Y de p2 e p3 tem que ser iguais !");
                }
                if(p2.getX()>=p3.getX()) {
                    throw new IllegalArgumentException("O ponto 3 tem que ter X  maior que o ponto 2 !");
                }
                if(p2.getY()>=p1.getY()) {
                    throw new IllegalArgumentException("O ponto 1 tem que ter Y maior que o ponto 2 !");
                }
                if(!(p1.getDistancia(p2).equals(p3.getDistancia(p2)))) {
                    throw new IllegalArgumentException("Altura e Base precisam ser iguais !");
                }
                
                this.lado = new Reta(p1, p2);
        }
        
    // Métodos de acesso
    public Reta getLado() {
        return lado;
    }

    // Métodos modificadores
    public void setLado(Reta lado) {
        this.lado = lado;
    }

    public Double getArea() {
        return (Math.pow(this.lado.getTamanho(), 2));
    }
    
    public Double getPerimetro() {
        return (4 * (this.lado.getTamanho()));
    }
    
}
