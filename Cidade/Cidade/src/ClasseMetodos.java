import java.io.*;
import javax.swing.*;
public class ClasseMetodos {
   public Estatisticas [ ] FCADRASTRAESTATISTICA (Estatisticas [ ] Estatisticas ) throws IOException {
      int i; String fileName = "ArquivoAluno.txt";
      BufferedWriter gravar = new BufferedWriter(new FileWriter( fileName ));
          for (i = 0 ; i < 3 ; i++) { Estatisticas[i] = new Estatisticas(); }
             for (i = 0 ; i < 3 ; i++) {
               Estatisticas[i].cnome = JOptionPane.showInputDialog("Entre o nome da Cidade:");
               gravar.write( Estatisticas[i].cnome ); gravar.newLine();
               

               Estatisticas[i].pcod = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade: "));
               gravar.write(Integer.toString(Estatisticas[i].pcod)); gravar.newLine();
               
               Estatisticas[i].acid = Integer.parseInt(JOptionPane.showInputDialog("Numero de Acidentes: "));
               gravar.write(Integer.toString(Estatisticas[i].acid)); gravar.newLine();
}
              System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");
  gravar.close();
return Estatisticas;
 }
   public void PQTDACIDENTES ( Estatisticas[ ] Estatisticas ){
    int i;
    for(i = 0; i < 3; i++){
        if(Estatisticas[i].acid >= 100 && Estatisticas[i].acid <= 500){
            System.out.println(Estatisticas[i].acid + " " + Estatisticas[i].cnome + " " + Estatisticas[i].pcod);
        }    
    }
   }
   
   public void PMAIORMENOR  ( Estatisticas[ ] Estatisticas ){
       Estatisticas[] aux = new Estatisticas[1];
       int i;
       int j;
       for(i = 0; i< 2; i++){
		for(j = i + 1; j < 3; j++){
                   if(Estatisticas[i].acid > Estatisticas[j].acid){
                       aux[0] = Estatisticas[i];
                       Estatisticas[i] = Estatisticas[j];
                       Estatisticas[j] = aux[0];
                   } 
                }
                
        }
       System.out.println("Menor " + Estatisticas[0].cnome + " " + Estatisticas[0].acid);
       System.out.println("Maior " + Estatisticas[2].cnome + " " + Estatisticas[2].acid);
   }  
    public void PACIMA ( Estatisticas[ ] Estatisticas ){
        int i, QtAC = 0;
        double media = 0;
         for(i = 0; i < 3; i++){
           QtAC = Estatisticas[i].acid + QtAC;
        }
         media = QtAC / 3;
         
         for(i = 0; i < 3; i++){
             if(Estatisticas[i].acid > media)
                 System.out.println(Estatisticas[2].cnome + " " + Estatisticas[2].acid);
         }
    }
}




