import java.util.ArrayList;
import java.util.List;

public class Box {
    private int numero;
    private String tipoServico;
    private int capacidadeMax;
    private String localizacao;
    private Mecanico mecanico;
    private List<OrdemServico> ordemServico = new ArrayList<>();

    public Box(int numero, String tipoServico, int capacidadeMax, String localizacao) {
        this.numero = numero;
        this.tipoServico = tipoServico;
        this.capacidadeMax = capacidadeMax;
        this.localizacao = localizacao;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public List<OrdemServico> getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(List<OrdemServico> ordemServico) {
        this.ordemServico = ordemServico;
    }

    public void adicionarOrdem(ordemServico ordem) {
        if (ordemServico.size() >= capacidadeMax) {
            System.out.println("Box está cheio!");
        }else{
            ordemServico.add(ordem);

        }
    }

    public void listarOrdens() {
        for (OrdemServico servico = ordemServico){
            servico.getServico();
            getMecanico();
            getNumero();
        }

        System.out.println("Total de serviços: " + ordemServico.size());
    }

    public void associarMecanico(Mecanico mecanico) {
        if(mecanico.getEspecialidade().equals(this.tipoServico)){
            this.mecanico = mecanico;
        }else{
            System.out.println("Mecânico de outra área!!!");
        }

    }
}


