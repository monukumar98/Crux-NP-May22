package Lec43;

public class Map_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("Raj", 78);
		map.put("Ankit", 76);
		map.put("Sohan", 78);
		map.put("Kunal", 56);
		map.put("Pooja", 45);
		map.put("Anish", 89);
		map.put("Raj", -78);
		System.out.println(map.get("Rahul"));
		System.out.println(map.get("Raj"));
		System.out.println(map.ContainsKey("Ankita"));
		System.out.println(map.ContainsKey("Ankit"));
		System.out.println(map);
		System.out.println(map.remove("Raj"));
		System.out.println(map);

	}

}
