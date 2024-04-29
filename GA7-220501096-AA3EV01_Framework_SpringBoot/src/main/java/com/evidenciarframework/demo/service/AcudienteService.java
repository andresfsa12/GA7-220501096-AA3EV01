package com.evidenciarframework.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evidenciarframework.demo.interfaces.IAcudiente;
import com.evidenciarframework.demo.interfaceservice.IAcudienteService;
import com.evidenciarframework.demo.modelo.Acudiente;

@Service
public class AcudienteService implements IAcudienteService{
	
	@Autowired
	private IAcudiente data;
	@Override
	public List<Acudiente> listar() {
		// TODO Auto-generated method stub
		return (List<Acudiente>)data.findAll();
	}

	@Override
	public Optional<Acudiente> listarId(int ID) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Acudiente p) {
		int res=0;
		Acudiente persona=data.save(p);
		if(persona.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int ID) {
		// TODO Auto-generated method stub
		
	}
	

}
