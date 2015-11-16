package recursion;
public class Recursion {
     public static void main(String[] args) {
        for(int k = 99; k>1; k --){
        System.out.println(k + " bottles of milk on the wall, " + k + " bottles of milk, take one down pass it around,");}
        System.out.println("1 more bottle of milk on the wall, 1 more bottle of milk, take on down pass it around,\nNo more bottles of milk on the wall");
        countdown(99);}
    public static void countdown (int n){
    if(n == 1){
    System.out.println("1 more bottle of milk on the wall, 1 more bottle of milk, take on down pass it around,\nNo more bottles of milk on the wall");
    } else {
    System.out.println(n + " bottles of milk on the wall, " + n + " bottles of milk, take one down pass it around,");
    countdown(n-1);}}}