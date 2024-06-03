 import java.io.*;
 import java.util.Collections;
 import java.util.Vector;
 
class GFG {
       public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<Integer>();
        v.add(7);
        v.add(50);
        v.add(0);
        v.add(67);
        v.add(98);
        int n = Collections.max(v);
        System.out.println("The maximum value present in Vector is : "+ n);
    }
}
