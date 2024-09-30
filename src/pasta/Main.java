package pasta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DynArray<String> test = new DynArray<>();
        test.add("test");
        test.add("bilau");
        String[] arr = test.get();
        for(String p : arr){
            System.out.println(p);
        }

    }
}
