import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTiempo extends CrudRepository<dimTIEMPO, Integer> {
}
