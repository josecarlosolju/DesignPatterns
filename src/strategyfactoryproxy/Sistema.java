package strategyfactoryproxy;

public class Sistema {
    public Games games;
    
    public void mensagemSair(){
        games.sair();
    }
    
   public void setIdioma(Games games){
       this.games = games;
   }
}
