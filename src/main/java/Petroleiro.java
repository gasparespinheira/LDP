/**
 *
 * @author GasparEspinheira
 */
public class Petroleiro extends Navio {
    private float carga;

    /**
     * 
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     * criação de um get de "carga"
     * @return
     */
    public float getCarga() {
        return carga;
    }

    /**
     * criação de um set de "carga"
     * @param carga
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }
    
    
}
