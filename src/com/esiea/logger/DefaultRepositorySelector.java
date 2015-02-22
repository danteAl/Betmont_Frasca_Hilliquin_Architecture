package com.esiea.logger;

public class DefaultRepositorySelector implements RepositorySelector {

	  final LoggerManager repository;

	  public DefaultRepositorySelector(LoggerManager repository) {
	    this.repository = repository;
	  }

	  public LoggerManager getLoggerRepository() {
	    return repository;
	  }

}
