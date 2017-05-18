/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class ReverseString
{
    public String reverse( String str )
    {
        String reverse = "";
        if (str.length() == 1) 
        {
            return str;
        }
        else
        {
            reverse += str.charAt( str.length() - 1) + reverse( str.substring(0, str.length()-1));
            return reverse;
        }
    }

    public static void main(String[] args) {
        String strData = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        
        ReverseString rs = new ReverseString();
        System.out.println("Normal String: "+ strData);
        System.out.println("Reverse String: "+ rs.reverse(strData));
        
    }
}
