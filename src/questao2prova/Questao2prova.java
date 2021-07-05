/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2prova;

/**
 *
 * @author Vitória Reis 
 */
public class Questao2prova {

    public static void main(String[] args) {
        int popA, popB=7000000, porc, cont=0; 
                
                for(popA=5000000; popA!=popB; cont++){
                    popA*1.03;
                    popB*1.02;
                } System.out.println("Demorou "+cont+" anos para o país \"A\" ("+popA=" pessoas) igualasse sua população com o país \"B\" ("+popB+" pessoas).");
    }
    
}
