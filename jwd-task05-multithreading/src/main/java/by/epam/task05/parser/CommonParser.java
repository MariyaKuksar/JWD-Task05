package by.epam.task05.parser;

import java.util.List;

import by.epam.task05.entity.Truck;
import by.epam.task05.exception.LogisticsBaseException;

public interface CommonParser {
	List<Truck> parse(List<String> data) throws LogisticsBaseException;
}
