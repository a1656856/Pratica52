
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    
    public static void main(String[] args) {
          try
        {
            Equacao2Grau eq1 = new Equacao2Grau(1, -5, 6);
            
            double eq1R1, eq1R2;
            
            eq1R1 = eq1.getRaiz1();
            eq1R2 = eq1.getRaiz2();
            
            System.out.println("As raizes são " + eq1R1 + " e " + eq1R2 );
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        try
        {
            Equacao2Grau eq2 = new Equacao2Grau(0,-5,6);
            
            double eq2R1, eq2R2;
            eq2R2 = eq2.getRaiz2();
            
            eq2R1 = eq2.getRaiz1();
            
            System.out.println("As raizes são " + eq2R1 + " e " + eq2R2 );
            
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        try
        {
           Equacao2Grau eq3 = new Equacao2Grau(1, 2, 7);
           
            double eq3R1, eq3R2;
 
            eq3R1 = eq3.getRaiz1();
            eq3R2 = eq3.getRaiz2();

            System.out.println("As raizes são " + eq3R1 + " e " + eq3R2 );
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        
        
        
    }
}

