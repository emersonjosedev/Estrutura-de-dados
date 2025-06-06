package estruturasCompostasHomogeneas;
import java.util.Scanner;
public class ex001 {
    //•Uma prova de química foi feita por um 
//grupo de 20 alunos. Faça um programa 
//para ler as notas obtidas pelos alunos, e 
//depois exibir um relatório de notas 
//superiores a 7,5.
    Scanner entrada = new Scanner(System.in);
    double [] notas = new double [2];
        double[] relatorio = new double[2];
            
            
    public void cNotas(){
        for(int i= 0; i < notas.length; i ++){
             System.out.println("Digite a nota");
            notas[i] = entrada.nextDouble();
        }
    System.out.println("Notas maiores que 7.5");
    for(int i =0; i < notas.length; i++){
        if(notas[i] > 7.5 ){
            System.out.println(notas[i]);
        }
        
    }
        
    }
    

}