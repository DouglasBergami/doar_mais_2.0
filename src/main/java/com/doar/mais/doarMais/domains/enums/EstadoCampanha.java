package com.doar.mais.doarMais.domains.enums;

public enum EstadoCampanha {

    PENDENTE(1, "Pendente"),
    ENCERRADO(2, "Encerrado");

    private int cod;
    private String descricao;

    private EstadoCampanha(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoCampanha toEnum(Integer cod) {

        if (cod == null) {
            return null;
        }

        for (EstadoCampanha ec : EstadoCampanha.values()) {
            if (cod.equals(ec.getCod())) {
                return ec;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }

}
