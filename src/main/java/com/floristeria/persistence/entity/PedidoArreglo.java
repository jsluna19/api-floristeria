package com.floristeria.persistence.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedido_arreglo")
public class PedidoArreglo {

    @EmbeddedId
    private PedidoArregloId id = new PedidoArregloId();

    @ManyToOne
    @MapsId("pedidoId")
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @MapsId("arregloId")
    @JoinColumn(name = "arreglo_id")
    private ArregloFloral arregloFloral;

    private Integer cantidad;

    @Column(precision = 10, scale = 2)
    private BigDecimal total;

    @CreationTimestamp
    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;
}
