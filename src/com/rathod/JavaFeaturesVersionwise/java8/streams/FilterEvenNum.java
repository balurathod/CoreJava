import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterEvenNum {
    public static void main(String[] args) {

        List<Integer> list  = List.of(1,2,3,4,5,6);
        //list.add(23);   //

        List<Integer> sortedList = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
