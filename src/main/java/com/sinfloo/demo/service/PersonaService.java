package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.interfacesService.IpersonaService;
import com.sinfloo.demo.modelo.Persona;

@Service
public class PersonaService implements IpersonaService{

	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		int res= 0;
		Persona persona=data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
