package com.evidenciarframework.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evidenciarframework.demo.modelo.Acudiente;

@Repository
public interface IAcudiente extends CrudRepository<Acudiente, Integer> {

}
