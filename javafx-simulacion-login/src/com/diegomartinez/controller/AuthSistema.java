package com.diegomartinez.controller;

import com.diegomartinez.model.Rol;
import com.diegomartinez.model.Usuario;
import java.util.ArrayList;

public class AuthSistema {

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public AuthSistema() {
        Usuario usuarioAdmin = new Usuario("admin", "1234", "ADMIN", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user", "5678", "USER", Rol.USER);
        Usuario usuarioYo = new Usuario("Diego", "166", "Diego Martinez", Rol.ADMIN);

        listaUsuarios.add(usuarioAdmin);
        listaUsuarios.add(usuarioUser);
        listaUsuarios.add(usuarioYo);
    }

    public Usuario login(String nombreUsuario, String clave) {
        for (Usuario usuarioBuscado : listaUsuarios) {
            if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                    && usuarioBuscado.getPassword().equals(clave)) {
                return usuarioBuscado;
            }
        }

        return null;
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        AuthSistema.listaUsuarios = listaUsuarios;
    }

}
