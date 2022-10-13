/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;
public class Loopingc {

    
    public static void main(String[] args) {
          for(int i = 1; i<=5; i++) {
             for (int j = 0; j<4; j++){
                 System.out.print("*");
             }
             System.out.println("0");
         }
          System.out.println("");
          
        int k = 0;
        int n = 5;
        do{
           int l = 0;
            do {
                 System.out.print("*");
                l++;
                
            }while (l < 4);   
            System.out.println("0");
            k++;      
        }while (k < n);
    }   
}

