
package classedados;
import java.lang.Math;


public class Paciente {
    private String nome = "";
    private float altura = 0;
    private float peso = 0;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
        if(altura <= 0) throw new Exception("O campo Altura não aceita valores menores ou igual a zero");
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) throws Exception {
        if(peso <= 0) throw new Exception("O campo Peso não aceita valores menores ou igual a zero");
        this.peso = peso;
    }
    
    public float calcIMC(){
		return (float) (peso / Math.pow(altura, 2));
	}
    
    public String faixaDePeso(){
		float imc = calcIMC();
		if(imc < 20){
			return  "Voce esta abaixo do peso ideal!";
		}else if(imc >= 20 || imc <= 25){
			return "Você está no peso ideal!";
		}else if(imc > 25 || imc <= 30){
			return "Você está acima do peso!";
		}else if(imc > 30 || imc <= 35){
			return "Você está obeso!";
		}else{
			return "Atenção! você está com obesidade mórbida!";
		}	
	}
}