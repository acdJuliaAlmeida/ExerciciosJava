import Carro.Carro;
import Conta.ContaBancaria;
import Jogador.Jogador;
import Lampada.Lampada;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Exercicio 1 - VRUMMMMmmm");
        
        //instancia uouou
        Carro carro = new Carro("Wolkswagen", "Polo", 2021);
        //exibindo infos slk
        System.out.println(carro.exibirinfo());

        System.out.println("Exercicio 2 - Genesis 1:3");

        
        Lampada lampada = new Lampada("incompreensivel à olhos mortais");
        //exibe
        System.out.println(lampada.mostrarLampada());
        //liga e exibe
        lampada.ligarLampada();
        System.out.println(lampada.mostrarLampada());
        //des liga e mostra 
        lampada.desligarLampada();
        System.out.println(lampada.mostrarLampada());

        System.out.println("Exercicio 3 - fazendo contas");

        ContaBancaria conta = new ContaBancaria("Juca da Silva");

        //exibindo a parada
        conta.mostrarSaldo();
        conta.sacar(10); //falhando em sacar a parada
        
        conta.depositar(20);//depositando a parada
        conta.mostrarSaldo();

        conta.depositar(50);//mais deposito de paradas
        conta.mostrarSaldo();
        
        conta.sacar(10); //sacando a parada
        conta.mostrarSaldo();


        System.out.println("Exercicio 4 - PvP franco");

        Jogador nuncaErrou = new Jogador("Garrosh Grito Infernal", 1000, 300);
        Jogador tiltaAi = new Jogador("Sha da Raiva", 5000, 100);

        nuncaErrou.mostrarStatus();
        tiltaAi.mostrarStatus();

        nuncaErrou.atacar(tiltaAi);
        tiltaAi.atacar(nuncaErrou);

        nuncaErrou.mostrarStatus();
        tiltaAi.mostrarStatus();


    }
}
