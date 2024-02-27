import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Inserção de caractere 1 - Implementar um programa que insere hífens
     * entre as letras de um cadeia de caracteres, como em f-a-b-u-l-o-s-o.
     *
     * Character Insertion 1 - Implement a program that inserts hyphens
     * between the letters of a string, like f-a-b-u-l-o-s-o.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String input = readCLI("Digite uma cadeia de caracteres: ");
        String transformedInput = insertCharactere(input, '-');
        System.out.println(transformedInput);
        scanner.close();
    }

    /**
     * Transform a string putting a symbol between letteres
     *
     * @param input  string to be transformed
     * @param symbol to be insertted
     * @return
     */
    private static String insertCharactere(String input, Character symbol) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            char[] letters = word.toCharArray();
            for (int i = 0; i < letters.length; i++) {
                result.append(letters[i]);
                if (i + 1 != letters.length) {
                    result.append(symbol);
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    /**
     * Display a label and read user's input
     *
     * @param label the message to be displayed
     * @return the user's input
     */
    private static String readCLI(String label) {
        System.out.println(label);
        return scanner.nextLine();
    }
}
