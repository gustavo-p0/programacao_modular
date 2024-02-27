import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Imposto - Um imposto é calculado com base na seguinte tabela:
     * Até 1.200,00 isento
     * de 1.201,00 a 2.500,00 10%
     * de 2.501,00 a 5.000,00 15%
     * acima de 5.000,00 20%.
     * Implemente um programa que leia o valor base e calcule o imposto a pagar.
     *
     * Tax - A tax is calculated based on the following table:
     * Up to 1,200.00 exempt
     * From 1,201.00 to 2,500.00 10%
     * From 2,501.00 to 5,000.00 15%
     * Above 5,000.00 20%.
     * Implement a program that reads the base value and calculates the tax to be
     * paid.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String input = readCLI("Digite o valor base:");
        Integer tax = evaluateTax(Double.parseDouble(input));
        System.out.printf("%d%%%n", tax);
        scanner.close();
    }

    /**
     * Evaluate tax percentage using the correspondent table
     *
     * @param input base value to be taxed
     * @return tax percentage
     */
    private static Integer evaluateTax(Double baseValue) {
        if (baseValue <= 1200d) {
            return 0;
        } else if (baseValue <= 2500d) {
            return 10;
        } else if (baseValue <= 5000d) {
            return 15;
        } else {
            return 20;
        }
    }

    /**
     * Display a label message and read user's input
     *
     * @param label text to be displayed
     * @return the user's input
     */
    private static String readCLI(String label) {
        System.out.println(label);
        return scanner.nextLine();
    }

}
