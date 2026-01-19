package collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamCode {
    public static void main(String[] args) {
        List<Integer> Stream1 =  new ArrayList<>();
        Stream1.add(10);
        Stream1.add(20);
        Stream1.add(30);
        Stream1.add(40);
        Stream1.add(50);

        //1
        Long output = Stream1.stream().filter((Integer val)-> val >= 30).count();
        System.out.println("Stream 1 contains : " + output);

        //2
        Stream<Integer> Stream2 = Stream.iterate(100, (Integer val)->val+500).limit(5);
//        System.out.printf("Stream 2 :"+ Stream2); //this is object so i got Stream 2 :java.util.stream.SliceOps$1@34a245ab so use toString but Stream not support so you use print stream on below staffs
//        Stream2.forEach(System.out::println);  working
        Stream2.forEach((Integer val)-> System.out.println("Stream 2 contains : "+val)); //working

        //3
        Stream<String> Stream3 = Stream.of("APPLE","BALL", "CAT", "DOG").map((String val)-> val.toLowerCase());
        Stream3.forEach((String str)-> System.out.println("Stream 3 Contains : "+ str));

        //3 with single line code:
        Stream.of("APPLE","BALL", "CAT", "DOG").map((String val)-> val.toLowerCase()).forEach((String str)-> System.out.println("Stream 3 Contains (Alternative code) : "+ str));

        //4 flatten map
        List<List<Integer>> Stream4 = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );
        System.out.print("Stream 4 contains : ");
        Stream4.stream().flatMap((List<Integer> val)-> val.stream()).forEach((Integer result)-> System.out.print(+result + ", "));

        //5
        List<Integer> Stream5 = new ArrayList<>();
        Stream5.add(99);
        Stream5.add(1);
        Stream5.add(33);
        Stream5.add(54);
        Stream5.add(954);
        Stream5.add(33);

//        just for refer but bad practise Stream is use for efficient purpose only but below mwthod create 4 objects for memory kills and waste;
//        System.out.println("\n" +"Stream 5 contains : ");
//        List<Integer> distinctVal = Stream5.stream().distinct().peek((Integer val) -> System.out.println("Distinct Used : "+val)).collect(Collectors.toList());
//        List<Integer> sortedval = distinctVal.stream().sorted().peek((Integer val) -> System.out.println("Sorted : "+val)).collect(Collectors.toList());
//        List<Integer> limitVal = sortedval.stream().limit(3).peek((Integer val) -> System.out.println("limit : "+val)).collect(Collectors.toList());;
//        List<Integer> skipVal = limitVal.stream().skip(1).peek((Integer val) -> System.out.println("skip : "+val)).collect(Collectors.toList());;
//        skipVal.stream().forEach((Integer val)-> System.out.println("final reult forEach : "+val));

        System.out.println("============================ GOOD PRACTISE =========================");
        // Readable, Efficient, Memory Friendly
        Stream5.stream()
                .distinct().peek((Integer val) -> System.out.println("Distinct used: "+ val))
                .sorted().peek((Integer val) -> System.out.println("Sorted used: "+ val))
                .limit(3).peek((Integer val) -> System.out.println("peek used: "+ val))
                .skip(1).peek((Integer val) -> System.out.println("skip used: "+ val))
                .forEach(System.out::println);


        //6 MapToInt, mapToDouble also mapToLong(i didn't)
        //MapToInt
        List<String> Stream6 = Arrays.asList("5","4","3", "6","2","1");
        IntStream numStream = Stream6.stream().mapToInt((String val)-> Integer.parseInt(val));
        numStream.forEach((int val)-> System.out.println("after String to num convert : "+ val));

        int[] arr = {1,4,5,7,3,2,8,7};
        IntStream numStreams = Arrays.stream(arr);
        numStreams.filter((int val)-> val>3 ).forEach((int val)-> System.out.println("normal array number filter : "+ val));

        //mapToDouble
        List<String> Stream7 = Arrays.asList("5.89","8.97","1.29","3.76");
        DoubleStream doubleStream = Stream7.stream().mapToDouble((String val)-> Double.parseDouble(val));
        doubleStream.forEach((double val)-> System.out.println("after string to double covert : "+ val));

    }
}
