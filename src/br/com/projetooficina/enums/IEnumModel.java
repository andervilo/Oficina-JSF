package br.com.projetooficina.enums;

import java.io.Serializable;

public interface IEnumModel<T extends Serializable> {

	T getValor();

	String getDescricao();

}