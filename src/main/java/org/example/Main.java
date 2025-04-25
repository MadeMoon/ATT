package org.example;

import org.example.Models.AsistenciaModel;
import org.example.Models.EmpleadoModel;
import org.example.Models.HorarioModel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    EmpleadoModel empleado1 = new EmpleadoModel(1, "juan", "juanes", 123456789, 55556666, "juanjuanes@mail.com", 112233, "9 calle zona 10", 445566, 778899);
    EmpleadoModel empleado2 = new EmpleadoModel(2, "pepe", "pepes", 998877, 44556677, "pepe@mail.com", 112244, "10 calle zona 11", 778855, 112244);


    ArrayList<AsistenciaModel> registros = new ArrayList<>();
    registros.add(new AsistenciaModel(empleado1, LocalDate.now(), LocalTime.of(9,00), LocalTime.of(5,00)));


    }
}