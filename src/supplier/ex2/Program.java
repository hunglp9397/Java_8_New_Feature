package supplier.ex2;

public class Program {
    private String language;
    private int experience;

    public Program() {
        this.language = "java";
        this.experience = 5;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Program(String language, int experience) {
        this.language = language;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Program{" +
                "language='" + language + '\'' +
                ", experience=" + experience +
                '}';
    }

    public static String getDefaultLanguage(){
        return "Java";
    }
}
