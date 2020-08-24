package model;

public class Ponto {
        // Atributos
        private Double x;
        private Double y;
        
        // Métodos construtores
        public Ponto(Double x, Double y) {
                this.x = x;
                this.y = y;
        }
        /* sobrecarga: metodos iguais tipos diferentes de parâmetros */
        public Ponto() {
                this.x = 0.0;
                this.y = 0.0;
        }
        
    // Métodos de acesso (is também é método de acesso)
    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }
    
    // Métodos modificadores
    public void setX(Double x) {
        this.x = x;
    }
    
    public void setY(Double y) {
        this.y = y;
    }
    
    public void setCoordenadas(Double x, Double y) {
        this.x = x;
        this.y = y;    
    }
    
    //Outros métodos
    public String getLocalizacao() {
        if((this.x == 0.0) && (this.y == 0.0)) {
            return ("Origem");
        }
        if((this.x == 0.0) && (this.y != 0.0)) {
            return ("Eixo Y");
        }
        if((this.x != 0.0) && (this.y == 0.0)) {
            return ("Eixo X");
        }
        if((this.x > 0.0) && (this.y > 0.0)) {
            return ("Quadrante 1");
        }
        if((this.x < 0.0) && (this.y > 0.0)) {
            return ("Quadrante 2");
        }
        if((this.x < 0.0) && (this.y < 0.0)) {
            return ("Quadrante 3");
        }
        if((this.x > 0.0) && (this.y < 0.0)) {
            return ("Quadrante 4");
        }
        return null;
    }
    
    public Double getDistancia(Ponto p) {
        Double x2 = p.getX();
        Double x1 = this.x;
        Double y2 = p.getY();
        Double y1 = this.y;
        return Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2-y1, 2.0));
    }
    
}
