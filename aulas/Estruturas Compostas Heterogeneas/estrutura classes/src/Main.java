import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Registro p1 =  new Registro();
        Registro p2 = new Registro();
        Registro[] vetor = new Registro[5];


        for(int i = 0; i< vetor.length; i++){
            vetor[i] = new Registro();
        }
        vetor[3].altura = 2.4;
        p1.altura = 1.70;
        p2.altura = 1.88;
        System.out.println("Altura pessoa1 =  " + p1.altura + " Vetor " + vetor[1].altura );


}

}