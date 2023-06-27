class Produto {
    
    private String nomeProduto;
    private int preco;
    private int quantidade;

    public Produto (String nomeProduto, int preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public void setNomeProduto(String n){
        this.nomeProduto = n;
    }

    public int getPreco(){
        return this.preco;
    }
    public void setPreco(int p){
        this.preco = p;
    }

    public int getQuantidade(){
        return this.quantidade;                         
    }
    public void setQuantidade(int q){
        this.quantidade = q;
    }
}