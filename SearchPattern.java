import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchPattern {

    public static void main(String[] args) throws FileNotFoundException {
        if (args[0].equals("search")) {
            SearchPattern search = new SearchPattern();
            search.searchPattern(args[1], args[2]);
        } else {
            System.out.println("Invalid command");
        }
    }

    public void searchPattern(String pattern, String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains(pattern)) {
                System.out.println(line);
            }
        }
    }
}