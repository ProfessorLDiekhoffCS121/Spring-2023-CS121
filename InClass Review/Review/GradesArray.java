import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of courses:");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        String[] courses = new String[num];
        int[] hours = new int[num];
        int[] scores = new int[num];
        char[] grades = new char[num];

        for (int i = 0; i < courses.length; i++) {
            int j = i + 1;
            System.out.printf("Enter course %d name:\n", j);
            courses[i] = console.nextLine();
            System.out.printf("Enter course %d credit hours:\n", j);
            hours[i] = Integer.parseInt(console.nextLine());
            System.out.printf("Enter course %d score:\n", j);
            scores[i] = Integer.parseInt(console.nextLine());
            System.out.println();
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    courses[i], hours[i], scores [i], grades[i]);
        }
    }
}
