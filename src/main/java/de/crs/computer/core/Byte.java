package de.crs.computer.core;

public interface Byte {

    /**
     * Defines the size of one byte, typically 8.
     */
    int SIZE = 8;

    /**
     * Returns the bit at index i. The value of i should be greater equal 0 and
     * smaller than Byte.SIZE.
     *
     * @param i The index of the bit.
     * @return The bit at the index i.
     */
    Bit getBit(int i);
}
