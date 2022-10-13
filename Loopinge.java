/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;
/**
 *
 * @author ASUS
 */
public class Loopinge {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {              
                if (i == j) {
                    System.out.print("0");
                }else {
                    System.out.print("*");          
                }
            }
            System.out.println("");
        }
        System.out.println("");
        int k = 0;
        int n = 5;
        do{
           int l = 0;
            do {
                 if (k == l) {
                    System.out.print("0");
                }else {
               System.out.print("*");
              }
                l++;        
            }while (l < n);   
            System.out.println("");
            k++;      
        }while (k < n);
    }
}