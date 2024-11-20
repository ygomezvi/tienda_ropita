package ar.edu.davinci.dvds20231cg2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.davinci.dvds20231cg2.domain.VentaTarjeta;

@Repository
public interface VentaTarjetaRepository extends JpaRepository<VentaTarjeta, Long> {
}
