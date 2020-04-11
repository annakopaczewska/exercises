import doc.User;

public class setterygettery {

    public static void main(String[] args) {
        User user = new User(1l, "admin", "admin", "admin@example.com");
        System.out.println("User id: " + user.getId() + ", user login: " + user.getLogin());
        user.setLogin("nowy-admin");
        user.setPassword("admin-password");
        user.setEmail("updated-email@email.com");


        System.out.println("User id: " + user.getId() + ", user login: " + user.getLogin() + ", user email: "+user.getEmail() + ", user password: "+user.getPassword());

    }

}
