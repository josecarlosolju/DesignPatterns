package strategyfactoryproxy;

public class GamesFactory {
    public Games criarIdioma(String pais){
        if(pais.equalsIgnoreCase("NierAutomata")){
            return new NierAutomata();
        }if(pais.equalsIgnoreCase("DevilMyCry5")){
            return new DevilMyCry5();
        }if(pais.equalsIgnoreCase("residentEvil2")){
            return new residentEvil2();
        }if(pais.equalsIgnoreCase("MassEffect")){
            return new MassEffect();
        }
        
        
        else{
            return new NaoEncontrado();   
        }
    }
}
