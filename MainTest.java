import org.Wu.Address;
import org.Wu.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {
        @Test
        @DisplayName("Valid postal code returns true")
        void testValidPostalCode() {
            boolean result = Address.isPostalCodeValid("A1B2C3");
            Assertions.assertTrue(result);
        }

        @Test
        @DisplayName("Postal code with wrong length returns false")
        void testInvalidPostalCodeLength() {
            boolean result = Address.isPostalCodeValid("A1B2");
            Assertions.assertFalse(result);
        }

        @Test
        @DisplayName("Postal code with wrong format returns false")
        void testInvalidPostalCodeFormat() {
            boolean result = Address.isPostalCodeValid("123456");
            Assertions.assertFalse(result);
        }

        @Test
        @DisplayName("Valid department name returns true")
        void testValidDepartmentName() {
            boolean result = Department.isDepartmentNameValid("Computer Science");
            Assertions.assertTrue(result);
        }

        @Test
        @DisplayName("Department name with numbers returns false")
        void testInvalidDepartmentNameWithNumbers() {
            boolean result = Department.isDepartmentNameValid("CS101");
            Assertions.assertFalse(result);
        }

        @Test
        @DisplayName("Null department name returns false")
        void testNullDepartmentName() {
            boolean result = Department.isDepartmentNameValid(null);
            Assertions.assertFalse(result);
    }
}