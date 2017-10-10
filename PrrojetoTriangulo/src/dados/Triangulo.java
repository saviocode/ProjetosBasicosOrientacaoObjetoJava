
package dados;

public class Triangulo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    /**
     * @return the ladoA
     */
    public float getLadoA() {
        return ladoA;
    }

    /**
     * @return the ladoB
     */
    public float getLadoB() {
        return ladoB;
    }

    /**
     * @return the ladoC
     */
    public float getLadoC() {
        return ladoC;
    }
    
    public void setLado(float ladoA, float ladoB, float ladoC) throws Exception {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
        if(ladoA <0 || ladoB <0 || ladoC <0) throw new Exception("Um triangulo não pode ter lados negativos");
        else if(ladoA ==0 || ladoB ==0 || ladoC ==0) throw new Exception("Um triangulo não pode ter lados igual a zero");
        else if(ladoA > (ladoB+ladoC)) throw new Exception("O lado A não pode ser maior que a soma dos outros  dois lados");    
        else if(ladoB > (ladoA+ladoC)) throw new Exception("O lado B não pode ser maior que a soma dos outros  dois lados");
        else if(ladoC > (ladoB+ladoA)) throw new Exception("O lado C não pode ser maior que a soma dos outros  dois lados");
    }
    public float calcArea(){
       float area = (ladoA+ladoB+ladoC)/2;
       return (float) Math.sqrt(area*(area-ladoA)*(area-ladoB)*(area-ladoC));
    }
    public String calcTipoTriangulo() {
        if(ladoA == ladoB && ladoC == ladoB) return("É um triangulo Equilatero");
        else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) return("É um triangulo Isosceles");
        else return("É um triangulo Escaleno");
        
    }
    public String calcAngulo() {
        if (Math.pow(ladoA,2)< Math.pow(ladoB,2) + Math.pow(ladoC, 2))return("Acutângulo");
        else if (Math.pow(ladoA,2) > Math.pow(ladoB,2)+ Math.pow(ladoC, 2)) return("Obtusângulo");
        else return ("Retângulo");
        
    }
            
}
