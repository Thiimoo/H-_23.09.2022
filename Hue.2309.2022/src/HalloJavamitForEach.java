import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hallo");
        stringList.add("Welt");

        for (String s : stringList)
        {
            System.out.print(s);
            System.out.print(" ");
        }

        System.out.println("\n");

        stringList.forEach((String s) -> System.out.println(s));

        System.out.println("\n");

        Consumer<String> consumer = (String s) -> System.out.println(s);

        System.out.println("\n");

        stringList.forEach(System.out :: println);
    }
}
