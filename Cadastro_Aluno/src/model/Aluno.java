package model;

public class Aluno {
    String pnome;
    String unome;
    int pontos;
 
    
    public Aluno(){
        this("" ,"" , 0 );
    }
    public Aluno(String pnomealuno, String unomealuno, int pontos_aluno){
        pnome = pnomealuno;
        unome = unomealuno;
        pontos = pontos_aluno;

    }
    public String getPnome(){
        return pnome;
       
    }
    public void setPnome(String pnome){
        this.pnome = pnome;
    }
    public String getUnome(){
        return unome;
       
    }
    public void setUnome(String unome){
        this.unome = unome;
    }
    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
     
     }
   