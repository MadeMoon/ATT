package org.example.DAO;

import org.example.Models.HorarioModel;

import java.util.List;

public interface HorarioDAO {
    void crear (HorarioModel horarioModel);
    HorarioModel leer (int id);
    void actualizar (HorarioModel horarioModel);
    void eliminar (HorarioModel horarioModel);
    List<HorarioModel> listarTodos();
}
