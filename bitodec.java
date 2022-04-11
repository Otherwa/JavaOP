import java.lang.*;
import java.util.*;

public class Prac{

	static void Bi(String x){
	String s = x;
	int res = 0,po = 0;
	for(int i = s.length()-1;i>=0;i--){
	res += Character.getNumericValue(s.charAt(i)) * Math.pow(2,po);
	po++;
	}
	System.out.println("Binary Number: " + res);
	}

	public static void main(String args[]){
	String s = "1000";
	Bi(s);
	}
}
