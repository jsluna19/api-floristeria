package com.floristeria.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "arreglos_florales")
public class ArregloFloral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arreglo_floral_id")
    private Long arregloFloralId;

    private Integer cantidad;

    private BigDecimal valor;

    @Lob // Indica que este campo es de tipo LOB (Large Object)
    private String descripcion;

    // otros campos...

    @OneToMany(mappedBy = "arregloFloral", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PedidoArreglo> pedidoArreglos = new ArrayList<>();

    // fechas

    @CreationTimestamp
    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    @Column(name = "fecha_modificacion")
    private LocalDateTime fechaModificacion;
}
