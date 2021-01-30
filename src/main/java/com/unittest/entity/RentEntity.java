package com.unittest.entity;

import java.time.LocalDate;

public class RentEntity {

    private UserEntity user;
    private MovieEntity movie;
    private LocalDate locationDate;
    private LocalDate returnDate;
    private Double value;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public LocalDate getLocationDate() {
        return locationDate;
    }

    public void setLocationDate(LocalDate locationDate) {
        this.locationDate = locationDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
