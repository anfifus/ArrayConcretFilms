import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOfFilms = writeNumberOfFilm();
        Film[] filmArray = new Film[numberOfFilms];
        int cont = 0;
        while (cont < filmArray.length) {
             filmArray[cont] =  createFilm(filmArray[cont]);
            cont++;
        }

        cont = 0;
        while (cont < filmArray.length) {
            showFilm(filmArray[cont]);
            cont++;
        }
      /*  boolean trueOrFalse = askRemoveFilms();
        if(trueOrFalse){
            removeAllFilms(filmArray);
        }
        else
        {
            //removeChooseFilm(filmArray);
        }*/
    }

    private static Film createFilm(Film film) {
        String title = askTitleFilm();
        String directorName = askDirectorName();
        boolean isPorn = askIsPorn();
        film = new Film(title, directorName, isPorn);
        return film;
    }

    private static void removeAllFilms(Film[] filmArray) {

    }

    private static boolean askRemoveFilms() {
        System.out.println("Do you want to remove all films?");
        Scanner scan = new Scanner(System.in);
        String isRemoveAll = scan.nextLine();
        if (isRemoveAll.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    private static int writeNumberOfFilm() {
        System.out.println("Write the number of films do you want to record");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static void showFilm(Film film) {
        System.out.println("The title of the film is: " + film.getTitle() + " the name director is: " + film.getDirectorName() + " and the film is " + printFilm(film.isPorn()) );
    }

    private static String printFilm(boolean value) {
        if(value == true) return ("Porn");
        else return ("No porn");
    }

    private static boolean askIsPorn() {

        String isSTRPorn = "";

        System.out.println("Write y or n");
        Scanner scan = new Scanner(System.in);
        isSTRPorn = scan.nextLine();

        if (isSTRPorn.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }

    private static String askDirectorName() {
        System.out.println("Write the name of the director");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static String askTitleFilm() {
        System.out.println("Write the title of the film");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
