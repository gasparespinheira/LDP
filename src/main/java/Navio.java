/**
 *
 * @author GasparEspinheira
 */
public class Navio {
    private String matricula;
    private String nome;
    private float comprimento;

    /**
     * 
     * @param matricula
     * 
     */
    public Navio(String matricula) {
        this.matricula = matricula;
    }

    /**
     * criação de um get de "Matricula"
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * criação de um get de "Nome"
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * criação de um get de "Comprimento"
     * @return
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * criação de um set de "Nome"
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * criação de um set de "comprimento"
     * @param comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
}