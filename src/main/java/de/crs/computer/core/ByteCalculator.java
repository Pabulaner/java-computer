package de.crs.computer.core;

public interface ByteCalculator {

    /**
     * Add two bytes together. Write the result in x.
     * @param x The first byte.
     * @param y The second byte.
     */
    void add(Byte x, Byte y);

    /**
     * Subtract two bytes by making use of the two's complement method. Write the
     * result in x.
     * @param x The first byte.
     * @param y The second byte.
     */
    void sub(Byte x, Byte y);

    /**
     * Multiply two bytes together. Write the result in x.
     * @param x The first byte.
     * @param y The second byte.
     */
    void mul(Byte x, Byte y);

    /**
     * Divide two bytes. Write the result in x.
     * @param x The first byte.
     * @param y The second byte.
     */
    void div(Byte x, Byte y);

    /**
     * Negate the byte by using the two's complement method. With this method
     * the minus sign is represented by a one as the most significant bit.
     *
     * So 10000000, 10100111, 10111111 are negative, while 00010100, 00000010
     * would be positive.
     *
     * The two's complement method involves two steps:
     *
     * 1. Invert all bits.
     * 2. Add one to the result.
     *
     * So for getting the negative representation of 6 the following is done:
     * 6 = 00000110
     *
     * 1. Invert:  11111001
     * 2. Add one: 11111010
     *
     * -6 = 11111010
     *
     * @param x The byte to negate.
     */
    void negate(Byte x);
}
