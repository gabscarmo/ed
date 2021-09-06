package pilha;

public class Pilha {
    
    
private int[] Dados;
public int Topo;
int Tam;   

public Pilha(int tam) {
    this.Dados = new int[tam+1];
    this.Topo = 0;
    this.Tam = tam;
}

public boolean StackEmpty() {
    if (this.Topo == 0) {
        return true;
    } else {
        return false;
    }
}

//Questão 2
public boolean StackFull() {
    if (this.Topo == this.Tam) {
        return false;
    } else {
        return true;
    }
}


//Questão 3
public void Push(int dado) throws Exception{
    if(this.StackFull()){
    this.Topo += 1;
    this.Dados[this.Topo] = dado;
    }else{
        throw new Exception("Pilha Cheia"); 
    }
}

public int Pop() throws Exception {
    if (this.StackEmpty()) {
        throw new Exception("Pilha vazia");
    } else {
        this.Topo -= 1;
        return this.Dados[this.Topo+1];
    }
}

public void Imprime() {
    for (int i=0; i < this.Dados.length; i++) {
        System.out.println(this.Dados[i]);
    }
} 
}
}
