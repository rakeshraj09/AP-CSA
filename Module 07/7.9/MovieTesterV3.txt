/**
 * @Sort list of movies by title, year, and studio
 *
 * @author Rakesh Raj
 * @version 3/09/25
 *
 */

public class MovieTesterV3
{
    public static void main(String[] args)
    {
        Movie[] movies = new Movie[10];
        movies[0]=new Movie("Avengers", 2012, "Marvel Studios");
        movies[1]=new Movie("The Revenge of the Sith", 2005, "LucasFilm");
        movies[2]=new Movie("Space Jam", 1996, "Very Real Studios");
        movies[3]=new Movie("Minions", 2016, "Universal");
        movies[4]=new Movie("Despicable Me 3", 2002, "ABC Pictures");
        movies[5]=new Movie("Dune", 2023, "XYZ Films");
        movies[6]=new Movie("Inception", 2025, "20th Century");
        movies[7]=new Movie("Tenet", 2019, "Paramount Pictures");
        movies[8]=new Movie("Lord of the Rings", 2009, "Warner Bros.");
        movies[9]=new Movie("The Amazing Spiderman 2", 2014, "Sony Pictures");

        System.out.println("Original array:");
        printArray(movies);
        printArray(sortTitle(movies, 1));
        printArray(sortTitle(movies, 2));
        printArray(sortYear(movies, 1));
        printArray(sortYear(movies, 2));
        printArray(sortStudio(movies, 1));
        printArray(sortStudio(movies, 2));
    }

    static void printArray(Movie[] myMovies) {
        System.out.println("Title                      Year                 Studio\n==================================================================");
        for(int i = 0; i < myMovies.length; i++) {
            System.out.printf("%-26s %-16d %-12s %n", myMovies[i].getTitle(), myMovies[i].getYear(), myMovies[i].getStudio());
        }
        System.out.println();
    }

    static Movie[] sortTitle(Movie[] myMovies, int order) {
        int posMax;
        Movie temp;
        if(order == 1) {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getTitle().compareTo(myMovies[posMax].getTitle()) > 0)
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by title in ascending order:");
            return myMovies;
        }
        else {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getTitle().compareTo(myMovies[posMax].getTitle()) < 0)
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by title in descending order:");
            return myMovies;
        }
    }

    static Movie[] sortYear(Movie[] myMovies, int order) {
        int posMax;
        Movie temp;
        if(order == 1) {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getYear() > myMovies[posMax].getYear())
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by year in ascending order:");
            return myMovies;
        }
        else {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getYear() < myMovies[posMax].getYear())
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by year in descending order:");
            return myMovies;
        }
    }

    static Movie[] sortStudio(Movie[] myMovies, int order) {
        int posMax;
        Movie temp;
        if(order == 1) {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getStudio().compareTo(myMovies[posMax].getStudio()) > 0)
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by studio in ascending order:");
            return myMovies;
        }
        else {
            for( int i = myMovies.length - 1; i >= 0; i--)
            {
                posMax = 0;
                for(int k = 0; k <= i; k++)
                {
                    if(myMovies[k].getStudio().compareTo(myMovies[posMax].getStudio()) < 0)
                    {
                        posMax = k;
                    }
                }
                temp = myMovies[i];
                myMovies[i] = myMovies[posMax];
                myMovies[posMax] = temp;
            }
            System.out.println("Movies sorted by studio in descending order:");
            return myMovies;
        }
    }
}
