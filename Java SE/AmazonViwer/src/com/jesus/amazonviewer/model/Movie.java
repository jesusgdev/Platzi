package com.jesus.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * <h1>Movie</h1>
 * <p>
 * La clase Movie hereda de {@link Film} e implementa de {@link IVisualizable}
 * y nos permite visualizar el catologo de peliculas a traves de metodo
 * {@code makeMovieList} y visualizar las peliculas con el metodo abstracto
 * {@code view()} y ademas conocer cuales peliculas ya hemos visto.
 * </p>
 *
 * @author Drakj
 * @version 1.1
 * @since 2020
 * */

public class Movie extends Film implements IVisualizable{
    private int id;
    private int timeViwed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        setYear(year);
    }


    public int getId() {
        return id;
    }

    public int getTimeViwed() {
        return timeViwed;
    }

    public void setTimeViwed(int timeViwed) {
        this.timeViwed = timeViwed;
    }

    @Override
    public String toString() {
        return "\n::: MOVIE :::" +
                "\nTitle: " + getTitle() +
                "\nGenre: " + getGenre() +
                "\nYear: " + getYear() +
                "\nCreator: " + getCreator() +
                "\nDuration: " + getDuration();
    }

    /**
     * {@inheritDoc}
     * */

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    /**
     * {@inheritDoc}
     * */

    @Override
    public void stopToSee(Date dataI, Date dateF) {
        if (dateF.getTime() > dataI.getTime()) {
            setTimeViwed((int) (dateF.getTime() - dataI.getTime()));
        } else {
            setTimeViwed(0);
        }
    }

    public static ArrayList<Movie> makeMovieList() {
        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            movies.add(new Movie("Movie: " + i, "Genero: " +
                    i, "Creador: " + i, 120 + i,
                    (short)(2017 + i)));
        }
        return movies;
    }

    /**
     * {@inheritDoc}
     * */

    @Override
    public void view() {
        setViewed(true);
        Date dateI = startToSee(new Date());

        for (int i = 0; i < 100000; i++) {
            System.out.println("☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻☻");
        }

        //Termine de verla
        stopToSee(dateI, new Date());
        System.out.println("");
        System.out.println("Viste: " + toString());
        System.out.println("Por: " + getTimeViwed() + " milisegundos");
    }
}
