import java.util.*;

public class Calculator {
    List<Integer> list = new ArrayList();
    /**
     * Student 1
     * Student 2+
     * Student 3 (OPTIONAL)
     *
     * TODO Instruction for GIT Lab for Grading GIT Part of Configuration Management
     *  - copy content of this git repository / zip file
     *
     *	- create your own remote repository, take care about Project Layout (!)
     *
     *  (! Student 1 !)
     *  - create Main Class with 'public static void main(String[] args)'
     *	- create empty getMinimum()
     *	- create empty getMaximum()
     *	- create addValue() which add an Integer to a list for later usage in getMinimum(), getMaximum() and other Methods
     *
     *  => publish current skeleton for your colleague(s) in remote repository
     *
     *
     *  (! Student 1 !)
     *  - implement getMinimum() which returns lowest Integer
     *	- test your method in main()
     *
     *  => publish current implementation for your colleague(s) in remote repository
     *
     *
     *  (! Student 2 !)
     *  - implement getMaximum() which returns highest Integer
     *	- test your method in main()
     *
     *  => publish current implementation for your colleague(s) in remote repository
     *
     *
     * (! all Students !)
     *  - implement a sum() which returns the sum of all Integer Values added by add()
     *	- implement this method with different implementations
     *	- commit your changes
     *	- if every Student has finished with commit, start to push your implementation
     *	- if every implementation has been pushed to remote, tag final implementation with "FinalVersion"
     *
     *
     * FINAL ASSIGNMENT
     *  - don't forget to push everything (!)
     *	  AND final version includes
     *		- runnable source code
     *		- with test call methods in main Class
     *		- before commit take care that you previously tested your own source code
     * - finish your assignment at elearning website with publishing repository url
     *
     *
     * REMEMBER Git commands:
     *
     *   											<- Clone (FROM REMOTE)
     *   				<- Checkout (From LOCAL)
     *   -> (add) 		-> Commit (TO LOCAL) 		-> Push (TO REMOTE)
     *   					  		(LOCAL)			<- Pull (FROM REMOTE)
     *
     *
     */
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
