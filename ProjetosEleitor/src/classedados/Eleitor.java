
package classedados;


public class Eleitor {
    private String nome = "";
    private int data_nasc = 0;

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
     * @return the data_nasc
     */
    public int getData_nasc() {
        return data_nasc;
    }

    /**
     * @param data_nasc the data_nasc to set
     */
    public void setData_nasc(int data_nasc) throws Exception {
        if(data_nasc < 0) throw new Exception("O campo data não pode aceita valores menores que zero");
        this.data_nasc = data_nasc;
    }
    
    public String calcTipoEleitor(){
		int idade = 2017 - data_nasc;
		if(idade < 16){
			return "Não eleitor!";
		}else if(idade >= 16 && idade < 18){
			return "Eleitor Facultativo!";
		}else if(idade >= 18 && idade <= 65){
			return "Eleitor Obrigatório!";
		}else{
			return "Eleitor Facultativo!";
		}
		
	}
    
    
}
