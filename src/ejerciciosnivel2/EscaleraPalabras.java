/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ejerciciosnivel2;

import java.util.Arrays;

/**
 *
 * @author angel
 */
public class EscaleraPalabras {
    
    char [][] wordList = {
        {'P', 'A', 'T', 'A'},
        {'P', 'A', 'T', 'O'},
        {'R', 'A', 'T', 'O'},
        {'R', 'A', 'M', 'O'},
        {'G', 'A', 'M', 'O'},
        {'G', 'A', 'T', 'O'},
        {'M', 'A', 'T', 'O'},
    };
    
    int contador=1;
    int j=0;
    int error=0;//va ser el nuemro de letras siferentes
    
    String word1="";
    String word2="";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EscaleraPalabras ejercicio=new EscaleraPalabras();
        
        System.out.println(ejercicio.Compare(ejercicio.wordList));
        
    }
    
    public boolean Compare(char[][] compare){
        
        if (error<2) {
            
            for (int i = 0; i < compare.length; i++) {
                for (j = 0; j < compare[0].length; contador++) {

                    if(wordList[i][j]==wordList[i+1][j]){
                        word1=word1+wordList[i][j];
                        word2=word2+wordList[i][j];
                    }
                    
                    if (contador==5) {
                        contador=1;
                        j=0;
                    }
                    
                    if(wordList[i][j]!=wordList[i+1][j]){
                        error++;
                    }
                }
            }
            error=0;
            return true;
            
        }
        else{
            error=0;
            return false;
        }

    }
}
