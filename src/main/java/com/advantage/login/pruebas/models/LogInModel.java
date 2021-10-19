package com.advantage.login.pruebas.models;

import com.advantage.login.pruebas.utils.LeerFicheros;

import java.io.IOException;

public class LogInModel {

    LeerFicheros leerExcel = new LeerFicheros();
    String user;
    String password;
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String ruta, String hoja, int colunma, int fila) {
        try {
            this.url = leerExcel.leerDatoExcelCaracter(hoja, ruta, colunma, fila);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setUser(String ruta, String hoja, int colunma, int fila) {
        try {
            this.user = leerExcel.leerDatoExcelCaracter(hoja, ruta, colunma, fila);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setPassword(String ruta, String hoja, int colunma, int fila) {
        try {
            this.password = leerExcel.leerDatoExcelCaracter(hoja, ruta, colunma, fila);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
