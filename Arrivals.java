import java.util.LinkedList;

public class Arrivals
{
  private LinkedList<Node> flights;
  
  public Arrivals()
  {
    flights = new LinkedList<Node>();
  }
  
  public void addFlight(String fn, int at)
  {
    //Node n = new Node(fn, at);
    //addNode(n);
    addNode(new Node(fn, at));
  }
  
  private void addNode(Node n)
  {
    boolean placed = false;
    for (int i = 0; i < flights.size(); i++)
    {
      if (flights.get(i).getFlightTime() > n.getFlightTime())
      {
        flights.add(i, n);
        placed = true;
        break;
      }
    }
    if (!placed)
      flights.addLast(n);
  }
  
  public String toString()
  {
    String s = "";
    for (int i = 0; i < flights.size(); i ++)
    {
      s += "Flight name: " + flights.get(i).getFlightName() + "\t Flight time: " + flights.get(i).getFlightTime() + "\t";
    }
    return s;
  }
  
  public void changeArrivalTime(String fn, int at)
  {
    //find string
    int index = 0;
    for (int i = 0; i < flights.size(); i++)
    {
      if (flights.get(i).getFlightName().equals(fn))
      {
        flights.get(i).changeArrivalTime(at);
        index = i;
        break;
      }
    }
    boolean placed = false;
    for (int i = 0; i < flights.size(); i++)
    {
      if (flights.get(i).getFlightTime() > flights.get(index).getFlightTime())
      {
        flights.add(i, flights.get(index));
        placed = true;
        break;
      }
    }
    if (!placed)
      flights.addLast(flights.get(index));
    flights.remove(index);
  }
  
  //remove from list since it has already landed
  public void landed(String fn, int at)
  {
    //find string
    for (int i = 0; i < flights.size(); i++)
    {
      if (flights.get(i).getFlightName().equals(fn))
      {
        flights.remove(i);
        i = flights.size();
      }
    }
  }
  
}