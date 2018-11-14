package pilha;

import java.util.Scanner;

public class Pilha {

    public static void main(String[] args) {
        
        PilhaProcessos pp = new PilhaProcessos();
        Scanner input = new Scanner(System.in); 
        int opcao;

        do{
            System.out.println("1 - Analisar Processo");
            System.out.println("2 - Adicionar Processo");
            System.out.println("3 - Excluir Processo");
            System.out.println("4 - Quantidade de Processos");
            System.out.println("5 - Procurar Processo");
            System.out.println("   ");
            System.out.println("Digite a opção: ");
            opcao = input.nextInt();
            System.out.println("  ");
            
            if (opcao == 1){
                System.out.println("Primeiro processo: " + pp.top());
                System.out.println("  ");
            }
            
            if (opcao == 2){
                pp.push(pp);
                System.out.println("  ");
            }
            
            if (opcao == 3){
                System.out.println("Exluir processo: " + pp.pop());
                System.out.println("  ");
            }
            
            if (opcao == 4){
                System.out.println("Quantidade de processos: " + pp.size());
                System.out.println("  ");
            }
            
        }while (opcao != 4);
        
    }
    
}
