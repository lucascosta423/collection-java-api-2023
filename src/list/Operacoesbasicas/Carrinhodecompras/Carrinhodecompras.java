package list.Operacoesbasicas.Carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinhodecompras {
    private List<Item> itemList;

    public Carrinhodecompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemove = new ArrayList<>();
        for (Item i:itemList) {
            if (i.getNome().equals(nome)){
                itemsParaRemove.add(i);
            }
        }
        itemList.removeAll(itemsParaRemove);
    }

    public Double calcularValorTotal(){
        Double soma = 0.0;
        for (Item i: itemList) {
            soma += (i.getPreco() * i.getQuantidade());
        }
        return soma;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        Carrinhodecompras carrinhodecompras = new Carrinhodecompras();

        carrinhodecompras.exibirItens();

        carrinhodecompras.adicionarItem("Arroz",5.00,1);
        carrinhodecompras.adicionarItem("Arroz",2.00,3);
        carrinhodecompras.adicionarItem("Feijão",5.00,2);
        carrinhodecompras.adicionarItem("Macarrão",10.00,1);
        carrinhodecompras.adicionarItem("Carne",20.00,2);

        carrinhodecompras.exibirItens();
        System.out.println("Valor Total do carrinho: " + carrinhodecompras.calcularValorTotal());

        carrinhodecompras.removerItem("Arroz");
        carrinhodecompras.exibirItens();

        System.out.println("Valor Total do carrinho: " + carrinhodecompras.calcularValorTotal());
    }
}
