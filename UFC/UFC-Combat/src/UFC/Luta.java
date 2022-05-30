package UFC;

public final class Luta {

	public static void main(String[] args) {
	System.out.print("======================================================================\n");
	System.out.print("                          BEM VINDOS AO ULTIMATE COMBAT                \n\n ");
	System.out.print("Nesta noite maravilhosa, o público vai loucura com as melhores lutas do século.\n "
			+ "Sem mais enrolação vamos conhecer nossos competidores              \n \n");
	Lutador[] lutador1 = new Lutador [6];
	lutador1 [0] = new Lutador ("PRETTY BOY", "FRANCES", 31, 1.75f, 68.9f,12,14,6 );
	lutador1 [1] = new Lutador ("PUTSCRIPT", "BRASILEIRA" , 29, 1.68f, 57.8f, 2 ,15,10);
	lutador1 [2] = new Lutador ("SNAPSHADOW", "AMERICANO" , 27, 1.85f, 80.8f, 2 ,7,1);
	lutador1 [3] = new Lutador ("DEAD CORE", "AUSTRALIANO" , 22, 1.69f, 81.8f, 12 ,18,3);
	lutador1 [4] = new Lutador ("UFOCOMBAL", "BRASILEIRA" , 35, 1.88f, 102.8f, 3 ,7,10);
	lutador1 [5] = new Lutador ("NERDAART", "AMERICANO" , 23, 1.73f, 119.8f, 2 ,1,0);
	
	LutaUFC FIGTH1 = new LutaUFC();
	FIGTH1.marcarLuta(lutador1 [2], lutador1[3]);
	FIGTH1.lutar();
	
	

	
	}

}
