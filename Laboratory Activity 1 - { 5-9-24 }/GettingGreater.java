import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Getting the greater Value");
        System.out.print("Enter the first character: ");
        char first = input.next().charAt (0);
        System.out.print("Enter the second character: ");
        char second = input.next().charAt (0);
        
        int ch1 = first;
        int ch2 = second;
        int greaternum = Math.max(first,second);
        System.out.println("-----------------------------");
        System.out.print("The character with greater value is: ");
        if (ch1 > ch2){
            System.out.println(first);
        } else {
            System.out.println(second);
        }
        System.out.println("-----------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(first + ": " + ch1);
        System.out.print(second + ": " + ch2);
        
    }
}
