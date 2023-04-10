package saikot_basic_practice;

public class Sk_Values {
	// How do you verify the expected value
	// By java if else condition

	public static void main(String[] args) {
		// Saikot want sale more than $275
		// Saikot want buy less than $275
		
	int evPrice =-599;
	
	if (evPrice > 275) {
		System.out.println("Saikot sales his car");
		}
	else if (evPrice < 275) {
		System.out.println("Saikot buy his car");
	}
	else if (evPrice == 275) {
		System.out.println("Saikot want to sale his car by buying price");
		}
	else {
		System.out.println("Didn't buy or sale any car");
		
	}
	
	}

}
