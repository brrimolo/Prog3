package model;

public class Retangulo {
        // Atributos
        private Reta base;
        private Reta altura;
        
        // Métodos construtores
        public Retangulo(Reta base, Reta altura) {
                this.base = base;
                this.altura = altura;
        }
        /* sobrecarga: metodos iguais tipos diferentes de parâmetros */
        public Retangulo(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3, Double x4, Double y4) {
                this.base = new Reta(x1,y1,x2,y2);
                this.altura = new Reta(x3,y3,x4,y4);
        }
    // Métodos de acesso
    public Reta getBase() {
        return base;
    }

    public Reta getAltura() {
        return altura;
    }
    
    // Métodos modificadores
    public void setBase(Reta base) {
        this.base = base;
    }

    public void setAltura(Reta altura) {
        this.altura = altura;
    }
        
    public Double getArea() {
        return (this.base.getTamanho() * this.altura.getTamanho());
    }
    
    public Double getPerimetro() {
        return (2 * (this.base.getTamanho() + this.altura.getTamanho()));
    }
    
    // TODO: VERIFICANDO SE É RETÂNGULO
    public boolean isRetangulo() {
        if ((this.base.getP1().getDistancia(this.altura.getP1()) == 0) || (this.base.getP2().getDistancia(this.altura.getP1()) == 0) ||
                (this.base.getP1().getDistancia(this.altura.getP2()) == 0) || (this.base.getP2().getDistancia(this.altura.getP2()) == 0)) {

        };
        return false;
    }
    
}
