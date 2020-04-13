import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPaciente extends CrudRepository<dimPACIENTE, Integer> {
}
