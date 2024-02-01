package de.crs.computer.core;

public interface ByteOperator {

    /**
     * Returns the result of a 'bit-wise and' operation on bytes. Write the
     * result in x.
     *
     *   01101100
     * & 10100111
     * = 00100100
     *
     * @param x The first byte.
     * @param y The second byte.
     */
    void and(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise or' operation on bytes. Write the
     * result in x.
     *
     *   01101100
     * | 10100111
     * = 11101111
     *
     * @param x The first byte.
     * @param y The second byte.
     */
    void or(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise xor' operation on bytes. Write the
     * result in x.
     *
     *   01101100
     * ^ 10100111
     * = 11001011
     *
     * @param x The first byte.
     * @param y The second byte.
     */
    void xor(Byte x, Byte y);

    /**
     * Returns the result of a 'bit-wise not' operation on a byte. Write the
     * result in x.
     *
     *  !01101100
     * = 10010011
     * @param x The byte to invert.
     */
    void not(Byte x);
}
