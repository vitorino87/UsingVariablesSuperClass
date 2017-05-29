/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingvariablessuperclass;

/**
 *
 * @author tiago.lucas
 */
public class B extends A{
    int x;
    B(int a, int b){
        super.x = a;    //x in A
        x = b;          //x in B
    }
    void show(){
        System.out.println("x in superclass: "+super.x);
        System.out.println("x in subclass: "+x);
    }
}
