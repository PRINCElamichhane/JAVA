
public class acitivity5p1java {
    public static void main(String[] args) {
        int numero = 4; // <-- define aqui o número do dia (1 a 7)
        String dia;

        switch (numero) {
            case 1:
                dia = "Segunda-feira";
                break;
            case 2:
                dia = "Terça-feira";
                break;
            case 3:
                dia = "Quarta-feira";
                break;
            case 4:
                dia = "Quinta-feira";
                break;
            case 5:
                dia = "Sexta-feira";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido! Digite um valor entre 1 e 7.";
        }

        System.out.println("Dia correspondente: " + dia);
    }
}
