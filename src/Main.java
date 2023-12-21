import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Stack<Integer> temp = new Stack<>();
        System.out.println("\n------Integer Array---------");
        System.out.print("Before intArray: ");
        for (int j : intArray) {
            temp.push(j);
            System.out.print(j + " ");
        }
        System.out.println("\n---------------------");
        System.out.print("After intArray: ");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = temp.pop();
            System.out.print(intArray[i] + " ");
        }

        System.out.println("\n------String Array---------");
        String str = "CodeGym";
        String[] mWord = str.split("");
        Stack<String> wStack = new Stack<>();
        System.out.print("Before mWord: ");
        for (String j : mWord) {
            wStack.push(j);
            System.out.print(j + " ");
        }
        System.out.print(" - " + str);
        System.out.println("\n---------------------");
        System.out.print("After mWord: ");
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
            System.out.print(mWord[i] + " ");
        }
        str = String.join("", mWord);
        System.out.println(" - " + str );
    }
}
