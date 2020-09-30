package projects.email;

public class EmailMain {
    public static void main(String[] args) {
        EmailApp email  = new EmailApp("Anna", "Kowalska");

//        email.setOtherEmail("amk@mgmail.com");
//        System.out.println(email.getOtherEmail());

        System.out.println(email.showInformation());
    }
}
