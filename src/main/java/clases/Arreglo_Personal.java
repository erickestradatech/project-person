package clases;

import java.util.ArrayList;

public class Arreglo_Personal {

    private ArrayList<Personal> lista;

    public Arreglo_Personal() {

        lista = new ArrayList();

        lista.add(new Medicos(101, "Alexander", 2012, "medicina", 3));
        lista.add(new Medicos(102, "Juan", 2014, "otorrino", 4));
        lista.add(new Servicios(103, "Fiorela", 2013, "rayos", 3));
        lista.add(new Medicos(104, "Alberto", 2016, "medicina", 3));
        lista.add(new Servicios(105, "Carla", 2019, "laboratorio", 5));
        lista.add(new Medicos(106, "Anna", 2016, "medicina", 2));
        lista.add(new Servicios(107, "Claudia", 2018, "rayos", 4));
        lista.add(new Medicos(108, "Jose", 2017, "medicina", 1));
        lista.add(new Servicios(109, "Sandra", 2019, "laboratorio", 5));

    }

    public void adi_Medicos(Medicos m) {

        lista.add(m);
    }

    public void adi_Servicios(Servicios s) {

        lista.add(s);
    }

    public ArrayList<Personal> listado() {

        return lista;
    }

    public Personal busca(int nro) {

        for (Personal x : lista) {

            if (x.getCodigo() == nro) {

                return x;
            }

        }
        return null;
    }

    public void borra(Personal per) {

        lista.remove(per);
    }

}
