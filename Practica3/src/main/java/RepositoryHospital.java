import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryHospital extends CrudRepository<dimHOSPITAL, String> {
}
