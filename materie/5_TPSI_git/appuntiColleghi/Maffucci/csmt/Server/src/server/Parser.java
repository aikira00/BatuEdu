/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author MULTIMEDIALE
 */
public class Parser {

    private int n1;
    private int n2;
    private char op;
    String result;

    public Parser() {
        n1 = n2 = Integer.MAX_VALUE;
        op = Character.MAX_VALUE;
        result = "ERR";
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public char getOp() {
        return op;
    }

    public String getResult() {
        return result;
    }

    public Parser parse(String input) {

        char current;
        int stato = 0;
        int posOp = 0;
        boolean correct = true;
        int i = 0;

        do {
            current = input.charAt(i);
            switch (stato) {
                case 0:
                    if (current < '0' || current > '9') {
                          correct=false;
                    }else{
                        stato=1;
                    }
                    break;
                
                case 1:
                    if(current < '0' || current > '9'){
                        if(current == '+' || current == '-' 
                                || current == '*' || current == '/' ){
                            stato=2;
                            posOp=i;
                        }else{
                            correct=false;
                        }
                    }
                    break;
                
                case 2:
                    if(current < '0' || current > '9'){
                        correct=false;
                    }
                    
                
            }
            i++;
        } while (i < input.length() && correct);
        if(correct){
            n1=Integer.parseInt(input.substring(0,posOp));
            n2=Integer.parseInt(input.substring(posOp+1));
            op=input.charAt(posOp);
            result="OK";
        }
        return this;

    }
}
