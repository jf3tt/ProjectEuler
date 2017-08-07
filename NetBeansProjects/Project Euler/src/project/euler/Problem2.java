/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.euler;

/**
 *
 * @author jangofett
 */
public class Problem2 {
    public static void main (String[] args){
        int x = 0;  
        int y = 1; 
        int i = 0; 
        int z = 0;
        while (i < 4000000){
            i = x + y; // sum of n1 and n2
            x = y; 
            y = i;
            if (i % 2 == 0) { 
                z += i;
                System.out.println(z);
            }
        }   
    }
}