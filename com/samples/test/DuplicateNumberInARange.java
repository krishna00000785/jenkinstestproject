/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krishnakanth
 */
public class DuplicateNumberInARange
{
    public int findDuplicate( List<Integer> numbers )
    {
        int highestNumber = numbers.size()-1;
        int total = getSum(numbers);
        
        System.out.println("1 "+ total);
        System.out.println("2 "+ highestNumber);
        System.out.println("3 "+ (highestNumber+1)/2);
        System.out.println("4 "+ (highestNumber * (highestNumber+1)/2));
        int duplicate = total - ( highestNumber * (highestNumber+1)/2);
        
        return duplicate;
    }

    public int getSum( List<Integer> numbers )
    {
        int sum = 0;
        
        for( int num : numbers )
        {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> mList = new ArrayList<Integer>();

        for (int i = 1; i < 100; i++)
        {
            mList.add(i);
        }

        mList.add(85);

        DuplicateNumberInARange dniar = new DuplicateNumberInARange();
        System.out.println("Duplicate Number = "+ dniar.findDuplicate(mList));
    }
}
