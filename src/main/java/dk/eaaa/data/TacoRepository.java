package dk.eaaa.data;

import org.springframework.data.repository.CrudRepository;

import dk.eaaa.model.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
