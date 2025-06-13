import java.util.Scanner;

public class Countvowels {
    public static int vowelCounter(String a){
        char[] arr = a.toCharArray();

        int vc= 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o'  || arr[i] == 'u'){
                vc++;
            }
        }
        return vc;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String input = s.nextLine();
        System.out.println("Total noof vowels in "+input+" = "+vowelCounter(input));
        
        
        String a = "abhjklmnou";
        System.out.println(vowelCounter(a));
        
        
    }
}
