package decorator.lowercase;

import java.io.*;

/**
 * Created by levente on 2017.05.30..
 */
public class ToLowerMain {

    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseDecorator(
                    new BufferedInputStream(
                            new FileInputStream("asd.txt")));
            while ((c = in.read()) > 0){
                System.out.print((char)c);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
