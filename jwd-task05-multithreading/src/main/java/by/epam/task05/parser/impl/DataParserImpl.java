package by.epam.task05.parser.impl;

import java.util.ArrayList;
import java.util.List;

import by.epam.task05.entity.Truck;
import by.epam.task05.exception.LogisticsBaseException;
import by.epam.task05.parser.CommonParser;

public class DataParserImpl implements CommonParser {
	public static final String DATA_SPLIT = " ";

	@Override
	public List<Truck> parse(List<String> data) throws LogisticsBaseException {
		if (data == null) {
			throw new LogisticsBaseException("data is null");
		}
		List<Truck> trucks = new ArrayList<>();
		for (String lineData : data) {
			String[] numberTruckAndTypeGoods = lineData.split(DATA_SPLIT);
			int numberTruck = Integer.parseInt(numberTruckAndTypeGoods[0]);
			Truck.TypeOfGoods typeOfGoods = Truck.TypeOfGoods.valueOf(numberTruckAndTypeGoods[1]);
			Truck truck = new Truck(numberTruck, typeOfGoods);
			trucks.add(truck);
		}
		return trucks;
	}
}
