package logica;

import java.util.ArrayList;

public class Sistema {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
        
    }
}
