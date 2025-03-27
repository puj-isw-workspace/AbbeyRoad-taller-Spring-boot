package tareas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Tarea {
    @Id
    @GeneratedValue
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @ToString
    
    Long id;

    String descripcion;

    String detalles;

    boolean completado;

}
