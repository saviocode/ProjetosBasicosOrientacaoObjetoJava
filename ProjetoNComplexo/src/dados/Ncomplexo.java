
package dados;

/**
 *
 * @author savio
 */
public class Ncomplexo {
   private int parteReal = 0;
   private int parteImaginario = 0;
   
   public Ncomplexo(){}
   public Ncomplexo(int pr, int pi){
       parteReal = pr;
       parteImaginario = pi;
   }
   public Ncomplexo(Ncomplexo objeto){
       parteReal = objeto.parteReal;
       parteImaginario = objeto.parteImaginario;
   }
   public String get(){
       return parteReal + " + " + parteImaginario + "i";
   }
   public void set(int pr, int pi){
       parteReal = pr;
       parteImaginario = pi;
   }
   public Ncomplexo adicionar(Ncomplexo objeto){
      int real = this.parteReal + objeto.parteReal;
      int imaginario = this.parteImaginario + objeto.parteImaginario;
      Ncomplexo aux = new Ncomplexo(real, imaginario);
      return aux;
   }
   public Ncomplexo subtrair(Ncomplexo objeto){
       int real = this.parteReal - objeto.parteReal;
       int imaginario = this.parteImaginario - objeto.parteImaginario;
       
       Ncomplexo aux = new Ncomplexo(real, imaginario);
       return aux;
   }
   public Ncomplexo multiplicar(Ncomplexo objeto){
      int real = (this.parteReal * objeto.parteReal) -(this.parteImaginario * objeto.parteImaginario);
      int imaginario = (this.parteReal * objeto.parteImaginario) + (this.parteImaginario * objeto.parteReal );
      //(a+bi)∗(c+di) = (ac−bd)+(ad+bc)i
      Ncomplexo aux = new Ncomplexo(real, imaginario);
      return aux;
       
   }
   public Ncomplexo divisao(Ncomplexo objeto){
//(a+bi)/(c+di) = (ac+bd)/(c 2 +d 2 ) + ((bc-ad)/(c 2 +d 2 ))i
       
       int real = (this.parteReal* objeto.parteReal + this.parteImaginario * objeto.parteImaginario) / ((objeto.parteReal*objeto.parteReal) + (objeto.parteImaginario * objeto.parteImaginario));
       int imaginario = ((this.parteImaginario * objeto.parteReal)-(this.parteReal * objeto.parteImaginario)) / ((objeto.parteReal * objeto.parteReal) + (objeto.parteImaginario * objeto.parteImaginario));
       
       Ncomplexo aux = new Ncomplexo(real, imaginario);
       return aux;
   }
   public boolean elgual(Ncomplexo objeto){
       return this.parteReal == objeto.parteReal && this.parteImaginario == objeto.parteImaginario;
   }
}
