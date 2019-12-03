package strategyfactoryproxy;

public class StrategyFactoryProxy {
    public static void main(String[] args) {
        Conteudo jogadorCasual = new ConteudoCompleto();
        Conteudo JogadorPremium = new ConteudoGoldEdtion();
        Sistema sistema = new Sistema();        
        
        
        System.out.println("Sistema de Premios de fim de temporada\n"
                + "Premios a partida de sua conta Steam\n"
                + "Jogadores Casual: Game completo\n"
                + "Jogadores Premium: Game completo + Gold Edtion"
                + "\n");
        GamesFactory GamesFactory = new GamesFactory();
        Games game = GamesFactory.criarGame("masseffect");
        sistema.setGames(game);
        sistema.mensagemSair();
        JogadorPremium.conteudo();

        
        
        
        
    }
    
}
