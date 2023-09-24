import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class bai7th {
    
    public static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        long sum = 0;
        Scanner sc = new Scanner(new File("DATA.in"));
            StringBuilder a = new StringBuilder();
            String word = "";
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] numbers = line.split("\\s+");
                for (String num : numbers) {
                    if (isLong(num)) {
                        if(Long.parseLong(num) > 2147483647) sum += Long.parseLong(num);
                    }
                } 
            }
            System.out.println(sum);
    }
}
