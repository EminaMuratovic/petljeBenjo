package petljeBenjo;

public class VjezbaDva {
	public static void main(String[] args) {
		int faktorijel=1;
		System.out.println("Unesite broj: ");
		int broj=TextIO.getInt();
		for(int i=1; i<=broj; i++)
		{
			faktorijel=faktorijel*i;
	}
		System.out.println(faktorijel);
	}

}
