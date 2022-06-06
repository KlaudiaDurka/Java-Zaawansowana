package zadania.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryResources {

    public static String readFirstLineFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\users.txt"))) {
            return bufferedReader.readLine();
        } catch (Exception ex){
            System.out.println("Błąd pliku");
            return null;
        }
    }

    public static void main(String[] args) {
        String liniaZPliku = readFirstLineFromFile();
        System.out.println(liniaZPliku);
    }

}
