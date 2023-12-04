package com.example.login;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String DNI;
    private Integer edat;

    public Usuario(String nombreUsuario, String contrasena, String DNI, Integer edat) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.DNI = DNI;
        this.edat = edat;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getDNI() {
        return DNI;
    }

    public Integer getEdat() {
        return edat;
    }
}
