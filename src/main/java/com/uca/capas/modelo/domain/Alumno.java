package com.uca.capas.modelo.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Alumno {
	
	@Size(min=1, max=25, message = "El campo nombre debe tener una longitud entre 1 y 25 caracteres.")
	@NotEmpty
	String nombre;
	
	@Size(min=1, max=25, message = "El campo nombre debe tener una longitud entre 1 y 25 caracteres.")
	@NotEmpty
	String apellido;
	
	//@Size(min=1, max=25, message = "El campo usuario debe tener una longitud entre 1 y 25 caracteres.")
	@NotEmpty
	Date fechaN;
	
	@Size(min=1, max=25, message = "El campo usuario debe tener una longitud entre 1 y 25 caracteres.")
	String direccionN;
	
	@Size(min=1, max=25, message = "El campo usuario debe tener una longitud entre 1 y 100 caracteres.")
	String Insti;
	
	@Pattern(regexp = "[0-9]{8}")
	String celular;
	
	@Pattern(regexp = "[0-9]{8}")
	String telefono;
}
