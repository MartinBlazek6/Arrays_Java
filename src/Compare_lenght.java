import java.util.Arrays;

public class Compare_lenght {
    public static void main(String[] args){
// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
// - Otherwise print: "firstArrayOfNumbers is the longer one"
        int [] firstArrayOfNumbers = {1,2,3};
        int [] secondArrayOfNumbers = {4,5};
        int a = firstArrayOfNumbers.length;
        int b = secondArrayOfNumbers.length;
        if (a>b){ System.out.println("First array is longer");}
        else {System.out.println("Secound array is longer");}
    }
}
