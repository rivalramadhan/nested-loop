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
public class Loopingfundamentdowhile {
    public static void main(String[] args) {
        int k = 0;
        int n = 5;
        do{
           int l = 0;
            do {
                 if (k == 0 || l== 0) {
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
