/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author kingsley
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class Solution{
            public int reverse(int x){
                int rev = 0;
                while ( x != 0){
                int pop = x %10;
                x/=10;
                if (rev > Integer.MAX_VALUE/10 ||(rev ==Integer.MAX_VALUE / 10 && pop> 7))
                    return 0;
                
                if (rev < Integer .MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8 ))
                    return 0;
                rev = rev*10+pop;
            }
                return rev;
            }
        }
        // TODO code application logic here
    }
    
}
