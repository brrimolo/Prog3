package model;

public class Reta {
        // Atributos
        private Ponto p1;
        private Ponto p2;
        
        // Métodos construtores
        public Reta(Ponto p1, Ponto p2) {
                this.p1 = p1;
                this.p2 = p2;
        }
        /* sobrecarga: metodos iguais tipos diferentes de parâmetros */
        public Reta(Double x1, Double y1, Double x2, Double y2) {
                this.p1 = new Ponto(x1,y1);
                this.p2 = new Ponto(x2,y2);
        }
    // Métodos de acesso

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
    
    // Métodos modificadores
    public void setP1(Ponto p1) {
        this.p1 = p1;
    }
    public void setP2(Ponto p2) {
        this.p2 = p2;
    }
    
    public Double getTamanho() {
        return this.p1.getDistancia(this.p2);
    }
        
}
