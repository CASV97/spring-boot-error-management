package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.User;

@Service
public class UserServiceImpl implements UserService {
	private List<User> list;

	// poblando la lista de usuarios, lo normal es que vengan de una base de datos
	public UserServiceImpl() {
		this.list = new ArrayList<User>();
		this.list.add(new User(1, "Pablo", "Morales"));
		this.list.add(new User(2, "Pepa", "pig"));
		this.list.add(new User(3, "Maria", "LoLA"));
		this.list.add(new User(4, "LOQIENdo", "Rodrigez"));
		this.list.add(new User(5, "Amdre", "Morales"));
		this.list.add(new User(6, "Robie", "Morales"));
		this.list.add(new User(7, "Antop", "Morales"));
		this.list.add(new User(8, "Lorem", "PEpa"));
		this.list.add(new User(9, "APnca", "pancracio"));

	}

	@Override
	public List<User> getUsers() {
		return this.list;
	}

	@Override
	public User getUserById(Integer id) {
		User user = null;
		for (User u : list) {
			/*
			 * usamos equals por que int es un objeto y no el tipo de dato primitivo int se
			 * puede operar con == solamente cuando nuestra lista de objetos no supera los
			 * 128 elementos ya que java guarda estos 128 elementos como objeto y como valor
			 * en una cache de la maquina virtual
			 */
			if (u.getId().equals(id)) {
				user = u;
				break;
			}
		}
		return user;
	}

	@Override
	public Optional<User> getUserByIdOptional(Integer id) {
		User user = getUserById(id);
		// lo que hace de forma estatica es invocar el metodo of lo que hace es
		// convertir el objeto usuario independiente si es nulo o no
		return Optional.ofNullable(user);
	}

}
