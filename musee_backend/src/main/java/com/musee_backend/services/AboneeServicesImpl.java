package com.musee_backend.services;

import com.musee_backend.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@AllArgsConstructor
@Service
@Transactional
public class AboneeServicesImpl implements AboneeServices {


    @Override
    public int deleteUser(long id) {
        return 0;
    }
}
