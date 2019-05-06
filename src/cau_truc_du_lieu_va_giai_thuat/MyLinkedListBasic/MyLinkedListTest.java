package cau_truc_du_lieu_va_giai_thuat.MyLinkedListBasic;

import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList<Integer>(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,8);
        ll.addLast(5);
        ll.printList();
        System.out.println("Vị trí 3 là "+ll.get(2));
        System.out.println("Number of node "+ll.size());
        ll.remove(4);
        ll.printList();
        MyLinkedList<Integer> cloneData;
        cloneData= ll.clone();
        System.out.println("Sau khi clone thu được:");
        cloneData.printList();
        ll.clear();
        System.out.println("Sau khi xóa");
        ll.printList();
    }
}
