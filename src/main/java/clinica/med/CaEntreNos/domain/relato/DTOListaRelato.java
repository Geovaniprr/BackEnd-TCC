package clinica.med.CaEntreNos.domain.relato;

import java.time.LocalDateTime;

public record DTOListaRelato(Long id, String descricao, String status, Tipo tipo, LocalDateTime data) {

    public DTOListaRelato(Relato relato) {
        this(
                relato.getId(),
                relato.getDescricao(),
                relato.getStatus(),
                relato.getTipo(),
                //relato.getAluno() != null ? relato.getAluno().getId() : null, // Verificação de null
                relato.getData()
        );
    }

}