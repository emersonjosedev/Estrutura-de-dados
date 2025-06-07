package matriz;
import java.util.Scanner;
public class Ex001 {
  //Um distribuidor de refrigerantes vende seu produto em todo o país. Em cada
    //trimestre do ano passado ele vendeu uma certa quantidade de garrafas em cada
    //região do Brasil. Faça um programa para ler as quantidades vendidas em uma matriz e
    //depois imprima na tela a quantidade total vendida em todo o país
    Scanner s = new Scanner(System.in);
    double [][] quantidade = new double[5][4];
       double soma = 0;

  public void iniciarEx01(){
      for(int i = 0; i < quantidade.length; i++){

          for(int j = 0; j< quantidade[i].length; j++){
              quantidade[i][j] = s.nextDouble();
              soma = soma + quantidade[i][j];
          }

      }
      System.out.println(soma);


  }


}
