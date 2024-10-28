package co.edu.ufps.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ufps.entities.Personal;
import co.edu.ufps.repositories.PersonalRepository;

@Service
public class PersonalService {

	@Autowired
	public PersonalRepository personalRepository;

	private List<Personal> Personal = new ArrayList<>();

	public List<Personal> getAllUsers() {
		return Personal;
	}

	public Personal getPersonalById(int id) {
		for (Personal p : Personal) {
			if (p.getId()==id) {
				return p;
			}
		}
		return null;
	}

	public void addUser(Personal p) {
		Personal.add(p);
	}

	public void updateUser(int id, Personal p) {
		for (int i = 0; i < Personal.size(); i++) {
			if (Personal.get(i).getId()==id) {
				Personal.set(i, p);
				break;
			}
		}
	}

	public void deleteUser(int id) {
		Personal.removeIf(user -> user.getId()==id);
	}

}
