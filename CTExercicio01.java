public class CTExercicio01 {
    public static void main(String[] args) {
        int idade = 18;
        if (idade < 16) {
            System.out.println("Não pode votar!");
        } else if (idade < 18 || idade > 65) {
            System.out.println("Seu voto é facultativo");
        } else {
            System.out.println("Seu voto é obrigatório");
        }
    }
}