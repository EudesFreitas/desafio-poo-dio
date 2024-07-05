import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String titulo;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(30);
    private Set<Participante> participantes = new HashSet<>();
    private Set<Sessao> sessoes = new LinkedHashSet<>();

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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public Set<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(Set<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    // Override equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp workshop = (Bootcamp) o;
        return Objects.equals(titulo, workshop.titulo) &&
               Objects.equals(descricao, workshop.descricao) &&
               Objects.equals(dataInicio, workshop.dataInicio) &&
               Objects.equals(dataFim, workshop.dataFim) &&
               Objects.equals(participantes, workshop.participantes) &&
               Objects.equals(sessoes, workshop.sessoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, dataInicio, dataFim, participantes, sessoes);
    }
}
