import javax.swing.JOptionPane;

public class AccountCreation {

    private String username;
    private String password;
    private String firstName;
    private String lastName;

    // Constructor
    public AccountCreation(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to validate username
    public boolean validateUsername() {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to validate password
    public boolean validatePassword() {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#\\$%^&*].*");
    }

    // Method to register user
    public void registerUser() {
        if (validateUsername()) {
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return;
        }

        if (validatePassword()) {
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            return;
        }
    }

    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");

        AccountCreation account = new AccountCreation(username, password, firstName, lastName);
        account.registerUser();

        //Login
        Login login = new Login();
    }
    //Login
    Login login = new Login();

    //Add Task
    Task task = new Task();
}