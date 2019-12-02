
package strategyfactoryproxy;


public class ConteudoGoldEdtion implements Conteudo{
    
    Conteudo completo = new ConteudoCompleto();
    
    @Override
    public void iniciar() {
        System.out.println("Gold Edtion: DLC + Pack de armas Gold + Boost(XP + GOLD) ");
        this.completo.iniciar();
    }
    
}
