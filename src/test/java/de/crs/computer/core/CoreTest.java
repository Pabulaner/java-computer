package de.crs.computer.core;

import de.crs.computer.util.ByteConverter;
import junit.framework.TestCase;

public class CoreTest extends TestCase {

    public void testBit() {
        Bit bit = null;

        assertFalse(bit.get());
        bit.set(true);
        assertTrue(bit.get());
        bit.set(false);
        assertFalse(bit.get());
    }

    public void testByte() {
        Byte b = null;

        for (int i = 0; i < Byte.SIZE; i++) {
            assertFalse(b.get(i).get());
            b.get(i).set(true);
            assertTrue(b.get(i).get());
            b.get(i).set(false);
            assertFalse(b.get(i).get());
        }
    }

    public void testByteOperator() {
        ByteOperator op = null;
        Byte a = null;
        Byte b = null;

        int x = 0xaf;
        int y = 0x61;

        ByteConverter.fromInt(a, x);
        ByteConverter.fromInt(b, y);

        assertEquals(ByteConverter.toUnsignedInt(op.and(a, b)), x & y);
        assertEquals(ByteConverter.toUnsignedInt(op.or(a, b)), x | y);
        assertEquals(ByteConverter.toUnsignedInt(op.xor(a, b)), x ^ y);
        assertEquals(ByteConverter.toUnsignedInt(op.not(a)), x ^ 0xff);
    }
}
