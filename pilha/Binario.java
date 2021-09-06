package io.github.jiangdequan;
import java.util.Stack;


public class Binario {

    public void DecimalParaBinario(int deci){
        for(int i = 0; i<= deci; i++ ){
            Stack <Integer> s = new Stack<Integer>();
            while (i > 0) {
 	            s.push(i % 2);
	            i = i / 2;
            }
            while (!s.isEmpty())
	        System.out.print(s.pop());
        }
        System.out.print(", ")
    }
}
