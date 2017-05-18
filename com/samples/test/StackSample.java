/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

import java.util.Stack;

/**
 *
 * @author Krishnakanth
 */
public class StackSample
{
    public Stack<Integer> sortStack( Stack<Integer> input )
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        System.out.println(" ***************Logs*************** ");
        
        while ( !input.isEmpty() )
        {
            int tmp = input.pop();

            System.out.println("Element taken out "+ tmp );

            while( !tmpStack.isEmpty() && tmpStack.peek() > tmp )
            {
                input.push( tmpStack.pop() );
            }

            tmpStack.push(tmp);

            System.out.println("Elements in tmpStack = "+ tmpStack);
            System.out.println("Elements in input = "+ input);
        }

        return tmpStack;
    }
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push( 1 );
        st.push( 5 );
        st.push( 25 );
        st.push( 2 );
        st.push( 10 );
        st.push( 50 );
        st.push( 3 );
        st.push( 15 );
        st.push( 75 );
        st.push( 4 );
        st.push( 20 );
        st.push( 100 );
        st.push( 4 );

        StackSample ss = new StackSample();
        
        Stack<Integer> output = ss.sortStack(st);
        
        System.out.println("");
        System.out.println("");
        System.out.println(""+ output);
    }
}
