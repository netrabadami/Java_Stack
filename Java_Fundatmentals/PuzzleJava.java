import java.util.ArrayList;import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava{

    public static ArrayList<Integer> sumAndGreaterThan(int[] myArray){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
            if (myArray[i] > 10){
                newArr.add(myArray[i]);
            }
        }
        System.out.println("Sum: "+sum);
        return newArr;
    }

    public void shuffleArr(String[] arr){
        ArrayList<String> newArr = new ArrayList<String>();
        ArrayList<String> newArr5 = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length() > 5){
                newArr5.add(arr[i]);
            }
            newArr.add(arr[i]);
        }
        Collections.shuffle(newArr);
        System.out.println(newArr);
        System.out.println(newArr5);
    }

    public void alphabets(){
        ArrayList<String> alphaArr = new ArrayList<String>();
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){
            alphaArr.add(Character.toString(alpha));
        }
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);
        System.out.println("Last letter: "+alphaArr.get(25));
        System.out.println("First letter: "+alphaArr.get(0));
        //String vowels = "AEIOU";
        if ("AEIOU".indexOf(alphaArr.get(0))>0){
            System.out.println("Alphabet is an vowel");
        }
    }

    public void randonNum(){
        ArrayList<Integer> randonArr = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            Random r = new Random();
            int low = 55;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            randonArr.add(result);
        }
        System.out.println(randonArr);
    }
    public void sortRandonArr(){
        ArrayList<Integer> randonArr = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            Random r = new Random();
            int low = 55;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            randonArr.add(result);
        }
        System.out.println("Before Sort: "+randonArr);
        Collections.sort(randonArr);
        System.out.println("After Sort: "+randonArr);
        int min = randonArr.get(0);
        int max = randonArr.get(9);
        System.out.println("Max: "+min+" Max: "+max);
    }

    public void randomStr(){
        String strSeq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder strBldr = new StringBuilder();
        Random rand = new Random();
        for (int i=0; i <= 5; i++){
            strBldr.append(strSeq.charAt(rand.nextInt(strSeq.length())));
        }
        String randomString = strBldr.toString();
        System.out.println(randomString);
        // System.out.println("sefjfb "+rand.nextInt(strSeq.length()));
        // System.out.println("seq lenght "+strSeq.length());
        // System.out.println("strseq "+strSeq.charAt(4));
    }

    public void randomStrArr(){
        ArrayList<String> ranStrArr = new ArrayList<String>();
        String strSeq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder strBldr = new StringBuilder();
        Random rand = new Random();
        for (int j=0; j<10; j++){
            for (int i=0; i <= 5; i++){
                strBldr.append(strSeq.charAt(rand.nextInt(strSeq.length())));
                
            }
            String randomString = strBldr.toString();
            ranStrArr.add(randomString);
            strBldr.setLength(0);
            
        }
        System.out.println(ranStrArr);
    }
}

