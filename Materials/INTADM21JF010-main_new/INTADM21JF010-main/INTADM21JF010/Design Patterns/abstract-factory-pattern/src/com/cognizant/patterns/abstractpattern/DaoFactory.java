package com.cognizant.patterns.abstractpattern;

public abstract class DaoFactory {
  public abstract Dao createDao(String type);
}
