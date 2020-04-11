
public class Main {

    public static void main(String[] args) {
       int number = (int) (Math.random() * 100 + 1);
        
      String result = String.format("Number is %s . Please try again", number);
        System.out.println(result);
    }
}
