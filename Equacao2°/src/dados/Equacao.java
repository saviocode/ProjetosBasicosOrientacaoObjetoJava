
package dados;

public class Equacao {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) throws Exception {
        if(a == 0) throw new Exception("O valor de 'A' não pode ser 0!");
        
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }
    
    public int[] calcDelta()throws Exception {
        int[] x = new int[2];
        int delta = ((b*b)-(4*a*c));
        
        if(delta<0) throw new Exception("Não existe raiz de delta negativo");
        
        else if(delta >=0 ) 
            x[0] = (int) (( -b + (Math.sqrt (delta))) / ( 2*a ));        
            x[1] = (int)((-b - (Math.sqrt (delta))) / ( 2*a ));     
        return x;
            
    }
}
