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
                Reta reta2 = new Reta(x3,y3,x4,y4);
                Double tamanhoReta2 = reta2.getTamanho();
                Double tamanhoReta1 = this.base.getTamanho();
                
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
    
    // TODO
    //    Diagrama de Sequencia do teste de reta
    //    Implementar a classe retângulo (conforme diagrama no staruml)
    //    Testar a classe retângulo
    //    Diagrama de sequencia da classe retangulo
        
    public Double getArea() {
        return (this.base.getTamanho() * this.altura.getTamanho());
    }
    
    public Double getPerimetro() {
        return (2 * this.base.getTamanho()) + (2 * this.altura.getTamanho());
    }

}
