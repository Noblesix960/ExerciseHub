package tracciaOnePiece;

class Pirata implements Comparable<Pirata> {
    private String nomeOriginale;
    private String soprannome;
    private String ruolo;
    private String sesso;
    private int eta;
    private String altezza;
    private long taglia;

    // Costruttore, metodi getter e setter, ecc.

    public Pirata(String nomeOriginale, String soprannome, String ruolo, String sesso, int eta, String altezza,
            long taglia) {
        this.nomeOriginale = nomeOriginale;
        this.soprannome = soprannome;
        this.ruolo = ruolo;
        this.sesso = sesso;
        this.eta = eta;
        this.altezza = altezza;
        this.taglia = taglia;
    }

    // Metodo per confrontare i pirati in base alla taglia
    @Override
    public int compareTo(Pirata other) {
        return Long.compare(other.getTaglia(), this.getTaglia());
    }

    @Override
    public String toString() {
        return "[Nome]: " + nomeOriginale + " [Soprannome]: " + soprannome + " [Ruolo]: " + ruolo
                + " [Sesso]: " + sesso + " [Età]: " + eta + " [Altezza]: " + altezza + " [Taglia]: " + taglia;
    }

    // Getter
    public String getAltezza() {
        return altezza;
    }

    public int getEta() {
        return eta;
    }

    public String getNomeOriginale() {
        return nomeOriginale;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getSesso() {
        return sesso;
    }

    public String getSoprannome() {
        return soprannome;
    }

    public long getTaglia() {
        return taglia;
    }

    public void setAltezza(String altezza) {
        this.altezza = altezza;
    }

    // Setter
    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setNomeOriginale(String nomeOriginale) {
        this.nomeOriginale = nomeOriginale;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public void setSoprannome(String soprannome) {
        this.soprannome = soprannome;
    }

    public void setTaglia(long taglia) {
        this.taglia = taglia;
    }
}