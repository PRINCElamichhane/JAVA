import java.util.Scanner;
public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String a = "";
                String b = "";

                // repetir até não haver espaços em branco
                while (a.trim().isEmpty()) {
                    System.out.print("Insira o primeiro número: ");
                    a = scanner.nextLine();
                }

                while (b.trim().isEmpty()) {
                    System.out.print("Insira o segundo número: ");
                    b = scanner.nextLine();
                }

                try {
                    double num1 = Double.parseDouble(a);
                    double num2 = Double.parseDouble(b);

                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero!");
                    }

                    System.out.println("Resultado: " + (num1 / num2));

                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Erro: insira apenas números.");
                }

                scanner.close();
            }
        }
