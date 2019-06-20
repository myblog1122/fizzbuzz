package com.minitest.fizzbuzz.node;


public class CircularLinkedList {
    
    class Element
    {
        public Integer value=null;
        private Element next=null;
    }
    /**
     * Pointer to first node.
     * Invariant: (first == null && last == null) ||
     *            (first.prev == null && first.item != null)
     */
    private Element header = null;//头结点
    
    int size = 0;

    
    public CircularLinkedList() {
    }
    /**
     * initList
     * */
    public void initList()
    {
        header = new Element();
        header.value=null;
        header.next=header;
    }
    /**
     * initList  size=number
     * */
    public void initList(int number)
    {
    	 header = new Element();
         header.value=null;
         header.next=header;
    	 for(int i=1;i<=number;i++) {
         	insertList(i);
         }
    }
 
    /**
     * add element o into list
     * */
    public void insertList(Integer o)
    {
        Element e=new Element();
        e.value=o;
        if(header.next==header)
        {
            header.next=e;
            e.next=header;
        }else{
            Element temp = header;
            while(temp.next!=header)//get last element
            {
                temp=temp.next;
            }
            temp.next=e;
            e.next=header;//last element point to header
        }
    }   
 
    /**
     * delete element O 
     * */
    public void deletelist(Integer o){
        Element temp =header;
        while(temp.next!=header)
 
        {
           //Element temps' next value is need delete
            if(temp.next.value.equals(o))
            {
                temp.next=temp.next.next;//delete it
            }else
            {
               temp=temp.next;
            }
        }
    }
     
 
    /**
     * get the Element by i
     * */
    public Integer getElement(int i)
    {
        if(i<=0 || i>size())
        {
            System.out.println("error position！return null");
            return null;
        }
        else{
            int count =0;
            Element element = new Element();
            Element temp = header;
            while(temp.next!=header)
            {
                count++;
                if(count==i)
                {
                    element.value=temp.next.value;
                }
                temp=temp.next;
            }
            return element.value;
        }
    }
 
    /**
     * get circular linkedList's size 
     * count all  element
     * */
    public int size()
    {
        Element temp = header;
        int size=0;
        while(temp.next!=header)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
 
 
    /**
     * if circular linkedList contain Integer o return true
     * otherwise return false
     * */
    public Boolean isContain(Integer o)
    {
        Element temp =header;
        while(temp.next!=header)
        {
           if(temp.next.value.equals(o))
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
 
    /**
     * print list
     * */
    public void print()
    {
 
        System.out.print("print list：");
        Element temp =header;
        while(temp.next!=header)
        {
            temp=temp.next;
            System.out.print(temp.value+"\t");
        }
        System.out.println();
    }
}
