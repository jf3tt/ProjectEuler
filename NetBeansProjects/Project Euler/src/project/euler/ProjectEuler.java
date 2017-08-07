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
public class ProjectEuler {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0;i<1000;i++){
                if ((i%3==0) || (i%5==0)){
                    x += i;
                }
           }
        System.out.println(x);
    }   
}
