
package classedados;
import java.lang.Math;

public class Cone {
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
    
    public float calcularGeratriz(){
        return (float)(Math.sqrt(Math.pow(raio, 2)+ Math.pow(altura,2)));
    }
    
    public float calcularAreaLateral(){
        return (float)(Math.PI*raio* calcularGeratriz());
    }
    
    public float calcularAreaTotal(){
        return (float)(Math.PI * raio * (calcularGeratriz() + raio));
    }
    
    public float calcularVolume(){
        return (float)((1.0/3.0)*Math.pow(raio, 2)* altura);
    }
    
}
