package uk.ac.cam.ch.wwmm.chemicaltagger.roles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NamedEntityWithRoles {

	private String namedEntity;
	private List<Role> roles;

	public NamedEntityWithRoles(String namedEntity) {
		this.namedEntity = namedEntity;
	}

	public String getNamedEntity() {
		return namedEntity;
	}

	public void addRole(Role role) {
		if (roles == null) roles = new ArrayList<Role>();
		roles.add(role);
	}

	public List<Role> getRoles() {
		if (roles == null) return Collections.emptyList();
		return Collections.unmodifiableList(roles);
	}

}
