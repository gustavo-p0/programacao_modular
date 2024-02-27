import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Tipo de caractere
     * Write a program that reads a character and informs
     * whether it is a letter, digit, arithmetic operator, or none of them.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String input = readCLI();
        printTypeOfCharacter(input);
        scanner.close();
    }

    /**
     * Read the input from CLI
     *
     * @return
     */
    private static String readCLI() {
        System.out.println("Escreva um caractere:");
        return scanner.nextLine();
    }

    /**
     * Given a input char, print its type
     *
     * @param input that needs to know its type
     */
    private static void printTypeOfCharacter(String input) {
        String character = String.valueOf(input.charAt(0));
        String type = typeOfCharacter(character);
        System.out.println(type);
    }

    /**
     * Find the character type
     *
     * @param character to be analised
     * @return the character type Letra, Dígito, Operador aritmmético ou Nenhum
     *         deles
     */
    private static String typeOfCharacter(String character) {
        if (character.matches("\\d")) {
            return "Dígito";
        } else if (character.matches("[a-zA-Z]")) {
            return "Letra";
        }
        switch (character) {
            case "%":
            case "*":
            case "+":
            case "-":
            case "/":
                return "Operador aritmético";
        }
        return "Nenhum deles";
    }
}
