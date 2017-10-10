
package dados;

/**
 *
 * @author savio
 */
public class Calculadora {
    private float num1 = 0;
    private float num2 = 0;

 
    /**
     * @return the num1
     */
    public float getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public float getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float adicao(){
        float resultado = (num1 + num2);
        return resultado;
    }
    public float subtracao(){
        float resultado = (num1 - num2);
        return resultado;
    }
    
    public float multiplica(){
        float resultado = (num1 * num2);
        return resultado;
    }
    
    public float divisao(){
        float resultado = (num1 / num2);
        return resultado;
    }
    
    public float raiz(){
        float resultado = (float) Math.pow(num1, 1/num2);
        return resultado;
    }
    
    public float pontencia(){
        float resultado = (float) Math.pow(num1, num2);
        return resultado;
    }
}
