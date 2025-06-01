import java.util.ArrayList;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> osLivros = new ArrayList<>();

        System.out.println("Cadastre 3 livros:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nLivro " + i + ":");
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 

            Livro livro = new Livro(titulo, autor, preco);
            osLivros.add(livro);
        }
    
        System.out.print("\n--- Livros Cadastrados ---");
        for (Livro livro : osLivros) {
            System.out.println(livro);
        }
        
        scanner.close();
    }
}