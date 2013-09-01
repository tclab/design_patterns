package co.tclab.patterns.creational.abstractFactory.impl;

//The Abstract Factory
interface ConnectionFactory {
	Local getLocalConnection();
	Remote getRemoteConnection();
}
