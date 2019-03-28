/*
 * Calculator Class
 * Consists an ArrayList with different Integer Values in it; the Methods: getMaximum (searches the list for the
 * biggest Integer), getMinimum (searches the list for the smallest Integer) and two different sum (calculate the
 * sum of all Integers)
 * Author:      Kevin Guggermaier, Dominik Neubauer
 * Last Change: 28.03.2019
 */

import java.util.*;

public class Calculator {
    List<Integer> list = new ArrayList();

    public int sum(int i, int sum){
        if(i == list.size())
            return sum;
        else{
            return sum + sum(i+1, list.get(i));
        }
    }

    public int sum() {
        int sum=0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public int getMaximum(){
        int max = 0;
        for(int i = 0; i < list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public int getMinimum(){
        int min = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }

    public void addValue(int i){
        list.add(i);
    }
}
