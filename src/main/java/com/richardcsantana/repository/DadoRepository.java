package com.richardcsantana.repository;

import com.richardcsantana.model.Dado;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by richardsantana on 24/03/16.
 */
public interface DadoRepository extends CrudRepository<Dado, Long> {
}
