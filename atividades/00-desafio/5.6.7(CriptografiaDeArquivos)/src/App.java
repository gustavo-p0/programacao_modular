import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static Scanner scanner;

    /**
     * Criptografia de arquivos - Elaborar um programa que criptografa um
     * arquivo qualquer, incrementando o código ASCII de cada byte em uma unidade.
     *
     * File encryption - Create a program that encrypts a
     * any file, incrementing the ASCII code of each byte by one unit.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = readFile("data.txt");
        cryptograph(lines, "cripto-data.txt");
    }

    /**
     * Cryptograph file's content by increasing in one each content byte
     *
     * @param lines    file lines array
     * @param fileName string that will name the criptographed file
     * @throws IOException if can't write the new file
     */
    private static void cryptograph(ArrayList<String> lines, String fileName) throws IOException {
        StringBuilder newFile = new StringBuilder();

        for (String line : lines) {
            for (char character : line.toCharArray()) {
                character += 1;
                newFile.append(character);
            }
            newFile.append('\n');
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(newFile.toString());
            System.out.println("Arquivo criptografado '" + fileName + "' foi criado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo criptografado");
        }

    }

    /**
     * Read file content
     *
     * @param fileName string that's name the file
     * @return an array of lines
     * @throws FileNotFoundException if the file isn't found
     */
    private static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        return lines;
    }
}
