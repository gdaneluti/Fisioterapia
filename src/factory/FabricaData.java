package factory;

import entity.Data;

public class FabricaData {
	private FabricaData() {
	}

	public static FabricaData nova() {
		return new FabricaData();
	}

	public Data novaData(Integer hora, Integer dia) {
		return Data.nova(hora, dia);
	}
}
