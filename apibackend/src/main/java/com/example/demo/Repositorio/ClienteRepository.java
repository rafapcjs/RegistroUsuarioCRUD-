package com.example.demo.Repositorio;
import com.example.demo.MODEL.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Modelo,Long> {
}
