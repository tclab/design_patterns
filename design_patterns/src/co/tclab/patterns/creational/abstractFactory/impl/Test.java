package co.tclab.patterns.creational.abstractFactory.impl;

//Use the following Test class to test the above classes
class Test {
	public static void main(String[] args) {
		DataManager dm = new DataManager();
		DataInfo[] di = null;
		String dbFileName = "db.db";
		if (args.length == 1) {
			// assume local is set to true
			dm.setConnection(true);
			LocalMode lm = (LocalMode) dm.getLocalConnection();
			di = lm.loadDB(dbFileName);
		} else {
			// Note: dm.local = false is default setting
			RemoteMode rm = (RemoteMode) dm.getRemoteConnection();
			rm.connect2WWW("www.javacamp.org/db/");
			di = rm.loadDB(dbFileName);
		}
		// use one set of methods to deal with loaded data.
		// You don't need to worry about connection from this point.
		// Like di.find(), di.search() etc.
	}
}
