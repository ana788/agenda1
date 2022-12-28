package agenda.classes;

public class Usuario {

    public static boolean conectado;
    public static int id_usuario;

    public Usuario() {
    }

    public static boolean isConectado() {
        return conectado;
    }

    public static void setConectado(boolean conectado) {
        Usuario.conectado = conectado;
    }

    public static int getId_usuario() {
        return id_usuario;
    }

    public static void setId_usuario(int id_usuario) {
        Usuario.id_usuario = id_usuario;
    }

}
