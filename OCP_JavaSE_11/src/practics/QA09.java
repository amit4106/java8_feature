package practics;

public class QA09 {
	class L extends Exception{}
	class M extends L{}
	class N extends RuntimeException{}
	public void p()throws L {throw new M();}
	public void q()throws N {throw new N();}
	public static void main(String[] args) {
		QA09 t=new QA09();
		try {
			t.p();
			t.q();
		}catch (L |N e) {
			e.printStackTrace();
		}
	}
}


