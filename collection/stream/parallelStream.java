package collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parallelStream {

    public static void main(String[] args) {

        List<Integer> pStream = new ArrayList<>();
        for(int i=0; i<1000 ;i++){
            pStream.add(i);
        }
        Long streamTime = System.currentTimeMillis();
        pStream.stream().map((Integer val)-> val * val).forEach((Integer val)-> System.out.println("Stream val : "+val));
        System.out.println("Stream time taken : "+ (System.currentTimeMillis() - streamTime));//38 millisecond
        System.out.println("===================================================================================");
        Long parallelStramTime = System.currentTimeMillis();
        pStream.parallelStream().map((Integer val) -> val * val).forEach((Integer val)-> System.out.println("parallel val : "+ val));
        System.out.println("parallel time taken : "+ (System.currentTimeMillis() - parallelStramTime));//28 millisecond

    }

}
