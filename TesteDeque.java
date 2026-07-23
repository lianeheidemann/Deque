import java.util.Scanner;

class TesteDeque {
    public static void main(String[] args)
    {
        Deque novoDeque = new Deque(20);

        System.out.println("ESTOQUE DE PRODUTOS DE UM SUPERMERCADO");
        System.out.println("1) Adicionar elemento na frente");
        System.out.println("2) Adicionar elemento no final");
        System.out.println("3) Mostrar elemento da frente");
        System.out.println("4) Mostrar elemento do final");
        System.out.println("5) Deletar elemento na frente");
        System.out.println("6) Deletar elemento no final");
        System.out.println("7) Verifica se o Deque esta vazio");
        System.out.println("8) Verifica se o Deque esta cheio");
        System.out.println("9) Exit");

        String nome;
        int preco;
        int quantidade;

        int input;
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.print("\n-> Entre com uma das opções: ");

            // corrigido: entrada não numérica não derruba mais o programa
            try {
                input = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número de 1 a 9.");
                continue;
            }

            switch (input) {
                case 1: //adiciona na frente
                    System.out.print("Nome do Produto: ");
                    nome = scanner.next();
                    System.out.print("Preço: ");
                    preco = lerInteiro(scanner);
                    System.out.print("Quantidade: ");
                    quantidade = lerInteiro(scanner);

                    novoDeque.inserirFront(new Produto(nome,preco,quantidade));
                    break;

                case 2: //adicionar no final
                    System.out.print("Nome do Produto: ");
                    nome = scanner.next();
                    System.out.print("Preço: ");
                    preco = lerInteiro(scanner);
                    System.out.print("Quantidade: ");
                    quantidade = lerInteiro(scanner);

                    novoDeque.inserirLast(new Produto(nome,preco,quantidade));
                    break;

                case 3: //mostrar elemento da frente
                    System.out.println(novoDeque.getFirstElemento());
                    break;
                case 4: //mostrar elemneton do final
                    System.out.println(novoDeque.getLeastElement());
                    break;
                case 5: //deletar elemento da frente
                    novoDeque.deletarFrontElement();
                    break;
                case 6: //deletar elemento do final
                    novoDeque.deletarLeastElement();
                    break;
                case 7:  //deque esta vazio?
                    if(novoDeque.isEmpty()){
                        System.out.println("Deque esta vazio!");
                    } else {
                        System.out.println("Deque nao esta vazio!"); // corrigido: antes imprimia a mesma mensagem nos dois ramos
                    }
                    break;
                case 8: //deque esta cheio?
                    if(novoDeque.isFull()){
                        System.out.println("Deque esta cheio!");
                    } else {
                        System.out.println("Deque não esta cheio!");
                    }
                    break;
                case 9: //exit
                    scanner.close();
                    System.out.println("Finalizando o Sistema!\n");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 9.");
                }
        }
    }

    // método auxiliar: repete a leitura até receber um inteiro válido
    private static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido, digite um número inteiro: ");
            }
        }
    }
}
