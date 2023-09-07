package GSDC_CODES;
import java.util.ArrayList;
import java.util.List;

public class prog9 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> mergedlist = new ArrayList<>();

        list1.add(10);
        list1.add(1);
        list1.add(5);
        list1.add(2);
        list1.add(17);
        list1.add(7);
        list1.add(8);


        list2.add(61);
        list2.add(34);
        list2.add(6);
        list2.add(22);
        list2.add(37);
        list2.add(27);
        list2.add(84);

        for (int num : list1){
            if(num % 2 != 0){
                mergedlist.add(num);
            }
            
        }

        for (int num : list2)
        {
            if(num % 2 == 0){
            mergedlist.add(num);
            }
        }

        System.out.println("Merged List");
        for(int num :mergedlist)
        {
            System.out.println(num + " ");
        }
    }
        

}
