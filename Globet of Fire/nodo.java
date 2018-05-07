package globet;

public class nodo 
{
	int school;
	int id;
	
	nodo next = null;
        
	public nodo() {}
	
	public nodo(int school, int id)
	{
		this.school = school;
		this.id = id;
	}
        
	public String atoString()
	{
		return "" + this.school + "\t" + this.id + "\n";
	}
        
        public nodo clone()
	{
		nodo temp = new nodo(this.school,this.id);
		return temp;
	}
}
