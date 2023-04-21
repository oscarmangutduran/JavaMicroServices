package localhost.ejemplobootCamp.ejemplobootcamp.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

localhost.ejemplobootCamp.ejemplobootcamp.Model.SpringUsers;

/*
 * El repositorio nos proporciona los métodos
 * de acceso a datos como una extensión 
 * de JpaRepository o CrudRepository
 */
@Repository
public interface UserRepository extends JpaRepository<SpringUsers, Integer> {

	public List<SpringUsers> findAll();
	
	public SpringUsers findById(int id);
	
	public void delete(SpringUsers user);
	
	public void save(SpringUsers user);
}
