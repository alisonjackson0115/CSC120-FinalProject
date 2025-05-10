import com.google.common.graph.*;

public class CityMap {
   
  // cityMap(building hospital, building cityHall, building skyscraper, building greenhouse, building mall, building home) {

  // }

  Building home = new Building("Home", 15, 1, true, true, 0);
  Building greenhouse = new Building("City Greenhouse", 1, 1, false, false, 1);
  Building cityHall = new Building("City Hall", 3, 1, true, false, 3);
  Building hospital = new Building("City Hospital", 5, 1, true, false, 5);
  Building skyscraper = new Building("City Skyscraper", 50, 1, true, false, 2);
  Building mall = new Building("City Mall", 2, 1, true, false, 4);
  
    ImmutableGraph<Building> myMap = GraphBuilder.undirected()
      .<Building>immutable()
      .putEdge(hospital, cityHall)
      .putEdge(cityHall, skyscraper)
      .putEdge(skyscraper, greenhouse)
      .putEdge(greenhouse, home)
      .putEdge(home, cityHall)
      .putEdge(home, mall)
      .putEdge(mall, hospital)
      .build();

  // public Building getNeighbors(Building current) {
  //   this.myMap.get(current).getAdjacent(Nodes());
  // }
      
    
  }

