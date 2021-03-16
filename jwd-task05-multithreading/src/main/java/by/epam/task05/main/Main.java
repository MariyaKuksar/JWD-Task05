package by.epam.task05.main;

import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.task05.entity.Truck;
import by.epam.task05.exception.LogisticsBaseException;
import by.epam.task05.parser.CommonParser;
import by.epam.task05.parser.impl.DataParserImpl;
import by.epam.task05.reader.CommonReader;
import by.epam.task05.reader.impl.DataReaderImpl;

public class Main {
	public static Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		try {
			CommonReader reader = new DataReaderImpl();
			List<String> data = reader.readAll("resources/data/truck.txt");
			CommonParser parser = new DataParserImpl();
			List<Truck> trucks = parser.parse(data);
			for (Truck truck : trucks) {
				truck.start();
			}
		} catch (LogisticsBaseException e) {
			logger.log(Level.ERROR, e.getMessage());
		}
	}
}