//package cau_truc_du_lieu_va_giai_thuat;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class testCustomer {
//        public static void main(String[] args) {
//            Collection<Customer> collection= new ArrayList<>();
//            Customer customer1=new Customer("Trung", name, 20);
//            Customer customer2= new Customer("Tú", name, 22);
//            Customer customer3= new Customer("Văn", name, 2);
//            Customer customer4= new Customer("Sang", name, 40);
//            collection.add(customer1);
//            collection.add(customer2);
//            collection.add(customer3);
//            collection.add(customer4);
//            Iterator<Customer> iterator= collection.iterator();
//
//            while(iterator.hasNext()){
//                Customer customer= iterator.next();
//                System.out.println(customer);
//                System.out.println(check(customer));
//            }
//            String name="Trung";
//            boolean isExist= collection.stream().anyMatch(c->name.equals(c.getName()));
//            System.out.println(name+" exist " +isExist);
//            List<Customer> newCustomer= collection.stream().filter(c->name.equalsIgnoreCase(c.getName())).collect(Collectors.toList());
//            System.out.println(newCustomer);
//        }
//        public static boolean check(Customer customer){
//            if("Trung".equals(customer.getName())) return true;
//            return false;
//        }
//    }
//
