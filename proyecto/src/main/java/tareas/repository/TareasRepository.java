package tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tareas.model.Tarea;


public interface TareasRepository extends JpaRepository<Tarea, Long> {

}
