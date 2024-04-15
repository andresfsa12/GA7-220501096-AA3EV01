package com.evidenciarframework.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.evidenciarframework.demo.modelo.Acudiente;

public interface IAcudiente extends CrudRepository<Acudiente, Integer> {

}
