package strategyfactoryproxy;

public class GamesFactory {
    public Games criarGame(String game){
        if(game.equalsIgnoreCase("NierAutomata")){
            return new NierAutomata();
        }if(game.equalsIgnoreCase("DevilMyCry5")){
            return new DevilMyCry5();
        }if(game.equalsIgnoreCase("residentEvil2")){
            return new residentEvil2();
        }if(game.equalsIgnoreCase("MassEffect")){
            return new MassEffect();
        }else{
            return new NaoEncontrado();   
        }
    }
}
