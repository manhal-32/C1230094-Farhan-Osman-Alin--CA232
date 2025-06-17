import java.util.Scanner;
public class Student_grade {

        static String[] names = {"Ali", "Asha", "Khadar","jihaan","ikraan","c.risaaq","khalid","scumar","Abdiraxman","faiza"};
        static int[] grades = {85, 90, 75,88,66,90,98,55,77,98};

        public static void main(String[] args) {
            int sum = 0, max = grades[0], min = grades[0];
            for (int i = 0; i < grades.length; i++) {
                sum += grades[i];

                if (grades[i] > max) {
                    max = grades[i];
                }

                if (grades[i] < min) {
                    min = grades[i];
                }
            }

            System.out.println("Avg: " + sum / 3.0 + " Max: " + max + " Min: " + min);

            Scanner sc = new Scanner(System.in);
            System.out.print("Search name: ");
            String n = sc.nextLine();
            for (int i = 0; i < 11; i++) {
                if (names[i].equalsIgnoreCase(n)) {
                    System.out.println("Grade: " + grades[i]);
                    return;
                }
            }
            System.out.println("Not found.");

        }
}
