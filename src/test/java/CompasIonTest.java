import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompasIonTest {

    @Test
    void rotate() {
        assertAll(
                ()-> assertEquals(Compass.Point.EAST, CompasIon.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT)),
                ()-> assertEquals(Compass.Point.SOUTH, CompasIon.rotate(Compass.Point.EAST, Compass.Direction.RIGHT)),
                ()-> assertEquals(Compass.Point.WEST, CompasIon.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT)),
                ()-> assertEquals(Compass.Point.NORTH, CompasIon.rotate(Compass.Point.WEST, Compass.Direction.RIGHT)),
                ()-> assertEquals(Compass.Point.WEST, CompasIon.rotate(Compass.Point.NORTH, Compass.Direction.LEFT)),
                ()-> assertEquals(Compass.Point.NORTH, CompasIon.rotate(Compass.Point.EAST, Compass.Direction.LEFT)),
                ()-> assertEquals(Compass.Point.EAST, CompasIon.rotate(Compass.Point.SOUTH, Compass.Direction.LEFT)),
                ()-> assertEquals(Compass.Point.SOUTH, CompasIon.rotate(Compass.Point.WEST, Compass.Direction.LEFT))
        );
    }
}