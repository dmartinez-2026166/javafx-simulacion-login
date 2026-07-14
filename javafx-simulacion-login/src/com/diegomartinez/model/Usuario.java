package com.diegomartinez.model;

public class Usuario {

    private String nombreUsuario;
    private String password;
    private String nombreCompleto;
    private Rol rol;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String password, String nombreCompleto, Rol rol) {
        this.nombreCompleto = nombreCompleto;
        this.password = password;
        this.nombreUsuario = nombreUsuario;
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRole(Rol rol) {
        this.rol = rol;
    }

}
