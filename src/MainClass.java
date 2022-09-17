import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        System.out.println("It's not my first program in java");
        int firstNumber = 10, secondNumber;
        Scanner scanner = new Scanner(System.in);
        secondNumber = scanner.nextInt();
        System.out.println("Stim a face scadere, a - b = " + (firstNumber + secondNumber));
        boolean logic = true;
        if(!logic)
            System.out.println("Logica este adevarata");
        else
            System.out.println("Logica este gresita");
        double thirdNumber  = !(firstNumber > secondNumber)? 100 : 143;
        int option = 0;
        switch (option){
            case 0 :
                System.out.println("Ai ales optiunea 0");
                break;
            case 1 :
                System.out.println("Ai ales optiunea 1");
                break;
            case 2 :
                System.out.println("Ai ales optiunea 2");
                break;
            default:
                System.out.println("Nu ai ales nici o optiune");
        }
        enumeration(20);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = i * 10 - 4;
        for(int nr : arr)
            System.out.println(nr);
    }
    static boolean toTrue(boolean bool){
        return true;
    }
    static int addition(int a, int b){
        return a + b;
    }
    static void enumeration(int n){
        for(int i = 0; i < n; i++)
            System.out.print(i + " ");
    }
}
