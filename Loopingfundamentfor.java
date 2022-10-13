package looping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Loopingfundamentfor {
    public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
        System.out.print("looping ke " + i);
        for(int j = 0; j < n; j++){
            if (i == 0 || j == 0) {
                System.out.print(" 0");
                
            }else {
                System.out.print(" *");     
                }
            }
        System.out.println("");
        }
    }
}
