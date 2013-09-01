package co.tclab.patterns.creational.abstractFactory.impl;

class LocalMode implements Local {
	public DataInfo[] loadDB(String name) {
		System.out.print("Load from a local database ");
		return null;
	}
}