package com.juliana.entrega__tres;

public class Usuario {
    private String Nombre;
    private String Correo;
    private String Mensaje;
    private String Hora;
    private int Imagen;

    public Usuario(String nombre,String correo,String mensaje,String hora,int imagen) {
        Nombre = nombre;
        Correo = correo;
        Mensaje = mensaje;
        Hora=hora;
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }


    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }
    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }



}
