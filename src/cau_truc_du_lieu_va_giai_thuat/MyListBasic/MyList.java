package cau_truc_du_lieu_va_giai_thuat.MyListBasic;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAULT_CAPACITY=18;
    private Object elements[];
    public MyList<E> cloneArray(MyList<E> list){
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(list.elements,list.size());
       return v;
    }

    public MyList() {
        elements= new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize= elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size==elements.length)
            ensureCapacity();
        elements[size++]=e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public void add(int index, E e){
        for(int i=size;i>index;i--){
            elements[i+1]=elements[i];
        }
        elements[index]=e;
        size++;
    }
    public MyList<E>[] clone(){
      MyList<E> v[]= (MyList<E>[]) elements;
      return v;
    }
    public void remove(int index){
        index--;
        for(int i=index; i<size;i++){
            elements[i]=elements[i+1];
        }
        size--;
    }
    public void printList(){
        for(int i=0;i<size;i++){
            System.out.println(elements[i]);
        }
    }
    public int size(){
        return size;
    }

    public boolean contains( E e){
        int i=0;
        for(i=0;i<size;i++){
            if(elements[i]==e) return true;
        }
        return false;
    }
    public int indexOf(E e){
        for(int i=0;i<size;i++){
            if(elements[i]==e) return (i+1);
        }
        return -1;
    }
    public void clear(){
        elements= new Object[DEFAULT_CAPACITY];
        size=0;
    }
}
