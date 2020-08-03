package Practice.three;


import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddUpperUsingReduce {

    public static void main(String[] args) {
        String str = "Satyaranjan";
        String[] strArr = str.split("");
        String newStr = "";

        IntStream.range(0, strArr.length)
                .forEach(i ->{
                    if(i%2 == 0)
                        strArr[i] = strArr[i].toUpperCase();
                    else
                        strArr[i] = strArr[i].toLowerCase();
                });

        System.out.println(Arrays.toString(strArr));

        String op = Arrays.stream(strArr).reduce((a, b) -> a+b).orElse("");
        System.out.println(op);
    }
}
