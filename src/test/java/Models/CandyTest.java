package Models;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {




    //10.50,"Skittles",34725,false,20

    @Test
    public void setNameTest() {
        Candy testCandy = new Candy();

        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        testCandy.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testCandy.getName());
    }
    @Test
    public void constructorTest(){

        // (2)
        double expectedPrice = 10.5;
        String expectedName = "Skittles";
        int expectedId = 6;
        boolean expectedHardCandy = false;
        int expectedQty = 10;

        // (3)
        Candy testConstructor = new Candy(expectedPrice,expectedName,expectedId,expectedHardCandy,expectedQty);

        // (4)
        Assertions.assertEquals(expectedPrice, testConstructor.getPrice());
        Assertions.assertEquals(expectedName, testConstructor.getName());
        Assertions.assertEquals(expectedId, testConstructor.getID());
        Assertions.assertEquals(expectedHardCandy, testConstructor.getHardCandy());
        Assertions.assertEquals(expectedQty, testConstructor.getQTY());
    }

}


