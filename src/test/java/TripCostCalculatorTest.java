import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalculatorTest {

    @Test
    void testCalculateCost() {
        TripCostCalculator calculator = new TripCostCalculator();
        assertEquals(5.0, calculator.calculateCost(100, 1));
        assertEquals(10.0, calculator.calculateCost(200, 1));
        assertEquals(15.0, calculator.calculateCost(300, 1));
        assertEquals(20.0, calculator.calculateCost(400, 1));
        assertEquals(25.0, calculator.calculateCost(500, 1));
    }

}