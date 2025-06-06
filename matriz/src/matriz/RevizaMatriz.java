package matriz;
import java.util.Scanner;
public class RevizaMatriz {
    int[][] matrizz  = new int[5][2];
    Scanner s = new Scanner(System.in);
    public void usarMatrizz(){

        for(int i = 0; i< matrizz.length; i ++){

            for(int j= 0; j < matrizz[i].length; j++){
                System.out.println("Digite a entrada ");
                matrizz[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < matrizz.length; i++){

            for (int j = 0; j< matrizz[i].length; j++){
                System.out.print(matrizz[i][j]);
            }
        }
    }

}
