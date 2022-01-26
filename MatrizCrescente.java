
package matriz_crescente;

import java.util.Arrays;
import java.util.Scanner;


public class Matriz_crescente {
      public static void main (String[] args) {
        int matriz[][];
        int tamanho_x=-9999;
        int tamanho_y=-9999;
        
           Scanner usuario = new Scanner(System.in);
        int lin, col ;

        System.out.println("Quantas linhas?");
        lin = usuario.nextInt();

        System.out.println("Quantas colunas?");
        col = usuario.nextInt();
        
            
        
        matriz = new int[lin][col];
       

         for(int x=0; x < lin; x++){
            for(int y=0; y < col; y++){
                System.out.println("matriz ["+x+"]["+y+"] =");
                
                matriz[x][y]= usuario.nextInt();
                
                for( x=0; x < lin; x++){
                    for(y=0; y<col;y++){
                        
                        if(x<=tamanho_x){
                            tamanho_x=x;
                        }
                        if(y<=tamanho_y){
                            tamanho_y=y;
                        }
                        
                    }
                }
                
                
                
               
                
                
            }
        }

        for(int x=0; x < lin; x++){

            for(int y=0; y < col; y++){
                
                System.out.print(matriz[x][y]+"\n");
                
                
            }
            
        }

    }
    }
    

