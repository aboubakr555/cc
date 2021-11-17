package pack;

public class Main {

	public static void main(String[] args) {
	   CPile<String> p = new CPile<String>();
	   System.out.println(p.estVide());
	   p.empile("aa");
	   p.empile("bb");
	   p.empile("cc");
	   p.empile("dd");
	   p.empile("ee");
	   p.empile("ff");
	   System.out.println(p.estVide());
	   System.out.println(p.nbrElements());
	   System.out.println(p.depile());
	   System.out.println(p.sommet());
	   System.out.println(p.nbrElements());
	   

	}

}
