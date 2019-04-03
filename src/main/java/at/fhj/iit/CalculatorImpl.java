package at.fhj.iit;
import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl extends Calculator{

    List<Integer> list = new ArrayList();
    
    public int sum (int i, int sum){
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
