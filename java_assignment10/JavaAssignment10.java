package java_assignments11.java_assignment10;

import java.util.Scanner;

/*
Generics, Arrays and Containers
Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.
Each Link object in the list should contain a reference to the next element in the list, but not the
previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).
Create your own SListIterator which, again for simplicity, does not implement ListIterator.
The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
The only way to insert and remove elements from an SList is through SListIterator. Write code to demonstrate SList.
 */

class Node<T>
{
    // data in the list
    T data;
    // pointer to next list
    Node<T> next;
    Node()
    {
        data=null;
        next=null;
    }
    Node(T data)
    {
        this.data=data;
        next=null;
    }
}


class SList<T>
{
    Node<T> head;
    SList()
    {
        head=null;
    }
    SList(T data)
    {
        head=new Node<T>(data);
    }
    public SListIterator getIterator()
    {
        return new SListIterator<T>(head);
    }
}


class SListIterator<T>
{
    Node<T> head;
    Node<T> current;
    int count;
    SListIterator(Node<T> head)
    {
        this.head=head;
    }
    // inserts the given data into list
    public void insert(T data)
    {
        count++;
        if (head==null)
        {
            head=new Node<T>(data);
            current=head;
        }
        else
        {
            current.next=new Node<T>(data);
            current=current.next;
        }
    }
    // displays all the items in the list
    public void display()
    {
        if(head==null)
        {
            System.out.println("empty list");
            return;
        }
        Node<T> temp=head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

}


public class JavaAssignment10 {
    public static void main(String[] args) {
        SList<String > sl = new SList<String >();
        SListIterator<String > iterator = sl.getIterator();

        while(true){
            System.out.println("Enter Y to continue, N to exit");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            if(option.equals("N")) {
                break;
            }

            else if(option.equals("Y")) {
                System.out.println("enter the value");
                String value = in.nextLine();
                iterator.insert(value);
                iterator.display();
            }
        }
    }
}


