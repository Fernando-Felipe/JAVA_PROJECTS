import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassePrincipal {
public static void main (String arg [ ]) throws IOException {
   Estatisticas[ ] estatisticas = new Estatisticas[3];
   ClasseMetodos m = new ClasseMetodos();
    int opc=0 ;
 while (opc!=9){
    opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar \n 2 - Consulta de Acidentes\n 3 - Maior e Menor \n 4 - Acima da media\n 9 - Finaliza"));
switch (opc) {
    
     case 1 : estatisticas = m.FCADRASTRAESTATISTICA(estatisticas);
     break;
      
      
     case 2 :  m.PQTDACIDENTES(estatisticas);
     break;
     
     case 3 : m.PMAIORMENOR(estatisticas);
     break;
     
     case 4 : m.PACIMA(estatisticas);
     break;
     
     case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO ");
     break;
     
     default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
    }
   } 
  }
}
