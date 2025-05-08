package controller;
import java.io.*;
import javax.swing.JOptionPane;
import model.Aluno;
public class CLasse_Metodos {
    
    public Aluno[ ] CadastraAluno (Aluno[ ] aluno  ) throws IOException {
    int i;  String ALUNOS = "ArquivoAluno.txt";
    BufferedWriter gravar = new BufferedWriter(new FileWriter( ALUNOS ));
 
            for (i = 0 ; i < aluno.length ; i++)
            { 
             aluno[i] = new Aluno();  
            }
            for (i = 0 ; i < aluno.length ; i++)  {
                aluno[i].setPnome(JOptionPane.showInputDialog("Entre o nome do aluno:"));
                    gravar.write( aluno[i].getPnome()); 
                        gravar.newLine();
                aluno[i].setUnome(JOptionPane.showInputDialog("Entre o sobrenome do aluno:"));
                        gravar.write( aluno[i].getUnome());   
                            gravar.newLine();
                aluno[i].setPontos(Integer.parseInt(JOptionPane.showInputDialog("Pontos: ")));
                            gravar.write(Integer.toString(aluno[i].getPontos()));  
                                gravar.newLine(); 
            } 
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
            gravar.close();
        return aluno;
    }

    public Aluno[] MostraAluno (Aluno[] aluno) throws IOException{
        int i;
        String ALUNOS = "ArquivoAluno.txt";
        BufferedReader ler = new BufferedReader(new FileReader(ALUNOS));
        
            for(i = 0 ; i < aluno.length ; i++ ){
            aluno[i] = new Aluno();
            }
            for(i = 0; i < aluno.length ; i++){
                aluno[i].setPnome(ler.readLine());
                aluno[i].setUnome(ler.readLine());
                aluno[i].setPontos(Integer.parseInt(ler.readLine()));
            }
            for(i = 0; i < aluno.length; i++){
                System.out.println("Nome: "+ aluno[i].getPnome()+ " " + aluno[i].getUnome()+ 
                        " \nPontos: "+ aluno[i].getPontos() );
                JOptionPane.showMessageDialog(null, "Nome: "+ aluno[i].getPnome()+ " " + aluno[i].getUnome()+ 
                        " \nPontos: "+ aluno[i].getPontos() );
              ler.close();
            }
        
        return null;
    
    }
}
