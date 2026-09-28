public class OrdemServico {
    private int codigo;
    private String cliente;
    private String veiculo;
    private String placaVeiculo;
    private String data;
    private String ordem;
    private double valorEstimado;
    private String status;
    private Servico servico;

    public OrdemServico(int codigo, String cliente, String veiculo, String placaVeiculo, String data, double valor, Servico servico) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.placaVeiculo = placaVeiculo;
        this.data = data;
        this.valorEstimado = valor;
        this.status = "aberta";
        this.servico = servico;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void mostrarOrdem() {
        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + cliente);
        System.out.println("Veículo: " + veiculo);
        System.out.println("Placa: " + placaVeiculo);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Valor: R$ " + valorEstimado);
        System.out.println("Serviço: " + servico);

    }
}



