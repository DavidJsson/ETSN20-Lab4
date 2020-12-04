import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchPattern {

    public static void main(String[] args) {
        if (args[0].equals("search")) {
            SearchPattern search = new SearchPattern();
            search.searchPatternsInFile(args[1], args[2]);
        } else {
            System.out.println("Invalid command");
        }
    }

    public void searchPatternsInFile(String pattern, String path) {
        try {
            Scanner sc = new Scanner(new File(path));
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}