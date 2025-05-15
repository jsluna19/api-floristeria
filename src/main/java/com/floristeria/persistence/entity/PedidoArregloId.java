package com.floristeria.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoArregloId {

    @Column(name = "pedido_id")
    private Long pedidoId;

    @Column(name = "arreglo_id")
    private Long arregloId;
}
