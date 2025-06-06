package estruturasCompostasHomogeneas;

public class Vetores {
    //estou chamando ele na classe main
    int[] vetor = new int[6];
    int[] vetor3 = new int [4];
    // O codigo abaixo equivale ao de cima porém já declarado
    int[] vetor2 = {0,1,2,3,4,5,6};
    
   public void usarVetor(){
        for(int i=0;i<vetor.length; i++){
            vetor[i] = i ;
            System.out.println("vetor1:"+vetor[i]);
        }
       
    }
}
