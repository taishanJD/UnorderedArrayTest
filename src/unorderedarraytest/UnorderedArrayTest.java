package unorderedarraytest;

public class UnorderedArrayTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int maxSize = 100; 
	UnorderedArray arr = new UnorderedArray(maxSize);
	
	arr.insert("��", "��", 22);
	arr.insert("��", "����", 21);
	arr.insert("��", "����", 22);
	arr.insert("��", "��׼", 18);
	arr.insert("Kobe", "Bryant", 39);
	arr.insert("ϰ", "��ƽ", 55);
	
	arr.showArray();
	
	String searchName = "��";
	Person p = arr.find(searchName);
	if(p!=null) {
	    System.out.print("���ҵ���"+searchName);
	    p.showPerson();
	}else {
	    System.out.println("δ�ҵ���"+searchName);
	}
	
	System.out.println("ɾ������塱��");
	
	arr.delete("��");
	
	arr.showArray();
    }

}
