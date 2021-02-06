package io.erehsawsaltul.springcore.propsholder;

public class MyDAO {
	private String dbServer;
	private String dbPort;
	private String dbUser;
	private String dbPass;

	MyDAO(String dbServer,
			String dbPort,
			String dbUser,
			String dbPass
			) {
		this.dbServer = dbServer;
		this.dbPort = dbPort;
		this.dbUser = dbUser;
		this.dbPass = dbPass;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + ", dbPort=" + dbPort + ", dbUser=" + dbUser + ", dbPass=" + dbPass + "]";
	}


}
