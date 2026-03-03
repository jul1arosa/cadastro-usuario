package com.soulutions.cadastro_usuario.infrastructure.repository;

import com.soulutions.cadastro_usuario.infrastructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
