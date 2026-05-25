import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class QuickChatApp {

        // Registration: Username tests

        @Test
        public void testUsernameCorrectlyFormatted() {
            registration reg = new registration();
            assertTrue(reg.checkUsername("kyl_1")); // valid <= 5 chars and contains "_"
        }

        @Test
        public void testUsernameIncorrectlyFormatted() {
            registration reg = new registration();
            assertFalse(reg.checkUsername("kyle!!!!!!")); // too long
        }

        // Registration: Password tests

        @Test
        public void testPasswordMeetsComplexity() {
            registration reg = new registration();
            assertTrue(reg.checkPassword("Ch&&sec@ke99!")); // has Uppercase, digit, special
        }

        // Registration: Phone Number tests

        @Test
        public void testCellPhoneCorrectFormat() {
            registration reg = new registration();
            assertTrue(reg.checkPhoneNumber("+27838968976")); // contains +27 + 9 digits
        }

        @Test
        public void testCellPhoneIncorrectlyFormat() {
            registration reg = null;
            assertFalse(reg.checkPhoneNumber("08966533")); // does not contain +27
        }

        // Login: successful login

        @Test
        public void testSuccessfulLogin(){
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "Jawaad", "Ganief");
        }

        // Login: Failed Login

        @Test
        public void testFailedLogin() {
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "Jawaad", "Ganief");
            String result = login.loginUser("wronguser", "wrong pass");
            assertEquals("Username or Password incorrect. Please try again!!", result);
        }

        @Test
        public void testFailedLoginFalse(){
            Login login = new Login("kyl_1", "Ch&&sec@ke99!", "Jawaad", "Ganief");
            String result = login.loginUser("wrong user", "wrong pass!");
            assertFalse(result.startsWith("Username or password incorrect. Please try again!!"));
        }
    }