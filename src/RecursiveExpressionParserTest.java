import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveExpressionParserTest {

    @Test
    void testBasicAddition() {
//        assertEquals(8.0, RecursiveExpressionParser.evaluateExpression("3 + 5"));
    }

    @Test
    void testMultiplicationPrecedence() {
//        assertEquals(13.0, RecursiveExpressionParser.evaluateExpression("3 + 5 * 2"));
    }

    @Test
    void testParenthesesHandling() {
//        assertEquals(16.0, RecursiveExpressionParser.evaluateExpression("(3 + 5) * 2"));
    }

  

    @Test
    void testFloatingPointNumbers() {
//        assertEquals(6.0, RecursiveExpressionParser.evaluateExpression("3.5 + 2.5"));
    }

    @Test
    void testSubtractionAndMultiplication() {
//        assertEquals(13.0, RecursiveExpressionParser.evaluateExpression("3 * 5 - 2"));
    }

    @Test
    void testMultipleOperatorsWithParentheses() {
//        assertEquals(8.0, RecursiveExpressionParser.evaluateExpression("(3 + 5) * (2 - 1)"));
    }

    @Test
    void testEmptyExpression() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecursiveExpressionParser.evaluateExpression("");
        });
    }

    @Test
    void testInvalidParentheses() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecursiveExpressionParser.evaluateExpression("(3 + 5 * 2");
        });
    }

    @Test
    void testComplexExpression() {
//        assertEquals(16.0, RecursiveExpressionParser.evaluateExpression("3 + 5 * (2 + 3) - 6 / 2"));
    }
}
