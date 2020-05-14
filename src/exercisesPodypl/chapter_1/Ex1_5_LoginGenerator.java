package exercisesPodypl.chapter_1;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Ex1_5_LoginGenerator {
    public static void main(String[] args) {

        List<String> studentNames = generateLogins(new String[]{"Kopaczewska Anna",
                "Budynek Piotr",
                "Szkieletor Andrzej",
                "Wiezowiec Janina"});
        System.out.println(studentNames);

    }

    public static List<String> generateLogins(String[] names) {
        List<String> studentNames = new ArrayList<>();
        for (String list : names) {
            String lowerCase = list.toLowerCase();
            String loginSurname = lowerCase.substring(0, 2);
            String[] loginName = lowerCase.split(" ");
            String allName = loginName[1].substring(0, 3);
            System.out.println(allName + loginSurname + "@student.agh.edu.pl");
        }
        return studentNames;
    }
}