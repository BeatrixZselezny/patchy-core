package io.github.beatrixszelezny.patchy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AuditBridgeTest {
    @Test
    void testAuditLogging() {
        assertDoesNotThrow(() -> AuditBridge.log("Tesztüzenet Patchy-től"));
    }
}

