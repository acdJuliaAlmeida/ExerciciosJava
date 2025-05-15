import Aluno.Aluno;
import Carro.Carro;
import Conta.ContaBancaria;
import Jogador.Jogador;
import Lampada.Lampada;
import Livro.Livro;
import Pessoa.Pessoa;
import Produto.Produto;
import Termometro.Termometro;

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

        System.out.println("\nEncapsulamento 14/05\nExercicio 1 - CPF (Criando Pessoa Fisica)\n");

        Pessoa p = new Pessoa();

        //setano
        p.setNome("Fulano de Tal");
        p.setIdade(-30);
        p.setIdade(30);

        //getano
        System.out.println("Nome obtido pelo getNome(): " + p.getNome());
        System.out.println("Idade obtida pelo getIdade(): " + p.getIdade());


        System.out.println("\nExercicio 2 - O gerente (não) enlouqueceu!!!!!\n");
    
        Produto produto = new Produto();

        produto.setNomeProduto("Notebook");
        System.out.println("Nome do Produto: " + produto.getNomeProduto());

        //gerente enlouqueceu
        produto.setPreco(-500.00);

        //gerente desenlouqueceu
        produto.setPreco(2500.00);
        System.out.println("Preço do Produto: R$ " + produto.getPreco());

        System.out.println("\nExercicio 3 - Fisica zzzZZZZ\n");
        Termometro termometro = new Termometro();

        termometro.setTemperaturaCelsius(-300);

        termometro.setTemperaturaCelsius(30);
        System.out.println("Temperatura C "+ termometro.getTemperaturaCelsius()+"°");
    
        System.out.println("\nExercicio 4 - LagrimasAluno.exe\n");

        Aluno aluno = new Aluno();

        aluno.setNota(-4);
        aluno.setNota(5.9);

        System.out.println("Nota: " + aluno.getNota());
        System.out.println("Aluno chora? " + (aluno.aprovado() ? "Sim" : "Não"));


        System.out.println("\nExercicio 5 - ziiuUUMMNMMMMMNNM\n");

        Carro c = new Carro("Wolkswagen", "Saveiro", 2021);

        c.acelerar(60);
        System.out.println("Velociade Km/h" + c.getVelocidade());
        c.Desacelerar(30);
        System.out.println("Velociade Km/h" + c.getVelocidade());
        c.Desacelerar(80);
        System.out.println("Velociade Km/h" + c.getVelocidade());

        System.out.println("\nExcicio 6 - Kindle\n");

        Livro livroInsano = new Livro("1984", "George Orwell", 400);

        livroInsano.lerLivro(40);
        System.out.println(livroInsano.progressoLeitura() +"%");
        livroInsano.lerLivro(300);
        System.out.println(livroInsano.progressoLeitura() +"%");
        
        livroInsano.lerLivro(100);
        System.out.println(livroInsano.progressoLeitura() +"%");

    }

}
