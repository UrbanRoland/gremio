package com.gremio.repository;


import com.gremio.model.Role;
import com.gremio.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole roleName);
}
