package Assg;

import java.util.ArrayList;
import java.util.List;

public class Rever {
    public static void main(String[] args) {
        // List<String> [] list = {"Amarjeet","shiva","kumar","ramu"};
        List<String> list2 = new ArrayList<>();
        list2.add("Amarjeet");
        list2.add("Kumar");
        list2.add("Shiva");
        list2.add("Arun");
        list2.add("Rohit");
        list2.add("Niraj");
        System.out.println("---------Original -------");
        for( String list: list2){
            System.out.println(list);
        }
        System.out.println(list2);

    //   for(list2:String list){
    //     System.out.println(list2);
    //   }
    // int i=1;
    // int j=list2-i;
    // int j=list
    System.out.println("--------- Reverse -------");
    int i;
    String list3;
    for( i=list2.size()-1;i>=0;i--){
        list3=list2.get(i);
        System.out.println(list3);
    }
    
    }
}
