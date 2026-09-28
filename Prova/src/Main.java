import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    Scanner input = new Scanner(System.in);
    ArrayList<Mecanico> mecanicos = new ArrayList<>();
    ArrayList<Box> box = new ArrayList<>();
    ArrayList<OrdemServico> ordem = new ArrayList<>();

    public static void main(String[] args) {
        criarDados();


        int escolha;
        System.out.println("\n--- OFICINA - SEJA BEM VINDO!!! ---");
        System.out.println("1 - Cadastrar ordem");
        System.out.println("2 - Associar mecânico");
        System.out.println("3 - Atribuir ordem ao box");
        System.out.println("4 - Listar ordens do box");
        System.out.println("5 - Total finalizadas por box");
        System.out.println("6 - Buscar por status");
        System.out.println("7 - Detalhes da ordem");
        System.out.println("0 - Sair");

        escolha = input.nextInt();

        if (escolha == 1){
            System.out.println("Digite: ");
            ordem = input.next();

        } else if (escolha ==2) {
            System.out.println("Digite o mecanico: ");
            m = input.next();
            System.out.println("Digite o boxe:");
            boxe = input.next();



        } else if (escolha ==3) {

        } else if (escolha ==4) {

        } else if (escolha ==5) {

        } else if (escolha ==6) {

        } else (escolha == 7) {

        }


        public static void criarDados() {
            Mecanico m1 = new Mecanico("319999", "Elétrica", "1234567", "David");
            mecanicos.add(m1);
            Mecanico m2 = new Mecanico("319998", "Motor", "12345678", "Pedro");
            mecanicos.add(m2);
            Mecanico m3 = new Mecanico("319997", "Suspensão", "12345689", "Felipe");
            mecanicos.add(m3);

            Box b1 = new Box(1, "Motor", 5, "LOJA A");
            Box b2 = new Box(2, "Suspensao", 2, "LOJA B");
            Box b3 = new Box(3, "Elétrica", 1, "LOJA C");
        }
    }


}














