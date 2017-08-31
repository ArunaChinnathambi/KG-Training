public class Sample
{
    int x, y, z;
    String name;
    boolean flag;
 
    private Sample()
    {
        x = 5;
        y = 10;
        z = 15;
        flag = true;
    }
 
    public Sample(string Name)
    {
        //flag, x, y, and z are initialized here
        name = Name;
		this(name, true);
    }
 
    public Sample(string Name, bool flag)
    {
        //name, flag, x, y, and z are initialized here, but we need to change flag
        this.flag = flag;
    }
}