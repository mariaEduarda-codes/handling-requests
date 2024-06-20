import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String resposta;
        do {
            System.out.print("Digite o CEP que deseja buscar: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            Cep cep = new Cep(input);
            GerenciadorRequisicoes gerenciador = new GerenciadorRequisicoes(cep);

            HttpResponse<String> response = gerenciador.getResponse();

            ConversorJson conversor = new ConversorJson();
            Endereco endereco = conversor.converterJson(response);
            System.out.println(endereco);

            System.out.print("Deseja salvar a consulta como arquivo JSON? \nDigite 1 para Sim \nDigite qualquer tecla para Não: ");
            resposta = sc.nextLine();

            SalvarComoJson salvar = new SalvarComoJson();
            salvar.escolhaSalvarComoJson(resposta, endereco);

            System.out.print("Deseja realizar nova consulta? \nDigite 1 para Sim \nDigite qualquer tecla para Não: ");
            resposta = sc.nextLine();
        } while (resposta.equals("1"));

    }
}