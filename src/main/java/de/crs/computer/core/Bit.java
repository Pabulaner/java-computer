package de.crs.computer.core;

public interface Bit {

    /**
     * Get if the bit is zero (false) or one (true).
     *
     * @return The value of the bit.
     */
    boolean get();

    /**
     * Set the value of the bit to zero (false) or one (true).
     *
     * @param value The new value of the bit.
     */
    void set(boolean value);
}
