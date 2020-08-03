package Practice.three;


import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class OddUpperUsingLambda {

    public static void main(String[] args) {
        String str = "Satyaranjan";
        char[] arr = str.toCharArray();
        AtomicReference<String> newStr = new AtomicReference<>("");

        IntStream.range(0,str.length())
                .forEach(i -> {
                    if(i%2 == 0)
                        newStr.set(newStr + ("" + arr[i]).toLowerCase());
                    else
                        newStr.set(newStr + ("" + arr[i]).toUpperCase());
                });

        System.out.println(newStr.toString());
    }
}
