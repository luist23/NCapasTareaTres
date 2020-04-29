package com.uca.capas.modelo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Alumno;
import com.uca.capas.modelo.domain.Usuario;


@Controller
public class AlumnoController {
	
	@RequestMapping("/ingresar")
	public ModelAndView indexTareaTres() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("alumno", new Alumno());
		mav.setViewName("tareas/tareaTres/index");
		return mav;
	}
	
	
	@RequestMapping("/ingresarAlumnoValidator")
	public ModelAndView procesar2(@Valid @ModelAttribute Alumno alumno, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) { //Hay errores, redirigimos a la pantalla del formulario
			mav.setViewName("tareas/tareaTres/index");
		}
		else { //Si no hay, flujo normal
			mav.setViewName("tareas/tareaTres/resultado");
		}
		return mav;
	}

}