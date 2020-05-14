package exercisesPodypl.chapter_1;


public class Ex1_3_AverageGrade {
    public static void main(String[] args) {

        int[] marks = {4,5,5,3,2};
        System.out.println(average(marks));
    }

    public static double average(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / (double) marks.length;
    }
}
