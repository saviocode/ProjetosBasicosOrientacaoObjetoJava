package classedados;

public class Funcionario {

    private String nome = "";
    private double salarioMes = 0;
    private int qtdFilhos = 0;
   

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
     * @return the salarioMes
     */
    public double getSalarioMes() {
        return salarioMes;
    }

    /**
     * @param salarioMes the salarioMes to set
     */
    public void setSalarioMes(double salarioMes) throws Exception {
        if(salarioMes <= 0) throw new Exception("O campo Salario do mês não aceita valor menor ou igual a zero");
        this.salarioMes = salarioMes;
    }

    /**
     * @return the qtdFilhos
     */
    public int getQtdFilhos() {
        return qtdFilhos;
    }

    /**
     * @param qtdFilhos the qtdFilhos to set
     */
    public void setQtdFilhos(int qtdFilhos) throws Exception {
        if(qtdFilhos < 0) throw new Exception("O campo Quantidades de filhos não aceita valor menor que zero");
        this.qtdFilhos = qtdFilhos;
    }

   

    public float calcAumSalario(float reajuste) {
        
        float aumento = (float)(((salarioMes*reajuste)/100)+salarioMes);
        return aumento;
    }

    public double calcINSS() {
        double inss = 0;
        if (salarioMes <= 2545) {
            return inss = (salarioMes * 6) / 100;
        }
        return inss;
    }

    public double calcIR() {
        double ir = 0;
        if (salarioMes >= 1903.99 || salarioMes <= 2826.65) {
            return ir = (salarioMes * 7.5) / 100;
        } else if (salarioMes >= 286.66 || salarioMes <= 3751.05) {
            return ir = (salarioMes * 15) / 100;
        } else if (salarioMes >= 3751.06 || salarioMes <= 4664.68) {
            return ir = (salarioMes * 22.5) / 100;
        } else if (salarioMes > 4664.68) {
            return ir = (salarioMes * 27.5) / 100;
        } else {
            return ir;
        }

    }
}
