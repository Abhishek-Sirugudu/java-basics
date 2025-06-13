public class revString {
    public static void main(String[] args) {
        String input = "Abhishek Sirugudu";
        char chars[] = input.toCharArray();

        System.out.println(input);

      
        int i = 0,j = chars.length-1;
        while(i <= j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

            i++;
            j--;
        }

        String revstr = new String(chars);

        System.out.println(revstr);
    }
}
