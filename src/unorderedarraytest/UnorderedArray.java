package unorderedarraytest;

public class UnorderedArray {

    private Person[] a;
    private int nElems;
    
    public UnorderedArray(int max) {
	super();
	a = new Person[max];
	nElems = 0;
    }
    
    public Person find(String searchName) {
	int j;
	for(j=0; j<nElems;j++ ) 
	    if(a[j].getLastName().equals(searchName))
		break;
	if(j==nElems)
	    return null;
	else
	    return a[j];	
    }
    
    public void insert(String lastName,String firstName,int age) {
	a[nElems] = new Person(lastName,firstName,age);
	nElems++;
    }
    
    public boolean delete(String searchName) {
	int j;
	for(j=0;j<nElems;j++)
	    if(a[j].getLastName().equals(searchName))
		break;
	if(j==nElems)
	    return false;
	else {
	    for(int k = j;k<nElems;k++)
		a[k]=a[k+1];
	    nElems--;
	    return true;
	}
    }
    
    public void showArray() {
	for(int j = 0;j<nElems;j++)
	    a[j].showPerson();
    }
}
