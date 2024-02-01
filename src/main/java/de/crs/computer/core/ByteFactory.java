package de.crs.computer.core;

public interface ByteFactory {

    /**
     * Create a new byte set to the initial value.
     *
     * @param value The value of the created byte.
     * @return The new created byte.
     */
    Byte create(int value);
}
