package matriz;



public class Cmatriz {
    int[][] matriz1 = new int[6][4];
     // ou
    int[][] matriz2 = {{6,2},{8,4}};
    public void initMatriz(){
        for(int i =0; i< matriz1.length; i++){
            for(int j = 0; j< matriz1[i].length;j++){
                matriz1[i][j] = 2;
                System.out.printf("Indice i " + " Indice J "+ matriz1[i][j] );

            }
        }

        for(int i = 0;i < matriz2.length; i ++){
            for (int j = 0; j< matriz2.length; j++){
                System.out.println(matriz2[i][j]);
            }
        }
    }
}