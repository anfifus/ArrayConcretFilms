public class Film {
    private String title;
    private String directorName;
    private boolean isPorn;

    public Film(String title, String directorName, boolean isPorn) {
        this.title = title;
        this.directorName = directorName;
        this.isPorn = isPorn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public boolean isPorn() {
        return isPorn;
    }

    public void setPorn(boolean porn) {
        isPorn = porn;
    }
}
