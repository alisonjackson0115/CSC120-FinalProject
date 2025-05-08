import com.google.common.graph.*;

public class cityMap {
   
  // cityMap(building hospital, building cityHall, building skyscraper, building greenhouse, building mall, building home) {

  // }

  building home = new building("Home", 15, 1, true, true, 0);
  building greenhouse = new building("City Greenhouse", 1, 1, false, false, 1);
  building cityHall = new building("City Hall", 3, 1, true, false, 3);
  building hospital = new building("City Hospital", 5, 1, true, false, 5);
  building skyscraper = new building("City Skyscraper", 50, 1, true, false, 2);
  building mall = new building("City Mall", 2, 1, true, false, 4);
  
    ImmutableGraph<building> myMap = GraphBuilder.undirected()
      .<building>immutable()
      .putEdge(hospital, cityHall)
      .putEdge(cityHall, skyscraper)
      .putEdge(skyscraper, greenhouse)
      .putEdge(greenhouse, home)
      .putEdge(home, cityHall)
      .putEdge(home, mall)
      .putEdge(mall, hospital)
      .build();

  public building getNeighbors(building current) {
    this.myMap.get(current).getAdjacent(Nodes());
  }
      
    
  }

