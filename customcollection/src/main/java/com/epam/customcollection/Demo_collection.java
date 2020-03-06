package com.epam.customcollection;

public class Demo_collection {
    public static void main(String[] args) 
    {
        C_collection<Integer> list = new C_collection<>();
 
        list.add(15);
        list.add(4);
        list.add(6);
        list.add(19);
        list.add(18);
        list.add(35);
        
        System.out.println("list is : "+list);
         
        list.remove(2);
        System.out.println("New updated list is : "+list);
         
        System.out.println("2nd element is : "+ list.get(1) );
        System.out.println("3rd element is : "+ list.get(2) );
 
        System.out.println("Size of the list is : "+list.size());
    }

}
