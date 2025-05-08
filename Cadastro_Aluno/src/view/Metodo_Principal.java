package view;
import javax.swing.JOptionPane;
import java.io.IOException;
import model.Aluno;
import controller.CLasse_Metodos;

public class Metodo_Principal {
    public static void main(String[] args)throws IOException {
        Aluno[] aluno = new Aluno[3];
        controller.CLasse_Metodos m = new controller.CLasse_Metodos();
        int opc = 0;
        int i;
            for (i = 0 ; i < aluno.length ; i++){
                       aluno[i] = new Aluno(); 
            }

        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastra Aluno \n 2 - Mostra Aluno \n 9 - Sair   "));
            switch(opc){
              
                case 1: aluno = m.CadastraAluno(aluno);
                    break;
                
                case 2: m.MostraAluno(aluno);
                    break;
                    
                case 9: JOptionPane.showMessageDialog(null,"FInzalizado");
                    break;
                    
                default: JOptionPane.showMessageDialog(null, "Opcão Invalida");
            }
        }  
    }
}
