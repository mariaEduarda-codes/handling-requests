public class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Override
    public String toString() {
        return "CEP: " + this.cep + '\n'
                + "Logradouro: " + this.logradouro + '\n'
                + "Complemento: " + this.complemento + '\n'
                + "Bairro: " + this.bairro + '\n'
                + "Localidade: " + this.localidade + '\n'
                + "UF: " + this.uf + '\n'
                + "IBGE: " + this.ibge + '\n'
                + "Gia: " + this.gia + '\n'
                + "DDD: " + this.ddd + '\n'
                + "Siafi: " + this.siafi + '\n';
    }
}