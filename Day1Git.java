import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Day1Git {
    private String str;
    private String fileName;

    public Day1Git(String str, String fileName) {
        this.str = str;
        this.fileName = fileName;
    }

    public void readFileToStr() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while (br.ready()) {
            str = str + (char) br.read();
        }
        br.close();
    }

    public void strToFile() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.print(str);
        pw.close();
    }
}
