/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YX LOH
 */

class test{
    public static void main(String[] args) {
         
        myLL myLL = new myLL();
        
        myLL.add("Lord of the Rings",500);
        myLL.add("Tale of the Body Thief",1);
        myLL.add("Memnoch the Devil",100);
        myLL.add("Heart of a Samurai",10);
        myLL.display();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane","Memoirs of Geisha",90);
        myLL.remove("Harry Potter");
        myLL.remove("Heart of a Samurai");
        myLL.display();
        
    }
    
}

public class myLL<E extends Comparable<E>,N extends Comparable<N>>{
    
    Node<E,N> head;
    Node<E,N> tail;;
    int size;
    
    public myLL(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public void add(E element, N sales){
        Node<E,N> newNode = new Node<E,N>(element,sales);
        newNode.next = head;
        head = newNode;
        if(tail==null){
            tail = newNode;
        }
        size++;
    }
    
    public void addAfter(E after, E element, N sales){
        Node<E,N> temp = head;
        int i = 1;
        while(temp!=null){
            if(temp.element.compareTo(after)==0){
                System.out.println("Adding " + element + " after " + after);
                System.out.println("Found " + after + " which is book number " + i + " in the linked list");
                Node<E,N> current = temp.next;
                temp.next = new Node<E,N>(element,sales);
                temp.next.next = current;
                size++;
                return;
            }
            i++;
            temp = temp.next;
        }
        System.out.println("Couldn't find bookname");
    }
    
    public void remove(E element){
        Node<E,N> temp = head;
        System.out.println("Removing " + element);
        int pos = 1;
        while(temp!=null){
           if(temp.element.compareTo(element)==0){
               System.out.println(element + " is the " + pos + "st book " + " Removing " + element + " from the linked list");
               Node<E,N> current = null;
               if(temp.element.compareTo(head.element)==0){
                   current = head;
                   head = head.next;
                   size--;
                   return;
               }
               Node<E,N> temp2 = head;
               while(head!=null && temp2.next!=temp){
                   temp2 = temp2.next;
               }
               current = temp2.next;
               temp2.next = current.next;
               size--;
               return;
           }
           temp = temp.next;
        }
        System.out.println("Couldn't find bookname");
    }
    
    public void display(){
        System.out.println("Displaying the Linked List ********************************");
        Node<E,N> temp = head;
        while(temp!=null){
            System.out.println(temp.element.toString() + ": " + temp.sales.toString() + ",000,000 Sold");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void totalSold(){
        System.out.print("Total Sold : ");
        Integer total = 0;
        Node<E,N> temp = head;
        while(temp!=null){
            total+=(Integer) temp.sales;
        }
        System.out.println(total);
    }
}


class Node<E,N>{
    
    Node<E,N> next;
    E element;
    N sales;
    
    public Node(E element, N sales){
        this.element = element;
        this.sales = sales;
    }
    
}