
package strategyfactoryproxy;


public class ConteudoGoldEdtion implements Conteudo{
    
    Conteudo completo = new ConteudoCompleto();
    
    @Override
    public void conteudo() {
        System.out.println("Gold Edtion: DLC + Pack de armas Gold + Boost(XP + GOLD) ");
        this.completo.conteudo();
    }
    
}
