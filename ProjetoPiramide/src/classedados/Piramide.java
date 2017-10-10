
package classedados;


public class Piramide {
    private float altura = 0;
    private float base = 0;

    /**
     * @return the Altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the Altura to set
     * @throws java.lang.Exception
     */
    public void setAltura(float altura) throws Exception {
        if (altura <= 0) throw new Exception("Altura não poder ser igual ou menor a zero !");
        this.altura = altura;
    }

    /**
     * @return the Base
     */
    public float getBase() {
        return base;
    }

    /**
     * @param base the Base to set
     * @throws java.lang.Exception
     */
    public void setBase(float base) throws Exception {
        if (base <= 0)throw new Exception("A Base não pode ser menor ou igual a zero !");
        this.base = base;
    }
    
    public float calcularVolume(){
        return (float)((1.0/3.0) * base * altura);
    }
    
}
