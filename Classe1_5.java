
import java.util.Scanner;

public class Classe1_5 {
    
    public double a1, a2, a3;
    
    public void ler (Scanner leitor) {
        
        System.out.println("\n Digite o primeiro angulo:");
        a1= leitor.nextDouble();
        
        System.out.println("\n Digite o segundo angulo:");
        a2= leitor.nextDouble();
        
        System.out.println("\n Digite o terceiro angulo:");
        a3= leitor.nextDouble();
              
    }

    public double calcular_exibir () {
        
        if ( (a1 == 90) || (a2 == 90) || (a3 == 90)) {
            
            System.out.println("\n É um triangulo retangulo.");}
        
        else if ( (a1 > 90) || (a2 > 90) || (a3 > 90)) {
            
            System.out.println("\n É um triangulo obtusângulo.");}
        
        else if ( (a1 < 90) || (a2 < 90) || (a3 < 90)) {
            
            System.out.println("\n É um triangulo acutângulo.");}
       
        return 0;
     }}
