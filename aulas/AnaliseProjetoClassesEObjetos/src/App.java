import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        Produto productOne = new Produto();
        int qty;
        productOne.registry("Chá mate com gás", 2.99);
        System.out.println("Quantas quantidades você quer comprar?  ");
        qty = Integer.parseInt(keyboard.nextLine());
        System.out.println(qty + " unidades de " + productOne.description + " custam R$ " + productOne.lotValue(qty));

    }
}
