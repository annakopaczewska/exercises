package exercisesPodypl;

public class ConvertSeconds {

    public static void main(String[] args) {

        int seconds = 9001;
        int s1 = seconds / 60; // minutes
        int s2 = seconds % 60; // seconds
        int s3 = s1 % 60; // hours
        s1 = s1 / 60;

        System.out.println(s1 + ":" + s3 + ":" + s2);
    }
}
