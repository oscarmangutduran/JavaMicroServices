package localhost.ejemplobootCamp.ejemplobootcamp.Users;


import java.util.List;

import localhost.ejemplobootCamp.ejemplobootcamp.Model.SpringUsers;


/*
 * Esta interface obliga a desarrollar los métodos
 * en una clase ServiceImpl llamanado a la 
 * clase Repository 
 */
public interface UserService {

	public List <SpringUsers> findAll();
	public SpringUsers getUserById(int id);
	public void deleteUser(SpringUsers user);
}
