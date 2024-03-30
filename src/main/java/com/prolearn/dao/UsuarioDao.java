
package com.prolearn.dao;

import com.prolearn.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
    @Query("SELECT u FROM Usuario u WHERE u.correoUsuario = :correoUsuario AND u.contraUsuario = :contraUsuario")
    Usuario findByCorreoAndContra(@Param("correoUsuario") String correoUsuario, @Param("contraUsuario") String contraUsuario);
    
}
