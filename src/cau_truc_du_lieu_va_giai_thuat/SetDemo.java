package cau_truc_du_lieu_va_giai_thuat;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SetDemo {
    public static void main(String[] args) {
        Map<String,Customer> customerMap= new HashMap<>();
        Customer customer1= createCustomer("Sang",19);
        Customer customer2= createCustomer("Văn",20);
        Customer customer3= createCustomer("Trung",17);
        customerMap.put(customer1.getName(),customer1);
        customerMap.put(customer2.getName(),customer2);
        customerMap.put(customer3.getName(),customer3);

        customerMap.entrySet().forEach(entry->{
            System.out.println("Key: "+entry.getKey()+" ------ Value: "+customerMap.get(entry.getKey()));
        });
    }
    public static Customer createCustomer(String name, int age){
        return new Customer(UUID.randomUUID().toString(),name,age);
    }
}
