public class Ex28 {
    public static void main(String[] args) {
        String age = "30";
        double time = 30.5;
        int ageInt = Integer.parseInt(age);
        float ageFloat = Float.parseFloat(age);
        System.out.println("Idade como inteiro: " + ageInt);
        System.out.println("Idade como float: " + ageFloat);
        System.out.println("Tempo como inteiro: " + (int)time);
        System.out.println(     "Tempo como float: " + (float)time);
    }
}
