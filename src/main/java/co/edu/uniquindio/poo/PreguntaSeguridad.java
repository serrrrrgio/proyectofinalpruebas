package co.edu.uniquindio.poo;


public enum PreguntaSeguridad {
    PET_NAME("¿Cuál es el nombre de tu mascota?"),
    FAVORITE_COLOR("¿Cuál es tu color favorito?"),
    CHILDHOOD_NICKNAME("¿Cuál es tu apodo de infancia?"),
    BEST_FRIEND("¿Cuál es el nombre de tu mejor amigo(a) en la escuela?");

    private final String question;

    PreguntaSeguridad(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return question;
    }
}
