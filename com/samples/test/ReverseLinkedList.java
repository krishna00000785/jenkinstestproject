/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samples.test;

/**
 *
 * @author Krishnakanth
 */
public class ReverseLinkedList<Q>
{
    private Node<Q> head;
    
    public void add( Q element )
    {
        Node<Q> nd = new Node<Q>();
        nd.setValue(element);
        
        System.out.println("Adding Element: "+ element);
        
        Node<Q> tmp = head;
        
        while (true)
        {
            if( tmp == null )
            {
                head = nd;
                break;
            }
            else if( tmp.getNextRef() == null )
            {
                tmp.setNextRef(nd);
                break;
            }
            else
            {
                tmp = tmp.getNextRef();
            }
        }
    }
    
    public void traverse()
    {
        Node<Q> tmp = head;

        while(true)
        {
            if(tmp == null)
            {
                break;
            }
            else
            {
                System.out.println("["+ tmp.getValue() + "]" );
            }

            tmp = tmp.getNextRef();
        }
        
    }
    
    public void reverse()
    {
        Node<Q> prev = null;
        Node<Q> current = head;
        Node<Q> next = null;

        while(current != null)
        {
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }

        head = prev;

    }
    
    public static void main(String[] args) {
        ReverseLinkedList<Integer> mReverseLinkedList = new ReverseLinkedList<Integer>();
        
        mReverseLinkedList.add( 1 );
        mReverseLinkedList.add( 2 );
        mReverseLinkedList.add( 3 );
        mReverseLinkedList.add( 4 );
        mReverseLinkedList.add( 5 );
        mReverseLinkedList.add( 6 );
        mReverseLinkedList.add( 5 );
        
        System.out.println("Traverse: \r\n");
        mReverseLinkedList.traverse();
        System.out.println("Reverse: \r\n");
        mReverseLinkedList.reverse();
        System.out.println("After Reverse Traverse: \r\n");
        mReverseLinkedList.traverse();
    }
}

class Node<Q> implements Comparable<Q>
{
    private Q value;
    Node<Q> nextRef;

 
    public Q getValue()
    {
        return value;
    }

    public void setValue( Q value )
    {
        this.value = value;
    }

    public Node<Q> getNextRef()
    {
        return nextRef;
    }
    
    public void setNextRef( Node<Q> nextRef )
    {
        this.nextRef = nextRef;
    }

    @Override
    public int compareTo(Q obj) {
        if( this.value == obj )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    
}
