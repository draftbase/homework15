package task1;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        String fileSource = "panstwa.csv";
        HashMap<String, Country> hashMap = loadFileTOMap(fileSource);
        printOrderCountry(hashMap);

    }

    private static void printOrderCountry(HashMap<String, Country> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
        String countryCode = scanner.nextLine();
        System.out.println(hashMap.get(countryCode));
    }

    private static HashMap loadFileTOMap(String fileSource) {
        File file = new File(fileSource);
        HashMap<String,Country> hashMap = new HashMap<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String linia = null;
            String[] kolumna = null;
            while((linia = bufferedReader.readLine()) != null){
                kolumna = linia.split(";");
                hashMap.put(kolumna[0],new Country(kolumna[0], kolumna[1], kolumna[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return hashMap;
    }
}
