import java.util.ArrayList;
import java.util.Scanner;

public class GradesArrayList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<Integer> hours = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Character> grades = new ArrayList<>();
        int number = 1;
        String course;

        while(true) {
            System.out.printf("Enter course %d name or 'q' to quit:\n", number);
            course = console.nextLine();
            if (course.equalsIgnoreCase("q")) {
                break;
            }
            courses.add(course);
            System.out.printf("Enter course %d credit hours:\n", number);
            hours.add(Integer.parseInt(console.nextLine()));
            System.out.printf("Enter course %d score:\n", number);
            scores.add(Integer.parseInt(console.nextLine()));
            System.out.println();
            number++;
        }

        for (int score : scores) {
            if (score >= 90) {
                grades.add('A');
            } else if (score >= 80) {
                grades.add('B');
            } else if (score >= 70) {
                grades.add('C');
            } else if (score >= 60) {
                grades.add('D');
            } else {
                grades.add('F');
            }
        }

        System.out.printf("\n%-7s %-5s %-5s %-6s\n",
                "Course", "Hours", "Score", "Grade");
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n",
                    courses.get(i), hours.get(i), scores.get(i), grades.get(i));
        }
    }
}

