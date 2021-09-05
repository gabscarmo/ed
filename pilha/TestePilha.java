package pilha;

public class TestePilha {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pilha p = new Pilha(5);
		try{p.Push(10);
		p.Push(15);
        p.Push(7);
        p.Push(3);
        p.Push(5);
        p.Push(1);
        }catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(p.Pop());
			System.out.println(p.Pop());
			System.out.println(p.Pop());
		} catch (Exception e) {
			System.out.println(e);
		}

    }

}
