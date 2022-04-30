/*
Atividade 1: Somar 2 matrizes de mesmo tamanho
 */
package matrizes1;
import java.util.Arrays;
import java.util.Random;
public class Matrizes1 {

    public static void main(String[] args) {
        Random rand = new Random();
            int matrizA [][] = new int[5][5];
            int matrizB [][] = new int[5][5];
            int matrizC [][] = new int[matrizA.length][matrizB.length];
            
        
            for(int i=0;i<matrizA.length;i++)
                for(int j=0;j<matrizA.length;j++)
                    matrizA [i][j] = rand.nextInt(20);
                
            
            for(int i=0;i<matrizB.length;i++)
                for(int j=0;j<matrizB.length;j++)
                    matrizB [i][j] = rand.nextInt(20);

            for(int i=0;i<matrizC.length;i++)
                for(int j=0;j<matrizC.length;j++)
                    matrizC [i][j] = matrizA[i][j] + matrizB[i][j];
                
            for(int i=0;i<matrizC.length;i++)
                System.out.println(Arrays.toString(matrizC[i]));
}
}
