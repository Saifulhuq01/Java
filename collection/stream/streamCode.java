package collection.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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

        //terminal opertaion finisher of codes:


        // 7. reduce with optional and integer

        // Stream8.get() this got an error becuase List<> support get(int) paramater version only
//        Syntax Error (which you found): Stream8 is a List. In Java, Lists hold many items, so get() requires an index (like get(0)).
//Logic Error: The reduce operation produces a new result, it does not change the original list. In your first snippet, you calculated the sum but didn't assign it to a variable, so the calculation was lost.
//        List<Integer> Stream8 = Arrays.asList(8,6,5,3,2,1,3,6,7);
//        Stream8.stream().reduce((Integer val1, Integer val2)-> val1+val2);
//        System.out.println("Stream8 result : " +Stream8.get());

        List<Integer> Stream8D = Arrays.asList(8,6,5,3,2,1,3,6,7);
        Optional<Integer> result = Stream8D.stream().reduce((Integer val1, Integer val2)-> val1+val2);
        System.out.println("Stream8 result : " +result.orElse(0));//safety suppose on optional only
        System.out.println("Stream8 result : " +result.get());// not safety because if list is empty then error rise

        //You can avoid the Optional entirely by providing a starting value (identity) to the reduce method. If you start with 0, the result will always be an Integer, never empty.
        Integer sum = Stream8D.stream().reduce(0,(val1,val2)-> val1+val2);
        System.out.println("Stream8 result without Optional : "+ sum);

        // 8. collect
        //forEach: You put your hand under the pipe. The water hits your hand and falls on the ground. It is gone
        //collect: You put a bucket under the pipe. Now you have a bucket of water you can carry around, drink from later, or pour into another bucket.
        List<Integer> testCollect = Arrays.asList(8,6,5,3,2,1,3,6,7);
        List<Integer> Collectresult = testCollect.stream().filter((Integer val)-> val > 4).collect(Collectors.toList());
        Collectresult.forEach((Integer val)-> System.out.println("Collect based result: "+val));

        //9.min max using optional (why filter becuase while filter we skip before the value of filter like filter is 4 now 1,2,3,3 skipped)
        List<Integer> test = Arrays.asList(8,6,5,3,2,1,3,6,7);
        // MIN Ascending
        Optional<Integer> minresult1= test.stream().filter((Integer val)-> val >4).min((Integer val1, Integer val2)-> val1-val2);
        System.out.println("min ascenidng afer 3 result : "+minresult1.get());
        // MIN Descending
        Optional<Integer> minresult2= test.stream().filter((Integer val)-> val >4).min((Integer val1, Integer val2)-> val2-val1);
        System.out.println("min  descending after 3 result  : "+minresult2.get());

        // MAX Ascending
        Optional<Integer> maxresult1= test.stream().filter((Integer val)-> val >4).max((Integer val1, Integer val2)-> val1-val2);
        System.out.println("max ascenidng afer 3 result : "+maxresult1.get());
        // MAX Descending
        Optional<Integer> maxresult2= test.stream().filter((Integer val)-> val >4).min((Integer val1, Integer val2)-> val2-val1);
        System.out.println("min  descending after 3 result  : "+maxresult2.get());

        //10 count:
        List<Integer> countTest = Arrays.asList(8,6,5,3,2,1,3,6,7);
        Long countresult = countTest.stream().filter((Integer val)-> val >6).count();
        System.out.println("After count happens : "+countresult);

        //11 Match:
        List<Integer> matchTest = Arrays.asList(8,6,5,3,2,1,3,6,7);
        Boolean marchResult = matchTest.stream().anyMatch((Integer val)-> val >1);
        System.out.println("any match : "+marchResult);

        Boolean marchResult1 = matchTest.stream().allMatch((Integer val)-> val >0);
        System.out.println("any match : "+marchResult1);

        Boolean marchResult2 = matchTest.stream().noneMatch((Integer val)-> val >99);
        System.out.println("any match : "+marchResult2);

        //11 Find First:
        List<Integer> findTest = Arrays.asList(8,6,5,3,2,1,3,6,7);
        Optional<Integer> findResult = findTest.stream().filter((Integer val)-> val >6).sorted().findFirst();
        System.out.println("findFirst value of value of 6 : "+findResult.get());

        Optional<Integer> findResult1 = findTest.stream().filter((Integer val)-> val >4).sorted().findAny();
        System.out.println("findAny value of value of 6 : "+findResult1.get());




    }
}
