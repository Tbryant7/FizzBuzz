public class FizzBuzz{
public static void main(String[] args){
    for(int i=1; i<101; i++){

        // We want the Fizz Buzz case to come first so that we don't accidentally print Fizz when it should be Fizz Buzz
        // (It's good to put the most specific case first.)
        if(i % 5 == 0 && i % 3 == 0){
            System.out.println("Fizz Buzz");
        }
        // After that, Fizz or Buzz could come next.
        else if(i % 3 == 0){
            System.out.println("Fizz");
        }
        else if(i % 5 == 0){
            System.out.println("Buzz");
        }
        // Our else case is for when we just print the number.
        else{
            System.out.println(i);
        }
    }
}
}