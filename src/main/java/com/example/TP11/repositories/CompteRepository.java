package com.example.TP11.repositories;

import com.example.TP11.entities.Compte;
import com.example.TP11.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "comptes", collectionResourceRel = "comptes", itemResourceRel = "compte")
public interface CompteRepository extends JpaRepository<Compte, Long> {

    @RestResource(path = "byType")
    List<Compte> findByType(@Param("t") TypeCompte type);
}

