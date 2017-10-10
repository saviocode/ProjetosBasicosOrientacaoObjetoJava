
package classedados;

/**
 *
 * @author savio
 */
public class Retangulo {
    
    private float comprimento = 0;
    private float largura = 0;

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) throws Exception {
        if(comprimento <= 0) throw new Exception ("O campo comprimento não aceita valores menor ou igual a zero !");
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) throws Exception {
        if(largura <= 0 ) throw new Exception("O campo largura não aceita valores menores ou igual a zero !");
        this.largura = largura;
    }
    
    public float calcularPerimetro(){
        return (comprimento * comprimento) + (largura * largura);
    }
    
   public float calcularArea(){
       return (largura * comprimento);
   } 
}
