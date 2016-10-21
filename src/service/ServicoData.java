package service;

import entity.Data;
import factory.FabricaData;

public class ServicoData {
	public ServicoData() {
	}

	public Data nova(Integer comeco, Integer fim) {
		return FabricaData.nova().novaData(comeco, fim);
	}
}
