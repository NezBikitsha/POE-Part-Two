import javax.swing.JOptionPane;

public class Login {

        private String username;
        private String password;
        private String firstName;
        private String lastName;

        // Constructor
        public Login(String username, String password, String firstName, String lastName) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
        }

    public Login() {

    }

    // Method to check username
        public boolean checkUserName() {
            return username.contains("_") && username.length() <= 5;
        }

        // Method to check password complexity
        public boolean checkPasswordComplexity() {
            return password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[0-9].*") &&
                    password.matches(".*[!@#\\$%^&*].*");
        }

        // Method to register user
        public String registerUser() {
            if (!checkUserName()) {
                return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
            }

            if (!checkPasswordComplexity()) {
                return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
            }

            return "User registered successfully";
        }

        // Method to verify login details
        public boolean loginUser(String inputUsername, String inputPassword) {
            return this.username.equals(inputUsername) && this.password.equals(inputPassword);
        }

        // Method to return login status message
        public String returnLoginStatus(String inputUsername, String inputPassword) {
            if (loginUser(inputUsername, inputPassword)) {
                return "Welcome " + firstName + ", " + lastName + ", it is great to see you again.";
            } else {
                return "Username or password incorrect, please try again.";
            }
        }

        // Main method for running the program
        public void main(String[] args) {
            String username = JOptionPane.showInputDialog("Enter username:");
            String password = JOptionPane.showInputDialog("Enter password:");
            String firstName = JOptionPane.showInputDialog("Enter first name:");
            String lastName = JOptionPane.showInputDialog("Enter last name:");

            Login login = new Login(username, password, firstName, lastName);

            String registrationMessage = login.registerUser();
            JOptionPane.showMessageDialog(null, registrationMessage);

            if (registrationMessage.equals("User registered successfully")) {
                String inputUsername = JOptionPane.showInputDialog("Enter username to login:");
                String inputPassword = JOptionPane.showInputDialog("Enter password to login:");

                String loginStatus = login.returnLoginStatus(inputUsername, inputPassword);
                JOptionPane.showMessageDialog(null, loginStatus);
            }
        }
    }
