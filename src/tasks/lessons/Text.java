package tasks.lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Text {
    public void getString() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("someText.txt"));
        String firstString = reader.readLine();
        System.out.println(firstString);
    }


}
