package newsapp_package;

public class Queries {
	
	private static String show = "select  *  from newsapp;";
	public static String getShow() {
		return show;
	}

	public static void setShow(String show) {
		Queries.show = show;
	}

	private static String add = "insert into newsapp (title,details,photo) values(?,?,?)";
	public static String getAdd() {
		return add;
	}

	public static void setAdd(String add) {
		Queries.add = add;
	}

	private static String addtitle = "update newsapp set title = ? where id =?;";
	private static String addesc = "update newsapp set details = ? where id =?;";
	private static String addurl = "update newsapp set photo = ? where id =?;";
	
	public static String getAddtitle() {
		return addtitle;
	}

	public static void setAddtitle(String addtitle) {
		Queries.addtitle = addtitle;
	}

	public static String getAddesc() {
		return addesc;
	}

	public static void setAddesc(String addesc) {
		Queries.addesc = addesc;
	}

	public static String getAddurl() {
		return addurl;
	}

	public static void setAddurl(String addurl) {
		Queries.addurl = addurl;
	} 
	
	

}
