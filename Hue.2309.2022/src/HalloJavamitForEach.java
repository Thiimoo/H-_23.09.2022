import java.util.ArrayList;
import java.util.List;

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
    }
}
