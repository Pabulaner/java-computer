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
        ByteFactory factory = null;
        ByteOperator op = null;

        int x = 0xaf;
        int y = 0x61;

        Byte a;
        Byte b = factory.create(y);

        a = factory.create(x);
        op.and(a, b);
        assertEquals(ByteConverter.toUnsignedInt(a), x & y);
        assertEquals(ByteConverter.toUnsignedInt(b), y);

        a = factory.create(x);
        op.or(a, b);
        assertEquals(ByteConverter.toUnsignedInt(a), x | y);
        assertEquals(ByteConverter.toUnsignedInt(b), y);

        a = factory.create(x);
        op.xor(a, b);
        assertEquals(ByteConverter.toUnsignedInt(a), x ^ y);
        assertEquals(ByteConverter.toUnsignedInt(b), y);

        a = factory.create(x);
        op.not(a);
        assertEquals(ByteConverter.toUnsignedInt(a), x ^ 0xff);
    }
}
