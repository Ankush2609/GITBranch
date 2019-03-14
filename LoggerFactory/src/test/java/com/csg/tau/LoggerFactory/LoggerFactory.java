package com.csg.tau.LoggerFactory;

import org.slf4j.Logger;

public class LoggerFactory {
  public static void main(String[] args) {
    //Logger logger = LoggerFactory.getLogger(LoggerFactory.class);
    Logger logger = org.slf4j.LoggerFactory.getLogger(LoggerFactory.class);
    logger.info("Hello World");
  }
}
