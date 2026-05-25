import org.junit.Test;
import static org.junit.Assert.*;

public class FullAppTest {

    //Registration: Username tests
    @Test
    public void testValidUsername() {
        registration reg = new registration ();
        assertTrue(reg.checkUsername("abc_")); // valid: <= 5 chars and contains "_"
    }

    @Test
    public void testInvalidUsernameTooLong() {
        registration reg = new registration();
        assertFalse(reg.checkUsername("abcdef_")); // too long
    }

    @Test
    public void testInvalidUsernameNoUnderscore() {
        registration reg = new registration();
        assertFalse(reg.checkUsername("abcd")); // missing "_"
    }

    //Registration: Password tests

    @Test
    public void testValidPassword() {
        registration reg = new registration();
        assertTrue(reg.checkPassword("Password!")); // has uppercase, digit, special
    }

    @Test
    public void testInValidPasswordTooShort(){
        registration reg = new registration();
        assertFalse(reg.checkPassword("PW1!")); // too short
    }

    @Test
    public void testInValidNoUppercase(){
        registration reg = new registration();
        assertFalse(reg.checkPassword("password1!")); // no uppercase
    }

    @Test
    public void testInvalidPasswordNoDigit(){
        registration reg = new registration();
        assertFalse(reg.checkPassword("Password!")); // missing digit
    }

    @Test
    public void testInValidPasswordNoSpecialChar(){
        registration reg = new registration();
        assertFalse(reg.checkPassword("Password1")); // missing special char
    }

    // Registration: Phone number tests

    @Test
    public void testInValidPhoneNumberLocal(){
        registration reg = new registration();
        assertTrue(reg.checkPhoneNumber("0123456789")); // starts with 0 + 9 digits
    }

    @Test
    public void testValidPhoneNumberInternational() {
        registration reg = new registration();
        assertTrue(reg.checkPhoneNumber("+27123456789")); // starts with +27 + 9 digits
    }

    @Test
    public void testValidPhoneNumberTooShort(){
        registration reg = new registration();
        assertFalse(reg.checkPhoneNumber("12345")); // too short
    }

    @Test
    public void testInValidPhoneNumberWrongPrefix(){
        registration reg = new registration();
        assertFalse(reg.checkPhoneNumber("9912345678")); // wrong prefix
    }

    // Login: Successful login

    @Test
    public void testSuccessfulLogin() {
        Login login = new Login("user123", "pass123", "Jawaad", "Ganief");
        String result = login.loginUser("user123", "pass123");
        assertTrue(result.startsWith("Jawaad Ganief"));
    }

    // Login: Failed Login

    @Test
    public void testFailedLogin() {
        Login login = new Login("user123", "pass123", "Jawaad", "Ganief");
        String result = login.loginUser("wrongUser", "wrongPass");
        assertEquals("Username or Password incorrect.Please try again.",result);
    }
}
