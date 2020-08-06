/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diana
 */
public class Area {
      
    private int idarea;
    private String nombrearea;
    private String sede;
    private int oficina;
    private int presupueto;
    private String supervisor;

    public Area(int idarea, String nombrearea, String sede, int oficina, int presupueto, String supervisor) {
        this.idarea = idarea;
        this.nombrearea = nombrearea;
        this.sede = sede;
        this.oficina = oficina;
        this.presupueto = presupueto;
        this.supervisor = supervisor;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public int getPresupueto() {
        return presupueto;
    }

    public void setPresupueto(int presupueto) {
        this.presupueto = presupueto;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
