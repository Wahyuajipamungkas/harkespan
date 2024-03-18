package Tugass1;

public class No2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double phi,hasil,r;
	int diameter,tinggi;
	
	diameter = 5;
	tinggi = 10;
	phi = 3.14;
	r = 0.5 * diameter;
	
	hasil = phi *(int)Math.pow(r, 2) * tinggi ;
	
	System.out.println("Volume Tabung");
	System.out.println("Dengan Diameter = "+diameter);
	System.out.println("       Tinggi   = "+tinggi);
	System.out.println();
	System.out.println("Maka Hasilnya Adalah = " +hasil);
	
	

	}

}
