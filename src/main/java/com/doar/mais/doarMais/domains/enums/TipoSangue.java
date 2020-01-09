package com.doar.mais.doarMais.domains.enums;

public enum TipoSangue {

    O_POSITIVO(1, "O+"),
    A_POSITIVO(2, "A+"),
    B_POSITIVO(3, "B+"),
    AB_POSITIVO(4, "AB+"),
    O_NEGATIVO(5, "O-"),
    A_NEGATIVO(6, "A-"),
    B_NEGATIVO(7, "B-"),
    AB_NEGATIVO(8, "AB-");

    private int cod;
    private String descricao;

    private TipoSangue(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoSangue toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (TipoSangue ts : TipoSangue.values()) {
            if (cod.equals(ts.getCod())) {
                return ts;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);

    }
}
