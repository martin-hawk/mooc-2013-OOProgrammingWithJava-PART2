
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }

//        t.save("src/testinput1.txt", "new\ntext");
        ArrayList<String> texts = new ArrayList<String>();
        texts.add("first line");
        texts.add("second line");
        texts.add("end.");
        t.save("src/testinput1.txt", texts);
    }
}
