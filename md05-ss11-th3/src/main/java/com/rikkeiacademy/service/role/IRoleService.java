package com.rikkeiacademy.service.role;

import com.rikkeiacademy.model.Role;
import com.rikkeiacademy.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}

