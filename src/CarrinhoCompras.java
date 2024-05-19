import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.Objects;

public class CarrinhoCompras {
    static ArrayList<Item> carrinho = new ArrayList<>();
    public static void main(String[] args) {

        adicionarItem(new Item("Camiseta", 59.90, 3));
        adicionarItem(new Item("Jaqueta", 229.90, 1));
        adicionarItem(new Item("Calca", 99.90, 2));
        adicionarItem(new Item("Shorts", 69.90, 1));
        exibirCarrinho();
        System.out.println("--------------------------------------------");
        System.out.println(calcularValorTotal());
        System.out.println("--------------------------------------------");
        removeItem("Calca");
        exibirCarrinho();
        System.out.println("--------------------------------------------");

    }

    public static void adicionarItem(Item item) {
        carrinho.add(item);
    }
    public static void removeItem(String nome) {
        carrinho.removeIf(item -> Objects.equals(item.getNome(), nome));
    }
    public static double calcularValorTotal() {
        double sum = 0;
        for (Item item : carrinho) {
            sum = sum + item.getPreco();
        }
        return sum;
    }
    public static void exibirCarrinho() {
        for (Item item : carrinho) {
            System.out.println(item);
        }
    }
}