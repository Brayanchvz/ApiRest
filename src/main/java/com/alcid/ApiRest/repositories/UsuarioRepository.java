package com.alcid.ApiRest.repositories;

import java.util.ArrayList;

import com.alcid.ApiRest.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
     public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);


}
