package ar.edu.davinci.dvds20231cg2.service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ar.edu.davinci.dvds20231cg2.domain.Prenda;
import ar.edu.davinci.dvds20231cg2.domain.TipoPrenda;
import ar.edu.davinci.dvds20231cg2.exceptions.BusinessException;

public interface PrendaService {
	Prenda save(final Prenda prenda) throws BusinessException;
	Prenda update(final Prenda prenda) throws BusinessException;
	void delete(final Prenda prenda);
	void delete(final Long id);
	Prenda findById(final Long id) throws BusinessException;
	
	List<Prenda> list();
	Page<Prenda> list(Pageable pageable);
	
	long count();
	
	List<TipoPrenda> getTipoPrendas();

}
