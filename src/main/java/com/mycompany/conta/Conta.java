/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conta;
import java.util.Scanner;


public class Conta {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        CadConta c1 = new CadConta();
        
        System.out.println("Insira seu nome");
        c1.setNome(ler.nextLine());
        System.out.println("Insira sua Agência");
        c1.setAgencia(ler.nextInt());
        System.out.println("Insira sua Conta");
        c1.setConta(ler.nextInt());
        System.out.println("Insira sua Idade");
        c1.setIdade(ler.nextInt());
        if (c1.getIdade() < 18 ){
        System.out.println("Mete o pé");
        } else {  
        System.out.println("Cadastro: " + c1.getNome() + "\nAgência: "+ c1.getAgencia()+ "\nIdade: " + c1.getIdade());
        }
    }
}
