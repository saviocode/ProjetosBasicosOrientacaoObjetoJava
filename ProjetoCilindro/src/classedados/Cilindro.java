
package classedados;

/**
 *
 * @author savio
 */
public class Cilindro {
    private float raio = 0;
    private float altura = 0;

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio) throws Exception {
        if(raio <= 0) throw new Exception("O campo Raio não aceita valores menores ou igual a zero ");
        this.raio = raio;
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
        if(altura <= 0) throw new Exception("O campo Altura não aceita valores menores ou igual a zero ");
        this.altura = altura;
    }
    
    public float calcularAreaLateral(){
        return (float)((2.0*3.1415)*raio*altura);
    }
    
    public float calcularAreaTotal(){
        return (float)((2*3.1415)*raio*(altura+raio));
    }
    
    public float calcularVolume(){
        return (float)(3.1415*raio*raio*altura);
    }
}
