package unorderedarraytest;

public class UnorderedArrayTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int maxSize = 100; 
	UnorderedArray arr = new UnorderedArray(maxSize);
	
	arr.insert("杨", "峻", 22);
	arr.insert("郭", "东征", 21);
	arr.insert("李", "竞峰", 22);
	arr.insert("万", "基准", 18);
	arr.insert("Kobe", "Bryant", 39);
	arr.insert("习", "近平", 55);
	
	arr.showArray();
	
	String searchName = "万";
	Person p = arr.find(searchName);
	if(p!=null) {
	    System.out.print("已找到："+searchName);
	    p.showPerson();
	}else {
	    System.out.println("未找到："+searchName);
	}
	
	System.out.println("删除“李竞峰”后");
	
	arr.delete("李");
	
	arr.showArray();
    }

}
