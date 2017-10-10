/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author Savio Nascimento
 */
public class Matriz {
    //Atributos

    private int quantidadeDeLinhas = 0;
    private int quantidadeDeColunas = 0;
    private int[][] mat = null;

    //Metodos
    public Matriz(int qLinhas, int qColunas) throws Exception {
        if (qLinhas <= 0 || qColunas <= 0) {
            throw new Exception("Linhas ou colunas não podem ser <= 0");
        }
        mat = new int[qLinhas][qColunas];
        quantidadeDeLinhas = qLinhas;
        quantidadeDeColunas = qColunas;
    }

    public int getQuantidadeDeLinhas() {
        return quantidadeDeLinhas;
    }

    public int getQuantidadeDeColunas() {
        return quantidadeDeColunas;
    }

    public void setElemento(int linha, int coluna, int elemento) throws Exception {
        if (linha < 0 || linha >= quantidadeDeLinhas) {
            throw new Exception("Linha esta fora do intervalo valido");
        }
        if (coluna < 0 || coluna >= quantidadeDeColunas) {
            throw new Exception("Coluna esta fora do intervalo valido");
        }
        mat[linha][coluna] = elemento;
    }

    public int getElemento(int linha, int coluna) throws Exception {
        if (linha < 0 || linha >= quantidadeDeLinhas) {
            throw new Exception("Linha esta fora do intervalo valido");
        }
        if (coluna < 0 || coluna >= quantidadeDeColunas) {
            throw new Exception("Coluna esta fora do intervalo valido");
        }
        return mat[linha][coluna];
    }

    public String getMatriz() {
        String saida = "";
        for (int linha = 0; linha < quantidadeDeLinhas; linha++) {
            for (int coluna = 0; coluna < quantidadeDeColunas; coluna++) {
                saida += mat[linha][coluna] + " ";
            }
            saida += "\n";
        }
        return saida;
    }

    public Matriz adicionar(Matriz obj) throws Exception {

        if (this.quantidadeDeLinhas != obj.quantidadeDeColunas || this.quantidadeDeColunas != obj.quantidadeDeColunas) {
            throw new Exception("Não ha adição de matrizes diferentes");
        }
        Matriz mResultado = new Matriz(this.quantidadeDeLinhas, this.quantidadeDeColunas);
        for (int linha = 0; linha < this.quantidadeDeLinhas; linha++) {
            for (int coluna = 0; coluna < this.quantidadeDeColunas; coluna++) {
                mResultado.mat[linha][coluna] = mat[linha][coluna] + obj.mat[linha][coluna];
            }

        }
        return mResultado;
    }

    public Matriz subtrair(Matriz obj) throws Exception {

        if (this.quantidadeDeLinhas != obj.quantidadeDeLinhas || this.quantidadeDeColunas != obj.quantidadeDeColunas) {
            throw new Exception("Não ha adição de matrizes diferentes");
        }
        Matriz mResultado = new Matriz(this.quantidadeDeColunas, this.quantidadeDeColunas);
        for (int linha = 0; linha < this.quantidadeDeLinhas; linha++) {
            for (int coluna = 0; coluna < this.quantidadeDeColunas; coluna++) {
                mResultado.mat[linha][coluna] = mat[linha][coluna] - obj.mat[linha][coluna];
            }
        }

        return mResultado;
    }

    public Matriz multiplicar(Matriz obj) throws Exception {
        if (this.quantidadeDeColunas != obj.quantidadeDeLinhas) throw new Exception("");
        Matriz mResultado = new Matriz(this.quantidadeDeColunas, obj.quantidadeDeLinhas);
        
        for (int linha1 = 0; 1 < this.quantidadeDeLinhas; linha1++){ 
            for (int coluna2 = 0; coluna2 < obj.quantidadeDeColunas; coluna2++) {
                mResultado.mat[linha1][coluna2] = 0;
                for(int linha2 = 0; linha2 < obj.quantidadeDeLinhas; linha2++){
                    mResultado.mat[linha1][coluna2] += obj.mat[linha2][coluna2]*this.mat[linha1][linha2];
                    
            
                }
            }
        }

        return mResultado;
    }
    
    public boolean eIdentidade(){
        if(this.quantidadeDeLinhas != this.quantidadeDeColunas) return false;
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeLinhas; coluna ++){
                if(linha == coluna && mat[linha][coluna] != 1) return false;
                if(linha != coluna && mat[linha][coluna] != 0) return false;
            }
        return true;
    }
    
    public boolean eTriangularSuperior(){
        if(this.quantidadeDeLinhas != this.quantidadeDeLinhas) return false;
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++){
                if(linha < coluna && mat[linha][coluna] == 0) return false;
                if(linha == coluna && mat[linha][coluna] == 0) return false;
            }
        return true;
                
    }
    
    public boolean eTriangularInferior(){
        if(this.quantidadeDeLinhas != this.quantidadeDeLinhas) return false;
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++){
                if(linha > coluna && mat[linha][coluna] == 0) return false;
                if(linha == coluna && mat[linha][coluna] == 0) return false;
            }
        return true;
                
    }
    
    public boolean eSimetrica(){
        if(this.quantidadeDeLinhas != this.quantidadeDeColunas) return false;
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++){
                if(mat[linha][coluna] != mat[coluna][linha] ) return false;
            }
        return true;
    }
    
    public Matriz calcTransposta() throws Exception{
        Matriz aux = new Matriz(this.quantidadeDeColunas, this.quantidadeDeLinhas);
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++){
                
                aux.mat[coluna][linha] = mat[linha][coluna];
            }
        return aux;
    }
    
    public boolean eIgual(Matriz obj){ 
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++){   
               if (obj.mat[linha][coluna] != this.mat[linha][coluna]) return false; 
            }
        return true;
    }
    
    public boolean eDiferente(Matriz obj){
        return !this.eIgual(obj);
    }
    
    public Matriz multiplicarK(int constante) throws Exception{
        constante = 0;
        Matriz aux = new Matriz(this.quantidadeDeLinhas, this.quantidadeDeColunas);
        for(int linha = 0; linha < this.quantidadeDeLinhas; linha ++)
            for(int coluna = 0; coluna < this.quantidadeDeColunas; coluna ++)
                aux.mat[linha][coluna] = constante * this.mat[linha][coluna];
        
        return aux;
    }
    
    public Matriz calcPotencia(int expoente) throws Exception{
            expoente = 0;
            Matriz aux = new Matriz(this.quantidadeDeColunas, this.quantidadeDeLinhas);
        
        for (int linha1 = 0; 1 < this.quantidadeDeLinhas; linha1++){ 
            for (int coluna2 = 0; coluna2 < this.quantidadeDeColunas; coluna2++) {
                aux.mat[linha1][coluna2] = 0;
                for(int linha2 = 0; linha2 < this.quantidadeDeLinhas; linha2++){
                    aux.mat[linha1][coluna2] += expoente * (this.mat[linha2][coluna2] * this.mat[linha1][linha2]);
                    
            
                }
            }
        }

        return aux;
    }

}
