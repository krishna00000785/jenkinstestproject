/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class DecimalNumberToBinaryFormat
{
    public void toBinary( int number )
    {
        int binary[] = new int[25];
        int index = 0;
        
        while( number > 0 )
        {
            binary[index] = number % 2;
            number = (number / 2);
            index++;
        }

        for (int i = index - 1; i >= 0; i--)
        {
            System.out.print(binary[i]);
        }
    }
    
    public static void main(String[] args)
    {
        DecimalNumberToBinaryFormat dntbf = new DecimalNumberToBinaryFormat();
        dntbf.toBinary(33554400);
        System.out.println("");
    }
}
