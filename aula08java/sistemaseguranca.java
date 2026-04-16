import java.util.Scanner;
public class sistemaseguranca {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      String senhaCorreta = "1234";
      System.out.print("Digite a senha:");
      String tentativa = leitor.nextLine();
      while(!tentativa.equals(senhaCorreta)){
        System.out.println("senha incorreta!");
        System.out.print("Tente Novamente:");
        tentativa = leitor.nextLine();
      }    
      System.out.println("Acesso permitido");
      leitor.close();
    }
}
