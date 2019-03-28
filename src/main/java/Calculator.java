/*
 * Calculator Class
 * Consists an ArrayList with different Integer Values in it; the Methods: getMaximum (searches the list for the
 * biggest Integer), getMinimum (searches the list for the smallest Integer) and two different sum (calculate the
 * sum of all Integers)
 * Author:      Kevin Guggermaier, Dominik Neubauer
 * Last Change: 28.03.2019
 */

import java.util.*;

public abstract class Calculator {

    public abstract int sum();
    public abstract int sum(int i, int sum);

    public abstract int getMaximum();
    public abstract int getMinimum();

    public abstract void addValue(int i);
}
