package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.booleanThat;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void isEmpty_Success(){
        TorpedoStore storeNotEmpty = new TorpedoStore(1);
        TorpedoStore storeEmpty = new TorpedoStore(0);
        boolean emptyPositive = storeEmpty.isEmpty();
        boolean emptyNegative = storeNotEmpty.isEmpty();
        assertEquals(true, (emptyNegative == false && emptyPositive == true) );
    }

    @Test
    void getTorpedoCount_Success(){
        TorpedoStore store = new TorpedoStore(5);
        int count = store.getTorpedoCount();
        assertEquals(5, count);
    }

}
