import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Approvação 1
     * Develop a program that reads a subject and its final grade,
     * which is a multiple of 0.5, and informs the outcome. If the grade is from 5
     * to 10, approved;
     * if it's 4 or 4.5, second chance; otherwise, failed.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String input = readCLI("Digite a disciplina e a respectiva nota final: ");
        String status = evaluateStatus(input);
        System.out.println(status);
        scanner.close();
    }

    /**
     * Display a label text and receive input from CLI
     *
     * @param displayMessage Text to be displayed on the interface
     * @return the inputed text
     */
    private static String readCLI(String displayMessage) {
        System.out.println(displayMessage);
        return scanner.nextLine();
    }

    /**
     * Evaluate the final student condtion based on the grade value
     *
     * @param input With the matter and final grade value
     * @return the correspondent status of the grade
     */
    private static String evaluateStatus(String input) {
        String[] arguments = input.split(" ");
        Double gradeValue = Double.valueOf(arguments[1].replace(",", "."));
        if (gradeValue >= 5d && gradeValue <= 10d) {
            return "Aprovado";
        } else if (gradeValue >= 4d) {
            return "Segunda época";
        } else {
            return "Reprovado";
        }
    };

}
