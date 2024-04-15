package com.evidenciarframework.demo.interfaceservice;

import java.util.List;
import java.util.Optional;

import com.evidenciarframework.demo.modelo.Acudiente;

public interface IAcudienteService {
	public List<Acudiente>listar();
	public Optional<Acudiente>listarId(int ID);
	public int save (Acudiente p);
	public void delete(int ID);
}
