import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Otimização de corte
     * Um marceneiro, para fazer um trabalho, precisa cortar vários pedaços de
     * madeira de 45 cm cada um. Ele pode comprar tábuas de 3, 4 ou 5 metros. Usando
     * os operadores div e mod, faça um programa que calcule a quantidade de pedaços
     * e a sobra para cada tipo de tábua,
     * permitindo assim uma melhor escolha do marceneiro.
     *
     * Cutting Optimization
     * A carpenter, to complete a project, needs to cut
     * several pieces of wood, each measuring 45 cm. He can buy boards of 3, 4, or 5
     * meters.
     * Using the div and mod operators, create a program that calculates the
     * quantity of pieces
     * and the remainder for each type of board,
     * allowing the carpenter to make a better choice.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String input = readCLI("Digite o tamanho da tábua: ");
        printInfo(input);
        scanner.close();
    }

    /**
     * Print the wood pieces and excess
     *
     * @param choice wood piece length
     */
    private static void printInfo(String choice) {
        Integer pieceLength = Integer.parseInt(choice) * 100;
        System.out.printf("Quantidade de tábuas: %d%n", pieceLength / 45);
        System.out.printf("Resto: %.2f%n", pieceLength % 45d);

    }

    /**
     * Display a label message and read user's input from CLI
     *
     * @param label text to be displayed
     * @return the user's input
     */
    private static String readCLI(String label) {
        System.out.println(label);
        return scanner.nextLine();
    }

}
