package com.projeto.board_tarefa.dto;

import com.projeto.board_tarefa.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
