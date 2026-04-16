import java.util.Scanner;
public class votacao{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua idade:");
        int idade = input.nextInt();
        if (idade<16){
            System.out.println("Não pode votar.");
        } else if((idade>=18)&&(idade<=70)){
            System.out.println("Voto Obrigatório.");
        } else{
            System.out.println("Voto Facultativo.");
        }
        input.close();
    }
}