/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krishnakanth
 */
public class DeadlockThread
{
    String str1 = "Java";
    String str2 = "World";
    
    Thread thread1 = new Thread("My Thread1")
    {
        @Override
        public void run()
        {
            while(true)
            {
                synchronized( str1 )
                {
                    try{ Thread.sleep( 1 ); } catch (InterruptedException ex) { Logger.getLogger(DeadlockThread.class.getName()).log(Level.SEVERE, null, ex); }
                    synchronized(str2)
                    {
                       System.out.println(Thread.currentThread().getId() + " : "+ Thread.currentThread().getName() );
                    }
                }
            }
        }
    };
    
    Thread thread2 = new Thread("My Thread2")
    {
        @Override
        public void run()
        {
            while(true)
            {
                synchronized( str2 )
                {
                    try{ Thread.sleep( 1 ); } catch (InterruptedException ex) { Logger.getLogger(DeadlockThread.class.getName()).log(Level.SEVERE, null, ex); }
                    synchronized(str1)
                    {
                        System.out.println( Thread.currentThread().getId() + " : "+ Thread.currentThread().getName());
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadlockThread deadlockThread = new DeadlockThread();
        deadlockThread.thread1.start();
        deadlockThread.thread2.start();
    }
    
    
}
