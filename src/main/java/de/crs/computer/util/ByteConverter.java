package de.crs.computer.util;

import de.crs.computer.core.Byte;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ByteConverter {

    public static void fromInt(Byte b, int value) {
        for (int i = 0; i < Byte.SIZE; i++) {
            b.getBit(i).set((value & 1) == 1);
            value >>= 1;
        }
    }

    public static void fromFloat(Byte b, float value) {
        throw new NotImplementedException();
    }

    public static int toUnsignedInt(Byte b) {
        return toInt(b, false);
    }

    public static int toSignedInt(Byte b) {
        return toInt(b, true);
    }

    private static int toInt(Byte b, boolean sign) {
        int result = 0;

        for (int i = 0; i < Byte.SIZE; i++) {
            if (b.getBit(i).get()) {
                if (i + 1 == Byte.SIZE && sign) {
                    result *= -1;
                } else {
                    result += 1 << i;
                }
            }
        }

        return result;
    }

    public static float toFloat(Byte b) {
        throw new NotImplementedException();
    }

    public static String toBinaryString(Byte b) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < Byte.SIZE; i++) {
            builder.insert(0, (b.getBit(i).get() ? '1' : '0'));
        }

        return builder.toString();
    }

    public static String toUnsignedDecString(Byte b) {
        return String.valueOf(toUnsignedInt(b));
    }

    public static String toSignedDecString(Byte b) {
        return String.valueOf(toSignedInt(b));
    }

    public static String toHexString(Byte b) {
        String str = Integer.toHexString(toUnsignedInt(b));

        // always fill up to even number of digits
        if (str.length() % 2 == 1) {
            str = "0" + str;
        }

        return str;
    }
}
