package extraej5.Entidades;

public class Mes {
    private String[] meses;
    private String secreto;

    public Mes() {
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        secreto = meses[4];
    }

    public String[] getMeses() {
        return meses;
    }
    public void setMeses(String[] meses) {
        this.meses = meses;
    }
    public String getSecreto() {
        return secreto;
    }
    public void setSecreto(String secreto) {
        this.secreto = secreto;
    }
}