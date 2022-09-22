package guru.springframework.sfgVetclinic.services;

import guru.springframework.sfgVetclinic.model.Vet;
import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long Id);
    
    Vet save(Vet vet);
    
    Set<Vet> findAll();
}
