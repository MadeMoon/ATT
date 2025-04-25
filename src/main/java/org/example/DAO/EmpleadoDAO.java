package org.example.DAO;

import org.example.Models.EmpleadoModel;

import java.util.List;

public interface EmpleadoDAO {
    void crear(EmpleadoModel empleadoModel);
    EmpleadoModel leer (int id);
    void actualizar (EmpleadoModel empleadoModel);
    void elimiar (EmpleadoModel empleadoModel);
    List<EmpleadoModel> listarTodos();

}
