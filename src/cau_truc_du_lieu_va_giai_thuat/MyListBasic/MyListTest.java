package cau_truc_du_lieu_va_giai_thuat.MyListBasic;

import cau_truc_du_lieu_va_giai_thuat.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(7, 15);
        listInteger.remove(3);
        listInteger.printList();
        System.out.println("Số phần tử là : "+listInteger.size());
        System.out.println("Kiểm tra phần tử 3 có trong ds k:");
        System.out.println(listInteger.contains(3));
        System.out.println("Vị trí đầu tiên của phần tử 8");
        System.out.println(listInteger.indexOf(8));
//        System.out.println("Sau khi xóa");
//        listInteger.clear();
        MyList<Integer> copyArray= listInteger.cloneArray(listInteger);
        copyArray.printList();
    }
}
