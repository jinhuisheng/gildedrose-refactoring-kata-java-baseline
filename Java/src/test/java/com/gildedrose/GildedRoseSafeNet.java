package com.gildedrose;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

import static com.google.common.io.Files.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseSafeNet {
    @Test
    void should_be_same_with_baseline() throws IOException {
        assertEquals(TexttestFixture.getBaseLine(), new String(toByteArray(new File("src/test/baseline.txt"))));
    }
}
