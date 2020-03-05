public class FizzBuzzTest{

    public static void main(String[] args) {
        FizzBuzz input = new FizzBuzz();
        String output = input.printFizzBuzz(3);
        System.out.println("input 3 " + output);
        String output1 = input.printFizzBuzz(15);
        System.out.println("input 15 " + output1);
        String output2 = input.printFizzBuzz(5);
        System.out.println("input 5 " + output2);
        String output3 = input.printFizzBuzz(2);
        System.out.println("input 2 " + output3);
    }
}