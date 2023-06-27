class Deque{
    private Produto produtos[];
    int first;
    int last;
    int size;
    
    public Deque(int size) {
        this.produtos = new Produto[size];
        this.first = -1;
        this.last = 0;
        this.size = size;
    }
  
    // Verifica se o Deque esta cheio
    boolean isFull() {
        return ((first == 0 && last == size-1) || first == last+1);
    }
  
    // Verifica se o Deque esta vazio
    boolean isEmpty() {
        return (first == -1);
    }
  
    // Insere um elemento na frente
    void inserirFront(Produto p) {
        // verifique se Deque está cheio ou não
        if (isFull()) {
            System.out.println("\nDEQUE ESTA CHEIO !!! \nElemento não adicionado!\n");
            return;
        }
        // Se a fila estiver inicialmente vazia
        if (first == -1) {
            first = 0;
            last = 0;
        }
        // frente está na primeira posição da fila
        else if (first == 0) {
            first = size - 1 ;
        }
        else { // diminuir front-end em '1'
            first = first-1;
        }
        // inserir elemento atual em Deque
        produtos[first] = p;

    }
  
    // função para inserir elemento na extremidade traseira do Deque.
    void inserirLast(Produto key) {
        if (isFull()) {
            System.out.println("\nDEQUE ESTA CHEIO !!! \nElemento não adicionado!\n");
            return;
        }
        // Se a fila estiver inicialmente vazia
        if (first == -1) {
            first = 0;
            last = 0;
        }
        // se a retaguarda está na última posição da fila
        else if (last == size-1) {
            last = 0;
        }
        // incrementar a extremidade traseira em '1'
        else {
            last = last+1;
        }
        // inserir elemento atual em Deque
        produtos[last] = key ;
    }
  
    // Exclui o elemento no front-end do Deque
    void deletarFronElement() {
        // verifique se o Deque está vazio ou não
        if (isEmpty()) {
            System.out.println("Deque está vazio! \nNão há como deletar elemento!");
            return ;
        }
        // Deque tem apenas um elemento
        if (first == last) {
            first = -1;
            last = -1;
        }
        else{
            // de volta à posição inicial
            if (first == size -1) {
                first = 0;
            }// incrementar a frente em '1' para remover o valor atual da frente de Deque
            else { 
                first = first+1;
            }
        }
        System.out.println("Primeiro elemento do Deque deletado!");
    }
  
    // Excluir elemento na extremidade traseira do Deque
    void deletarLeastElement()
    {
        if (isEmpty()) {
            System.out.println("Deque está vazio!\nNão há como deletar elemento!");
            return ;
        }
        // Deque tem apenas um elemento
        if (first == last) {
            first = -1;
            last = -1;
        }
        else if (last == 0) {
            last = size-1;
        }
        else {
            last = last-1;
        }
        System.out.println("Ultimo elemento do Deque deletado!");
    }

    // Retorna o elemento frontal de Deque
    String getFirstElemente()
    {
        // verifique se o Deque está vazio ou não
        if (isEmpty()) {
            return "Deque está vazio!\nNão é possivel mostrar elemento!";
        }
        return "[ "+produtos[first].getNomeProduto()+", R$ "
            +produtos[first].getPreco()+", Quantidade:"
            +produtos[first].getQuantidade()+" ]";
    }
  
    // função retornar elemento traseiro do Deque
    String getLeastElement()
    {
        // verifique se o Deque está vazio ou não
        if(isEmpty() || last < 0) {
            return "Deque está vazio!\nNão é possivel mostrar elemento!";
        }
        return "[ "+produtos[last].getNomeProduto()+", R$ "
            +produtos[last].getPreco()+", Quantidade:"
            +produtos[last].getQuantidade()+" ]";
    }
}