package io.fernandes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.fernandes.Item.APPLE;
import static io.fernandes.Item.ORANGE;
import static org.junit.jupiter.api.Assertions.*;

class TillTest {
    @Test
    void shouldBeZeroForEmptyCart() {
        assertEquals(0.0, Till.checkout(List.of()));
    }

    @Test
    void shouldChargeForOneApple() {
        assertEquals(0.6, Till.checkout(List.of(APPLE)));
    }

    @Test
    void shouldChargeForOneOrange() {
        assertEquals(0.25, Till.checkout(List.of(ORANGE)));
    }

    @Test
    void shouldChargeTotalPrice() {
        assertEquals(2.2, Till.checkout(List.of(ORANGE,APPLE,ORANGE,APPLE,ORANGE,ORANGE)));
    }
}