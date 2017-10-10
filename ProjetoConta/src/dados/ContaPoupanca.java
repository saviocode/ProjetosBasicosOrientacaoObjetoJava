
package dados;


public class ContaPoupanca {
    private String nome = "";
    private int conta = 0;
    private int  agencia = 0;
    private double saldo = 0;

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
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) throws Exception {
        this.conta = conta;
        if(conta < 0) throw new Exception("A conta não deve ser negativa");
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) throws Exception {
        this.agencia = agencia;
        if(agencia < 0 ) throw new Exception("A agencia não deve ser negativa");
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
    
    public float sacarDinheiro (float sacar) throws Exception{
        if (sacar < 0) throw new Exception(" o valor do saque não deve ser negativo");
        
        else if (sacar <= this.saldo) saldo = saldo - sacar;
        
        else throw new Exception("saldo insuficiente");
        
        return (float) saldo;
    }
    
    public float depositarDinheiro(float depositar) throws Exception{
        if(depositar<0) throw new Exception("Não pode sacar um valor negativo");
        
        else saldo = saldo + depositar;
        
        return (float) saldo;
    }
    
}
