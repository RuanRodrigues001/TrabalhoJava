import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ClasseModelo> usuario = new ArrayList<>();

        boolean rodando = true;
        while (rodando){

            System.out.println("╔══════════════════════════════╗");
            System.out.println("║          ◄ MENU ►            ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.println("1 → para realizar o seu cadastro;");
            System.out.println("2 → para imprimir o seu cadastro;");
            System.out.println("3 → para encerrar o progrma;");
            String opçao = teclado.nextLine();

            switch (opçao) {

                case "1": {
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║ ◄ Preenchimento de cadastro ►  ║");
                    System.out.println("╚════════════════════════════════╝");

                    ClasseModelo cm = new ClasseModelo();

                    System.out.println("Informe o nome do animal: ");
                    cm.nomeAnimal = teclado.nextLine();

                    System.out.println("Informe o nome do responsável: ");
                    cm.dono = teclado.nextLine();

                    System.out.println("Informe a espécie do animal: ");
                    cm.especie = teclado.nextLine();

                    System.out.println("Informe o peso do animal: ");
                    cm.peso = teclado.nextDouble();

                    System.out.println("Informe o dia que o animal nasceu: ");
                    cm.dia = teclado.nextInt();

                    System.out.println("Informe o mês que o animal nasceu: ");
                    cm.mes = teclado.nextInt();

                    System.out.println("Informe o ano que o animal nasceu: ");
                    cm.ano = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Informe o número de celular do responsável: ");
                    cm.telefone = teclado.nextLine();
                    String ddd = cm.telefone.substring(0,2);
                    String fone1 = cm.telefone.substring(2,7);
                    String fone2 = cm.telefone.substring(7,11);
                    cm.telefone = ("(" + ddd +")" + fone1 + "-" + fone2);

                    System.out.println("Informe o seu endereço: ");
                    cm.endereco = teclado.nextLine();

                    System.out.println("Informe a sua cidade: ");
                    cm.cidade = teclado.nextLine();

                    System.out.println("Informe a sua UF: ");
                    cm.uf = teclado.nextLine();

                    teclado.nextLine();
                    usuario.add(cm);
                    break;
                }
                case "2": {
                    for(int i = 0; i< usuario.size(); i++){
                        usuario.get(i).listagem();;
                    }
                    break;
                }
                case "3": {
                    rodando = false;
                    System.out.println("╔════════════════════════════════╗");
                    System.out.println("║    ◄ Programa finalizado ►     ║");
                    System.out.println("╚════════════════════════════════╝");
                    break;
                }
            }
        }
    }
}
