
package classedados;

/**
 *
 * @author savio
 */
public class Paralelepipedo {
   private float comprimento = 0;
   private float altura = 0;
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
        if(comprimento <= 0) throw new Exception("O campo Comprimento não aceita valores menores ou igual a zero !");
        this.comprimento = comprimento;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) throws Exception {
        if(altura <= 0) throw new Exception("O campo Altura não aceita valores menores ou igual a zero !");
        this.altura = altura;
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
        if(largura <= 0) throw new Exception("O campo Largura não aceita valores menores ou igual a zero !");
        this.largura = largura;
    }
    
    public float calcularVolume(){
        return (altura * comprimento * largura);
    }
   
    public float calcularArea(){
        return ( 2 * ((altura * largura) + (altura * comprimento) + (largura * comprimento)));
    }
   
}
