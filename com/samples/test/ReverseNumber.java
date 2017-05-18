/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class ReverseNumber
{
    public int reverseNumber( int number )
    {
        int reverse = 0;
        
        while( number != 0 )
        {
            reverse = (reverse*10)+(number % 10);
            number = number / 10;
        }
        
        return reverse;
    }
    
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        
        System.out.println(" Reveresed "+ reverseNumber.reverseNumber(120345678) );
        
    }
}
