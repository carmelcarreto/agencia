package com.carmelcarreto.agencia.repository;

import com.carmelcarreto.agencia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Carmel
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}
