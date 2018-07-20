/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theluhnalgorithm;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TheLuhnAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            String output = "";
            for(int j = 0; j < 5; j++){
                String s = reader.next();
                int out = LuhnAl(s);
                output += out;
            }
            System.out.println(output);
        }
    }

    private static int LuhnAl(String s) {
        int number = 0;
        int total = 0;
        int sum1 = 0;
        int num1;
        int sum2 = 0; 
        int j = 0;
        for(int i = s.length()-1; i >=0; i-=2){
            num1 =(s.charAt(i)-'0')*2;
            if(num1>9){
                num1 =(num1%10)+1;
                sum1 += num1;
            }else{
                sum1 +=num1;
            }
        }
        for(int i = s.length()-2; i >=0; i-=2){
             sum2 += s.charAt(i)-'0';
        }
        total = sum1+sum2;
        number =total%10;
        if(number!= 0){
            number = 10-number;
        }
        return number;
    }
    
}
