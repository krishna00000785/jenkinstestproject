/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Krishnakanth
 */
public class MaxRepeatedWords
{
    public Map< String, Integer> maxRepeatwords( String filename )
    {
        HashMap<String, Integer> mMap = new HashMap<String, Integer>();

        FileInputStream fin = null;
        DataInputStream dis = null;
        BufferedReader br = null;

        try
        {
            fin = new FileInputStream(filename);
            dis = new DataInputStream(fin);

            br = new BufferedReader( new InputStreamReader(fin));

            String line = null;

            while ( (line = br.readLine()) != null )
            {
                StringTokenizer mStringTokenizer = new StringTokenizer(line, " ");
                
                while (mStringTokenizer.hasMoreTokens()) 
                {
                    String tmp = mStringTokenizer.nextToken().toLowerCase();

                    if( mMap.containsKey(tmp) == true )
                    {
                        mMap.put(tmp, mMap.get(tmp)+1);
                    }
                    else
                    {
                        mMap.put(tmp, 1);
                    }
                }
            }

        }catch(Exception e){ e.printStackTrace(); }

        return mMap;

    }

    public List<Map.Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap)
    {
        Set<Map.Entry<String, Integer>> set = wordMap.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList(set);

        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            @Override
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }

        } );

        return list;
    }

    public static void main(String[] args)
    {
        String strFilePath = "C:\\Users\\Krishnakanth.KrishnakanthB\\Desktop\\AI Features-source.txt";

        MaxRepeatedWords mrw = new MaxRepeatedWords();

        Map<String, Integer> map = mrw.maxRepeatwords(strFilePath);
        List<Map.Entry<String, Integer>> list = mrw.sortByValue(map);

        for (Map.Entry<String, Integer> entry : list )
        {
            String string = entry.getKey();
            Integer integer = entry.getValue();
            System.out.println( string + " = "+ integer);
        }

    }
}