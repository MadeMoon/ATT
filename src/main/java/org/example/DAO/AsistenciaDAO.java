package org.example.DAO;

import org.example.Models.AsistenciaModel;

import java.util.List;

public interface AsistenciaDAO {
    void crear (AsistenciaModel asistenciaModel);
    AsistenciaModel leer (int id);
    void actualizar (AsistenciaModel asistenciaModel);
    void eliminar (AsistenciaModel asistenciaModel);
    List<AsistenciaModel>listarTodos();
}
