package programs;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String nome;
        int alteracao = -1;
        int fim = -1;
        ArrayList <String> nomes = new ArrayList<String>();
        
        System.out.println("Inclusão === Exclusão === NameSearch");
        while (alteracao != 7){
            
            System.out.println("Digite 1 para mostrar o primeiro elemento da fila");
            System.out.println("digite 2 para mostrar o ultimo elemento da fila");
            System.out.println("digite 3 para mostrar o sucessor de uma elemento da fila");
            System.out.println("digite 4 para mostrar o numero de elementos da fila");
            System.out.println("digite 5 para incluir um nome na fila");
            System.out.println("digite 6 para excluir um nome da fila");
            System.out.println("digite 7 para SAIR");
            
            alteracao = sc.nextInt();
            switch (alteracao){       
                
                case 1:
                    System.out.println("O primeiro elemento da fila é: " + nomes.get(0));
                    break;
                    
                case 2:
                    System.out.println("O Ultimo elemento da fila é: " + nomes.get(fim));
                    break;
                    
                case 3:
                    System.out.println("Informar qual elemento quer saber o sucessor: ");
                    int elemntos = sc.nextInt();
                    if (elemntos>nomes.size())
                        System.out.println("Não existe esse elemento na fila");
                    else
                        if(elemntos == nomes.size())
                    System.out.println("Não existe sucesssor para este elemento da fila");
                    else
                        System.out.println("O sucessor é :" + nomes.get(elemntos++));
                        break;
                case 4: 
                    System.out.println("O numero de elemento na fila é: " + nomes.size());
                    break;
                case 5: 
                    System.out.println("Informe o nome para ser adicionado a fila");
                    nome = sc.next();
                    nomes.add(nome);
                    fim++;
                    for (int i=0; i<nomes.size(); i++){
                        System.out.println(i+"-"+nomes.get(i));
                    }
                    break;
                case 6:
                    if(nomes.size()>0)
                    {
                        nomes.remove(0);
                        fim--;
                        for(int i=0; i<nomes.size(); i++){
                            System.out.println(i+"-"+nomes.get(i));
                        }
                    }
                        break;
                case 7:
                    break;
                    
                default:
                        System.out.println("Opção incorreta");
                        
                        
                        sc.close();
            }  
        }
    }
}
