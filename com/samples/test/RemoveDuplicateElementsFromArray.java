/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class RemoveDuplicateElementsFromArray
{
    public static int[] removeDuplicateValues( int input[] )
    {
        int i = 1;
        int j = 0;

        if( input.length < 2 )
        {
            return input;
        }

        while( i < input.length )
        {
            if ( input[i] == input[j] )
            {
                i++;
            }
            else
            {
                input[++j] = input[i++];
            }
        }

        int output[] = new int[j+1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }

        return output;

    }

    public static void main(String[] args)
    {
        int input1[] = new int[] {1,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,5,6,6,7,8,9,9,10,10};
        int output[] = removeDuplicateValues(input1);
        
        for (int i : output ) {
            System.out.print(i + " ");
        }

        System.out.println("");

    }
}