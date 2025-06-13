public class PalindromeString {
    public static char[] rev(char a[]){
        int i = 0,j= a.length-1;

        while(i <= j){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }
    public static void main(String[] args) {

        String word = "mdam";

        char a[] = word.toCharArray();

        String rev = new String(rev(a));

        System.out.println(word.equals(rev));


    }
