package de.crs.computer.core;

public interface ByteOperator {

    /**
     * Returns the result of a 'bit-wise and' operation on bytes.
     *   01101100
     * & 10100111
     * = 00100100
     * @param x The first byte.
     * @param y The second byte.
     * @return The result of x and y.
     */
    Byte and(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise or' operation on bytes.
     *   01101100
     * | 10100111
     * = 11101111
     * @param x The first byte.
     * @param y The second byte.
     * @return The result of x or y.
     */
    Byte or(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise xor' operation on bytes.
     *   01101100
     * ^ 10100111
     * = 11001011
     * @param x The first byte.
     * @param y The second byte.
     * @return The result of x xor y.
     */
    Byte xor(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise not' operation on a byte.
     *  !01101100
     * = 10010011
     * @param x The byte to invert.
     * @return The result of not x.
     */
    Byte not(Byte x);
}
