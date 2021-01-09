
import java.util.Scanner;

public class Principal5 {
    
    public static void main(String[] args) {
        
    Scanner leitor = new Scanner (System.in);
    
    Classe1_5 c1_5 = new Classe1_5 ();
    
    int tecla = 0;
    while (tecla!=2) {
        
    System.out.format("\n 1 Verificar o nome do triangulo \n 2 Sair");
    tecla= leitor.nextInt();
    switch (tecla){
            
        case 1: c1_5. ler (leitor);
        System.out.format("\n ", c1_5.calcular_exibir ());
        break;
            
        case 2: System.out.println ("\n Programa finalizado");
        System.exit (0);
        break;}
    }
    }
    }

