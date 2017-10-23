package knotten;
import java.util.Scanner;
public class Exercise3 {
    public static int triangle(int num){
	if (num <= 1){
	    return num;
	}else{
	    return (num * (num + 1))/2;
	}
    }

    public static int lazy(int num){
	return ((num * num) + num + 2)/2;
    }

    
    public static void main(String[] args){
	if (args.length == 0){
	    System.err.println("Please enter something.");
	    System.exit(1);
	}else{
	    try {
		int n = Integer.parseInt(args[0]);
		System.out.println("Tri("+n+") = " + triangle(n));
		System.out.println("Lazy("+n+") = " + lazy(n));
	    } catch (NumberFormatException e) {
		System.err.println("Input must be one integer.");
		System.exit(1);
	    }
	}
    }
}


