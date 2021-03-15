/**
 *
 * @author GasparEspinheira
 */
public class PortaContentores extends Navio {
    
    private int noContentores;
    
    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     * criação de um get "NumContentores"
     * @return
     */
    public int getNoContentores() {
        return noContentores;
    }

    /**
     * criação de um set "NumContentores"
     * @param noContentores
     */
    public void setNoContentores(int noContentores) {
        this.noContentores = noContentores;
    }
    
    
}
