package de.crs.computer.core;

public interface Byte {

    int SIZE = 8;

    /**
     * Returns the bit at index i. The value of i should be greater equal 0 and
     * smaller than 8.
     * @param i The index of the bit.
     * @return The bit at the index i.
     */
    Bit get(int i);
}
