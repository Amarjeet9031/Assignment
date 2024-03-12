package Assg;

import java.util.ArrayList;

public class SumAllEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(15);
        int i;
        int sum=0;
        // for (int i=0; i<list.size(); i++){
        // System.out.println(list);
        // }
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(list.get(i)%2==0){
                
                sum+=list.get(i);
                
                }
                
        }
        System.out.println("Total Sum of All even number : "+sum);
        
    }
}
