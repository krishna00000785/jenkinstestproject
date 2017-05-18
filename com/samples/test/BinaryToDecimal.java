/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class BinaryToDecimal
{
    public int toDecimal( int binary )
    {
        int decimal = 0;
        int power = 0;
        
        while( true )
        {
            if( binary == 0 )
            {
                break;
            }
            else
            {
                int tmp = binary % 10;
                decimal += tmp * Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        
        return decimal;
    }

    public boolean isValidBinaryNumber( int binary )
    {
        boolean status = true;
        
        while( true )
        {
            if( binary == 0 )
            {
                break;
            }
            else
            {
                int tmp = binary % 10;
                if( tmp > 1 )
                {
                    status = false;
                    break;
                }
                
                binary = binary / 10;
            }
        }
        
        return status;
    }

    public static void main(String[] args)
    {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal();

        int binary = 11311010;

        if( binaryToDecimal.isValidBinaryNumber(binary) == true )
        {
            System.out.println( binaryToDecimal.toDecimal(binary));
        }
        else
        {
            System.out.println("Invalid Binary Number");
        }
    }
}
