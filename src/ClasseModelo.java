import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ClasseModelo {

    double valorDouble;
    String mensagem;
    String nomeAnimal;
    String dono;
    String especie;
    Double peso;
    int dia;
    int mes;
    int ano;
    String telefone;
    String endereco;
    String cidade;
    String uf;


    public void listagem() {
        JFileChooser imagem = new JFileChooser();
        int salvarFoto = imagem.showOpenDialog(null);
        File selectFile = null;
        if (salvarFoto == JFileChooser.APPROVE_OPTION) {
            selectFile = imagem.getSelectedFile();
        }
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                           ◄ Imprimindo conteúdo da lista ►                               ║");
        System.out.println("║══════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("║ Nome do animal:                     ◄►      " + nomeAnimal + "•");
        System.out.println("║ Nome do responsável:                ◄►      " + dono + "•");
        System.out.println("║ Espécie do animal:                  ◄►      " + especie + "•");
        System.out.println("║ Peso do animal:                     ◄►      " + peso + "kg" + "•");
        System.out.println("║ Data de nascimento do animal:       ◄►      " + dia + "/" + mes + "/" + ano + "•");
        System.out.println("║ Endereço do responsável:            ◄►      " + endereco + "•");
        System.out.println("║ Cidade do responsável:              ◄►      " + cidade + "•");
        System.out.println("║ Telfone do responsável:             ◄►      " + telefone + "•");
        System.out.println("║ Uf do responsável                   ◄►      " + uf + "•");
        System.out.println("║══════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("║"+selectFile.getAbsoluteFile());
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════════════");
    }
}

