package logica;

import java.util.ArrayList;

public class ArrayUsuarios {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> nuevaLista) {
        usuarios = nuevaLista;
    }

    public static void agregarUsuario(Usuario u) {
        usuarios.add(u);
    }
}
