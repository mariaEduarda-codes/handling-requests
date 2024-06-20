public record Endereco(String cep,
                       String logradouro,
                       String complemento,
                       String bairro,
                       String localidade,
                       String uf,
                       String ibge,
                       String gia,
                       String ddd,
                       String siafi) {

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