public class activity---------------------------------------13 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, introduza a temperatura como argumento.");
            System.out.println("Exemplo: java Atividade13 100");
            return;
        }

        // Converter o argumento para número
        double temperatura = Double.parseDouble(args[0]);

        // Verificar se a água está a ferver
        if (temperatura >= 100) {
            System.out.println("A água está a ferver.");
        } else {
            System.out.println("A água não está a ferver.");
        }
    }
}
