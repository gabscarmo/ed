package arranjo;

public class Arranjo<T> {

    private T[] Data;
    
    @SuppressWarnings("unchecked")
    public Arranjo(int tam) {
        this.Data = (T[]) new Object[tam];
    }

    public T Get(int i) {
        return this.Data[i];
    }

    public void Set(int i, T obj) {
        this.Data[i] = obj;
    }

    public void Imprime() {
        System.out.print("[");
        for (int i=0; i < this.Data.length; i++) {
            System.out.print(this.Data[i]+" ");
        }
        System.out.println("]");
    }
// 3.a
    public void EscreveUltimo(T obj) {
        for (int j = this.Data.length - 1; j >= 0; j--) {
            if(this.Data[j]==null){
                this.Data[j]=obj;
                break;
            }
        }
    }
//3.b
    public void EscrevePrimeiro(T obj) {
        for (int j = this.Data.length - 1 ; j >= 1; j--) {
            this.Data[j]=this.Data[j-1];
        }
    this.Data[0]=obj;
    }
//3.c
    public void EscrevePosicao(int posicao, T obj) {
        int x=this.Data.length - posicao - 1;
        for (int j = 1; j < x ; j++) {
            this.Data[posicao + j]=this.Data[posicao + j-1];        
        }
        this.Data[posicao] = obj;
    }
//3.d
    public void RemoveUltimo() {
        for (int j = this.Data.length-1; j > 0; j--) {
            if(this.Data[j]!=null){
                this.Data[j]=null;
                break;
            }
        }
    }
//3.e
    public void RemovePrimeiro() {    
        for (int j = 1; j <=this.Data.length-1; j++) {
            this.Data[j-1]=this.Data[j];
        }
    }

//3.f
public void EscrevePosicao(int posicao) {
    int x=this.Data.length - posicao - 1;
    for (int j = 1; j < x ; j++) {
        this.Data[posicao + j]=this.Data[posicao + j+1];        
    }
}


}
