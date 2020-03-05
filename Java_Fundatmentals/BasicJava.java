import java.util.ArrayList;
public class BasicJava{

    public void print1To255(){
        for (int i=0; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void printAllOdds(){
        for (int i=1; i <= 255; i= i+2){
            System.out.println(i);
        }
    }

    public void printSum(){
        int sum = 0;
        for (int i = 0; i <= 255; i++){
            sum += i;
            System.out.println("New number: "+i+" "+ "Sum: " +sum);
        }
    }

    public void printArray(int[] myArray){
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public void printMax(int[] myArray){
        int max = myArray[0];
        for (int i=1; i < myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Max number in an array is : " +max);
    }

    public void printAverage(int[] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        System.out.println("Average of an array is : "+(sum / myArray.length));
    }

    public void oddArray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=1; i <= 255; i += 2){
            y.add(i);
        }
        System.out.println("Array of all odds: "+y);
    }

    public void squareArr(int[] myArray){
        ArrayList<Integer> sqArr= new ArrayList<Integer>();
        for (int i =0; i < myArray.length ; i++){
             int sq = myArray[i] * myArray[i];
            sqArr.add(sq);
        }
        System.out.println("Squared Array: "+ sqArr);
    }

    public void eliminateNegative(int[] myArray){
        ArrayList<Integer> negArr= new ArrayList<Integer>();
        for(int i=0; i <myArray.length; i++){
            if (myArray[i] < 0){
                myArray[i] = 0;
            }
            negArr.add(myArray[i]);
        }
        System.out.println(negArr);
    }

    public void maxMinAvg(int[] myArray){
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=1; i< myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
            if(myArray[i] < min){
                min = myArray[i];
            }
            sum += myArray[i];
        }
        newArr.add(max);
        newArr.add(min);
        newArr.add(sum/myArray.length);
        System.out.println("Max Min and Avg: "+newArr);
    }

    public void shiftArr(int[] myArray) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i=0; i< myArray.length; i++){
            if(i == myArray.length-1){
                newArr.add(0);
            } else{
                newArr.add(myArray[i+1]);
            }
        }
        System.out.println("Shifted array: "+newArr);

    }

}