package com.mycompany.videoteca;

public class Videoteca{

    public static void main(String[] args){
        Plataforma tri=Plataforma.n64;
        Genero mario=Genero.plataformas;
        Juego m64=new Juego(1,"Super Mario 64",tri,1997,mario,"Nintendo");
        System.out.println(m64);
        m64.setRank(2);
        System.out.println(m64.getRank());
    }
}
