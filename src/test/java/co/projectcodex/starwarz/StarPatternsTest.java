package co.projectcodex.starwarz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static co.projectcodex.starwarz.StarPatterns.*;

public class StarPatternsTest {

    @Test
    public void testLine4() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        line(4);

        String result = "* * * * ";
        assertEquals(result, outContent.toString());
    }

    @Test
    public void testLine7() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        line(7);

        String result = "* * * * * * * ";
        assertEquals(result, outContent.toString());
    }

    @Test
    public void testSquare4() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        squareStars(4);

        String result = "* * * * \n" +
                        "* * * * \n" +
                        "* * * * \n" +
                        "* * * * \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testSquare7() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        squareStars(7);

        String result =
                "* * * * * * * \n" +
                "* * * * * * * \n" +
                "* * * * * * * \n" +
                "* * * * * * * \n" +
                "* * * * * * * \n" +
                "* * * * * * * \n" +
                "* * * * * * * \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testTopBaseTriangle3() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangleTopBase(3);

        String result =
                "* * * \n" +
                "* * \n" +
                "* \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testTopBaseTriangle7() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangleTopBase(7);

        String result =
                "* * * * * * * \n" +
                "* * * * * * \n" +
                "* * * * * \n" +
                "* * * * \n" +
                "* * * \n" +
                "* * \n" +
                "* \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testBottomBaseTriangle3() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangleBottomBase(3);

        String result =
                "* \n" +
                "* * \n" +
                "* * * \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testBottomBaseTriangle7() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        triangleBottomBase(7);

        String result =
                "* \n" +
                "* * \n" +
                "* * * \n" +
                "* * * * \n" +
                "* * * * * \n" +
                "* * * * * * \n" +
                "* * * * * * * \n";

        assertEquals(result, outContent.toString());

    }

    @Test
    public void testEmptySquare3() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        emptySquare(3);

        String result =
                "* * * \n" +
                "*   * \n" +
                "* * * \n";

        assertEquals(result, outContent.toString());
    }

    @Test
    public void testEmptySquare7() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        emptySquare(7);

        String result =
                "* * * * * * * \n" +
                "*           * \n" +
                "*           * \n" +
                "*           * \n" +
                "*           * \n" +
                "*           * \n" +
                "* * * * * * * \n";

        assertEquals(result, outContent.toString());
    }

    @Test
    public void testDiamond() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        diamond(5);
        String result =
                        "    *     \n" +
                        "  * * *   \n" +
                        "* * * * * \n";

        assertEquals(result, outContent.toString());
    }


}
