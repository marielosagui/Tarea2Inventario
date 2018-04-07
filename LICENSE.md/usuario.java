package inventario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class usuario {
	private String user,pass;
	private int id;
	
    /**
     *
     * @param user
     * @param pass
     */
    public usuario(String user, String pass )//int id
	{
		this.user=user;
		this.pass=pass;
		this.id=id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
