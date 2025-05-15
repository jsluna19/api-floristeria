package com.floristeria.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "destinatarios")
public class Destinatario {

    @Id
    @Column(name = "destinatario_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long destinatarioId;

    private String nombre;

    @Column(name = "telefono_fijo")
    private String telefonoFijo;

    private String celular;

    private String ciudad;

    private String sector;

    private String direccion;

    @CreationTimestamp
    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;

    @OneToMany(mappedBy = "destinatario", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();

}
