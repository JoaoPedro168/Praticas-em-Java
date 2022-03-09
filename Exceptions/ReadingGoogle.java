package Exceptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadingGoogle {
    public static void main(String[] args) throws IOException, MalformedURLException {

        try {
            URL url = new URL("http://www.google.com/index.html");
            Scanner scan = new Scanner(url.openStream());
            int count = 0;
            while (scan.hasNext()) {
                scan.next();
                count += 1;
            }
            System.out.println(count);
        } catch (MalformedURLException e) {
            System.out.println("The URL is wrong");
        } catch (IOException e) {
            System.out.println("The page can't be read");
        }
    }
}
