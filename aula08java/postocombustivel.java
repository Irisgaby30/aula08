import java.util.Scanner;
public class postocombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de litros:");
        double litros = scanner.nextDouble();
        System.out.print("Tipo de combustível(A-álcool,G-gasolina):");
        char tipo = scanner.next().toUpperCase().charAt(0);
        double precoLitro=0;
        double desconto=0;
        double valorTotal=0;
        if(tipo=='A'){
            precoLitro=4.50;
            if(litros<=20){
                desconto=0.03;
            } else{
                desconto=0.05;
            }
        }
        else if(tipo=='G'){
            precoLitro=6.00;
            if (litros<=20){
                desconto=0.04;
            } else{
                desconto=0.06;
            }
        } else{
            System.out.println("Tipo de combustivel inválido.");
            return;
        }
        valorTotal = litros*precoLitro*(1- desconto);
        System.out.printf(" Valor total a ser pago: R$ %.2f\n", valorTotal);
        scanner.close();
    }
}
