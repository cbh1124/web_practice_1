package algol;

import com.hierynomus.smbj.SMBClient;

public class smbtest {
	
	String user = "pi";
	String pass = "1234";
	String address = "goldcon.ddns.net";
	String sharedFolder = "pi";
	String inputPath = "\\172.30.1.43\pi\Desktop\지니어스 시즌 2\";
	
	SMBClient client = new SMBClient();

    try (Connection connection = client.connect(address)) {
        AuthenticationContext ac = new AuthenticationContext(user, pass.toCharArray(), null);
        Session session = connection.authenticate(ac);

        // Connect to Share
        try (DiskShare share = (DiskShare) session.connectShare(address)) {
            for (FileIdBothDirectoryInformation f : share.list(pi, "*.TXT")) {
                System.out.println("File : " + f.getFileName());
            }
        }
    }


}
