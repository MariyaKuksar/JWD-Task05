package by.epam.task05.reader;

import java.util.List;

import by.epam.task05.exception.LogisticsBaseException;

public interface CommonReader {
	List<String> readAll(String path) throws LogisticsBaseException;
}
