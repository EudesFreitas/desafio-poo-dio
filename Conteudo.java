public abstract class Conteudo {
    protected static double XP_PADRAO = 10d;
    
    private String titulo;
    private String descricao;
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método abstrato para calcular o XP
    public abstract double calcularXp();
}
    
