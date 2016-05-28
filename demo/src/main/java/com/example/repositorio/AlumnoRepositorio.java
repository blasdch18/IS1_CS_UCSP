package com.example.repositorio;

import java.util.Arrays;
import com.example.dominio.Alumno;
import java.util.List;

public class AlumnoRepositorio {
	Alumno [] data ={
			new Alumno("Juan","Perez",16),
			new Alumno("Maria","Castro",14),
			new Alumno("Jose","Ruiz",18),
			new Alumno("Abel","Zapallo",19),
			new Alumno("Bertho","Retrettt",15),
			new Alumno("Chavo","Ochoa",02),
			
	};
	public List<Alumno> listar (){
		return Arrays.asList(data);
	}
	
}
