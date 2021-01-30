package com.unittest.service;

import com.unittest.entity.MovieEntity;
import com.unittest.entity.RentEntity;
import com.unittest.entity.UserEntity;

import java.time.LocalDate;

public class RentService {

    public RentEntity rentMovie(UserEntity user, MovieEntity movie) throws Exception {
        if (movie.getStock() == 0) {
            throw new Exception("Filme sem estoque");
        }

        RentEntity rent = new RentEntity();
        rent.setUser(user);
        rent.setMovie(movie);
        rent.setLocationDate(LocalDate.now());
        rent.setValue(movie.getPrice());
        rent.setReturnDate(LocalDate.now().plusDays(1));

        System.out.println(rent);

        return rent;
    }

}
