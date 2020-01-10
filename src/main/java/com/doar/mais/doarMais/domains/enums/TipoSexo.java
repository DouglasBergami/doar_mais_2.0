package com.doar.mais.doarMais.domains.enums;

public enum TipoSexo {

    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private int cod;
    private String descricao;

    private TipoSexo(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoSexo toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (TipoSexo ts : TipoSexo.values()) {
            if (cod.equals(ts.getCod())) {
                return ts;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);

    }
}

