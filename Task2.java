import java.util.Arrays;  
import java.util.List;  
import java.util.stream.Collectors;  
public class ArrayToCollectionExample {  
    public static void main(String[] args) {  
        Integer[] intArray = {1, 2, 3, 4, 5};    
        List<Integer> integerList = Arrays.stream(intArray).collect(Collectors.toList());                                    
        for (Integer num : integerList) {  
        System.out.println(num);  
        }  
    }  
}  