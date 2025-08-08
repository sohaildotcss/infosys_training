public class practise {
    static void passwordValidation() {
        String password = "123afrdesfdsB@";
        if (password.length() >= 8 && password.contains("@")) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid password");
        }
    }

    static void emailIdExtraction() {
        String emailId = "sohaildotcss@gmail.com";
        String username = emailId.substring(0, emailId.indexOf("@gmail.com"));
        System.out.println(username);
    }

    public static void main(String[] args) {
        passwordValidation();
        emailIdExtraction();
    }
}