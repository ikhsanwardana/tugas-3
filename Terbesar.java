class Terbesar{
	public static void main(String[] a){
		int angka1 = 40;
		int angka2 = 30;
		int angka3 = 75;
		int angka4 = 80;
		int angka5 = 100;
		int max = 0;
		
		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;
		max = angka4 >= max ? angka4 : max;
		max = angka5 >= max ? angka5 : max;
		
		System.out.println("Angka 1 adalah "+angka1);
		System.out.println("Angka 2 adalah "+angka2);
		System.out.println("Angka 3 adalah "+angka3);
		System.out.println("Angka 4 adalah "+angka4);
		System.out.println("Angka 5 adalah "+angka5);
		System.out.println("Angka terbesar adalah "+max);
	}
}
