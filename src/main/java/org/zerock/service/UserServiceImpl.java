package org.zerock.service;

import org.springframework.stereotype.Service;
import org.zerock.domain.UserVO;
import org.zerock.dto.LoginDTO;
import org.zerock.persistence.UserDAO;

import javax.inject.Inject;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserDAO dao;

    @Override
    public UserVO login(LoginDTO dto) throws Exception {
        return dao.login(dto);
    }
}
